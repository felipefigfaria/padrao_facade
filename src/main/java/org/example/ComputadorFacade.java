package org.example;

public class ComputadorFacade {

    public static boolean ligarComputador() {
        if (PlacaMae.getInstancia().verificarItemDefeituoso()) {
            return false;
        }
        if (Cpu.getInstancia().verificarItemDefeituoso()) {
            return false;
        }
        if (DiscoRigido.getInstancia().verificarItemDefeituoso()) {
            return false;
        }
        if (Memoria.getInstancia().verificarItemDefeituoso()) {
            return false;
        }
        return true;
    }
}
