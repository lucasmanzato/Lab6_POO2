package org.example;

public class Main {
    public Main() {
    }

    public static void main(String... args) {
        CET cet = new CET();
        PrefeituraUdi pref = new PrefeituraUdi();
        cet.addObservers(pref);
        cet.setUmidade(30.0);
        cet.setUmidade(10.0);
        Aeroporto aero = new Aeroporto();
        cet.addObservers(aero);
    }
}
