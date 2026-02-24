package org.lessons.java.ciclabile;

public class Interi {
    private int[] interi = {6, 2, 3, 4, 5};
    private int cont ;
    private int rightNumber;
    // Metodi
    public int getElementoSuccessivo() {
        rightNumber = interi[cont];
        cont++;
        return rightNumber;
    }
}
