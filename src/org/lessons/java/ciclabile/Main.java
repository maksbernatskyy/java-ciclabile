package org.lessons.java.ciclabile;

public class Main {
    public static void main(String[] args) {
        Interi array = new Interi(new int[]{44, 34, 3, 4, 5});

        System.out.println(array.getElementoSuccessivo());
        System.out.println(array.getElementoSuccessivo());
        System.out.println(array.getElementoSuccessivo());
        System.out.println(array.getElementoSuccessivo());
        System.out.println(array.getElementoSuccessivo());

        System.out.println(array.hasAncoraElementi());
    }
}
