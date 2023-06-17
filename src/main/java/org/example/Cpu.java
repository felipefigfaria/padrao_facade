package org.example;

public class Cpu extends ItemComputador {

    private static Cpu cpu = new Cpu();

    private Cpu() {};

    public static Cpu getInstancia() {
        return cpu;
    }
}
