package org.example;

public class PrefeituraUdi implements Observer {
    public PrefeituraUdi() {
    }

    public void update(double temp, double umidade, double vento) {
        if (umidade < 20.0) {
            System.out.println("Defesa civil alerta: baixa umidade");
        }

    }
}

