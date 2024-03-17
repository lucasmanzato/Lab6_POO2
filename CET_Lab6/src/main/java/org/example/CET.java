package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CET implements Sujeito {
    private List<Observer> observers = new ArrayList();
    private double temperatura;
    private double umidade;
    private double vento;

    public CET() {
    }

    public void addObservers(Observer obs) {
        this.observers.add(obs);
    }

    public void removeObserver(Observer obs) {
        this.observers.remove(obs);
    }

    public void notifyObservers() {
        Iterator var1 = this.observers.iterator();

        while(var1.hasNext()) {
            Observer o = (Observer)var1.next();
            o.update(this.temperatura, this.umidade, this.vento);
        }

    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        this.notifyObservers();
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
        this.notifyObservers();
    }
}

