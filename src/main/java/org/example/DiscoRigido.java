package org.example;

public class DiscoRigido extends ItemComputador {

    private static DiscoRigido discoRigido = new DiscoRigido();

    private DiscoRigido() {};

    public static DiscoRigido getInstancia() {
        return discoRigido;
    }
}
