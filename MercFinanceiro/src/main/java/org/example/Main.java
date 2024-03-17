package org.example;

public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao("MercFin", 150.0);
        AcaoBroker broker = new AcaoBroker();

        Investidor investidor1 = new Investidor("Lucas", 150.0, 200.0, broker);
        Investidor investidor2 = new Investidor("Rafael", 100.0, 250.0, broker);

        acao.addObserver(investidor1);
        acao.addObserver(investidor2);

        acao.setPreco(210.0);
        acao.setPreco(95.0);

    }
}