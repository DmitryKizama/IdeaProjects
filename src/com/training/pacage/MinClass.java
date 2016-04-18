package com.training.pacage;


class Outer {

    public String word = "Outer";

    private class InnerPrivate {
        public static final int field = 23;
        private String word;

        InnerPrivate() {
            word = "Inner Private";
        }

        public String getWord() {
            return word;
        }
    }

    String getWord() {
        return new InnerPrivate().getWord();
    }

    public InnerPrivate getInnerPrivate(){
        return new InnerPrivate();
    }

    public InnerPublic getInnerPublic(){
        return new InnerPublic();
    }

    public class InnerPublic {
        public static final int field = 23;
        private String word;

        InnerPublic() {
            word = "Inner Private";
        }

        public String getWord() {
            return word;
        }
    }

}

public class MinClass {


    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.InnerPublic i = outer.getInnerPublic();
        outer.getInnerPrivate();
        System.out.println(Outer.InnerPublic.field);
        System.out.println(outer.getWord());
        System.out.println(i.getWord());
    }

}
