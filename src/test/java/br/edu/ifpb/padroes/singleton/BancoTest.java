package br.edu.ifpb.padroes.singleton;

import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by diogomoreira on 20/07/16.
 */
public class BancoTest {

    @org.junit.Test
    public void sacar() throws Exception {
        Banco b = Banco.getInstance();
        b.sacar(500d);
        Assert.assertEquals(4500d, b.getSaldoTotal(), 1.0);
    }

    @org.junit.Test
    public void depositar() throws Exception {
        Banco b = Banco.getInstance();
        b.depositar(500d);
        Assert.assertEquals(5500d, b.getSaldoTotal(), 1.0);
    }

}