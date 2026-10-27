package com.tecsup.lab01;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

    public boolean esPositivo(int n) {
        return n > 0;
    }
}
