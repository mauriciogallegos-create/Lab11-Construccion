package com.tecsup.lab01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void sumar_dosNumeros_devuelveSuma() {
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado, "2 + 3 debe ser 5");
    }

    @Test
    public void dividir_diezEntreDos_devuelveCinco() {
        int a = 10;
        int b = 2;

        int resultado = calculadora.dividir(a, b);

        assertEquals(5, resultado, "10 / 2 debe ser 5");
    }

    @Test
    public void dividir_entreCero_lanzaExcepcion() {
        int a = 10;
        int b = 0;

        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(a, b);
        }, "Dividir entre cero debe lanzar IllegalArgumentException");
    }

    @Test
    public void esPositivo_numeroPositivo_devuelveTrue() {
        int numero = 7;

        boolean resultado = calculadora.esPositivo(numero);

        assertTrue(resultado, "Un número mayor a 0 debe devolver true");
    }

    @Test
    public void esPositivo_numeroNegativo_devuelveFalse() {
        int numero = -4;

        boolean resultado = calculadora.esPositivo(numero);

        assertFalse(resultado, "Un número menor a 0 debe devolver false");
    }

    @Test
    public void esPositivo_casoLimiteCero_devuelveFalse() {
        int numero = 0;

        boolean resultado = calculadora.esPositivo(numero);

        assertFalse(resultado, "El número 0 no es positivo, debe devolver false");
    }
}
