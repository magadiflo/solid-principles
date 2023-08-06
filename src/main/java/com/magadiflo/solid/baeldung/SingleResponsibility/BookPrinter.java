package com.magadiflo.solid.baeldung.SingleResponsibility;

public class BookPrinter {
    public void printTextToConsole(String text) {
        System.out.println("text = " + text);
    }

    public void printTextToAnotherMedium(String text) {
        System.out.println("text = " + text);
    }
}
