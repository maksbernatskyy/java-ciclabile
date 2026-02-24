package org.lessons.java.ciclabile;

public class Interi {
    private int[] interi = {6, 2, 3, 4, 5};
    private int cont ;
    private int rightNumber;
    private boolean ancoraElementi = true;
    // Metodi
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
