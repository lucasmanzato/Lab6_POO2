package org.example;

public class Investidor implements Observer{
    String nome;
    private double precoMinimo;
    private double precoMaximo;
    private AcaoBroker corretor;

    public Investidor(String nome, double precoMinimo, double precoMaximo, AcaoBroker corretor) {
        this.nome = nome;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
        this.corretor = corretor;
    }

    @Override
    public void update(double price) {
        if (price >= precoMaximo) {
            corretor.venderAcoes(this);
        }
    }
}