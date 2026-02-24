package org.lessons.java.ciclabile;

public class Interi {
    private int[] interi;
    private int cont;
    private int rightNumber;
    private boolean ancoraElementi = true;

    // Metodi
    public Interi(int[] interi) {
        this.interi = interi;
    }

    public int getElementoSuccessivo() {
        rightNumber = interi[cont];
        cont++;
        return rightNumber;
    }

    public boolean hasAncoraElementi() {
        if(cont == interi.length) {
            ancoraElementi = false;
        }
        return ancoraElementi;
    }
}
