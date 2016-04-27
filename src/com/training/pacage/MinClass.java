package com.training.pacage;


class Outer {

}

abstract class D{}
class Iner extends Outer{
    D makeD(){
        return new D(){
            private String j = "sds";
            public String k = " dsdgdsf";
            public String getK(){
                return k;
            }
        };
    }
}



public class MinClass {

    public static void main(String[] args) {
        Iner iner = new Iner();
        iner.makeD();
    }

}
