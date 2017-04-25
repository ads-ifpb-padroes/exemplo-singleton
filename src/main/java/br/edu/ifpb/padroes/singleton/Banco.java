package br.edu.ifpb.padroes.singleton;

/**
 * Created by diogomoreira on 20/07/16.
 */
public class Banco {

    private double saldoTotal;
    private static Banco banco;

    private Banco() {
        saldoTotal = 5000d;
    }

    public static Banco getInstance() {
        if(banco == null)
            banco = new Banco();
        return banco;
    }

    public void depositar(double valor) {
        saldoTotal += valor;
    }

    public void sacar(double valor) {
        saldoTotal -= valor;
    }

    public double getSaldoTotal() {
        return this.saldoTotal;
    }

}