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

    public Interi() {
        this.interi = new int[0];
    }

    public void addElemento(int elemento) {
        int[] newArray = new int[interi.length + 1];
        for(int i = 0; i < interi.length; i++) {
            newArray[i] = interi[i];
        }
        newArray[interi.length] = elemento;
        interi = newArray;
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
