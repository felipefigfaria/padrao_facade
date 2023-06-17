package org.example;

public abstract class ItemComputador {

    private boolean ItemDefeituoso = false;

    public void setItemDefeituoso(boolean ItemDefeituoso) {
        this.ItemDefeituoso = ItemDefeituoso;
    }

    public boolean verificarItemDefeituoso() {
        return this.ItemDefeituoso;
    }
}