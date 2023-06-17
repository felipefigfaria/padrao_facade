package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {

    @Test
    void deveRetornarPlacaMaeComDefeito() {
        Computador computador = new Computador();
        PlacaMae.getInstancia().setItemDefeituoso(true);
        assertEquals(false, computador.ligar());
    }

    @Test
    void deveRetornarCpuComDefeito() {
        Computador computador = new Computador();
        Cpu.getInstancia().setItemDefeituoso(true);
        assertEquals(false, computador.ligar());
    }

    @Test
    void deveRetornarDiscoRigidoComDefeito() {
        Computador computador = new Computador();
        DiscoRigido.getInstancia().setItemDefeituoso(true);
        assertEquals(false, computador.ligar());
    }

    @Test
    void deveRetornarMemoriaComDefeito() {
        Computador computador = new Computador();
        Memoria.getInstancia().setItemDefeituoso(true);
        assertEquals(false, computador.ligar());
    }

    @Test
    void deveRetornarComputadorSemDefeito() {
        Computador computador = new Computador();
        assertEquals(true, computador.ligar());
    }
}