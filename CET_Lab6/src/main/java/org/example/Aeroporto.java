package org.example;

public class Aeroporto implements Observer {
    public Aeroporto() {
    }

    public void update(double temp, double umidade, double vento) {
        if (vento > 100.0) {
            System.out.println("Alerta perigo");
        }

    }
}