package org.lessons.java.ciclabile;

public class Main {
    public static void main(String[] args) {
        Interi array = new Interi();

        array.addElemento(3);
        array.addElemento(55);
        array.addElemento(6);
        array.addElemento(4);
        System.out.println(array.getElementoSuccessivo());
        System.out.println(array.getElementoSuccessivo());
        System.out.println(array.getElementoSuccessivo());
        System.out.println(array.getElementoSuccessivo());
        System.out.println(array.hasAncoraElementi());
    }
}
