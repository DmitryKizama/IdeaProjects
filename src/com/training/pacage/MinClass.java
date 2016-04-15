package com.training.pacage;


abstract class Instrument {
    private int i;

    public abstract void play();

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();

}

class Wind extends Instrument {
    @Override
    public void play() {
        System.out.println("Wind.play");
    }

    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {

    }
}


class Percussion extends Instrument {
    @Override
    public void play() {
        System.out.println("Percussion.play");
    }

    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {

    }
}


class Brass extends Wind {
    @Override
    public void play() {
        System.out.println("Brass.play");
    }

    public void adjust() {
        System.out.println("Brass.adjust");
    }
}

class Woodwind extends Wind {
    @Override
    public void play() {
        System.out.println("Woodwind.play");
    }
    public String what() {
        return "Woodwind";
    }

}



public class MinClass {

    static void tune(Instrument i){
        i.play();
    }

    static void tuneAll(Instrument[] i){
        for (Instrument p: i) {
            tune(p);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestro = {new Wind(), new Brass(), new Percussion(), new Woodwind()};
        tuneAll(orchestro);

    }

}
