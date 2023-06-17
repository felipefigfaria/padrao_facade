package org.example;

public class PlacaMae extends ItemComputador {

    private static PlacaMae placaMae = new PlacaMae();

    private PlacaMae() {};

    public static PlacaMae getInstancia() {
        return placaMae;
    }
}
