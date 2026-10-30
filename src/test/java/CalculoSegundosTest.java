package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import gt.edu.umes.proy.calculo.LogicaDelNegocio;

class CalculoSegundosTest {

    @Test
    void detectaParametroQueNoEsEntero() {
        LogicaDelNegocio logica = new LogicaDelNegocio();
        String[] args = {"1", "3", "abc", "20", "1"};

        assertThrows(IllegalArgumentException.class,
                () -> logica.validarOLanzar(args));
    }

    @Test
    void calculaSegundosCorrectamente() {
        LogicaDelNegocio logica = new LogicaDelNegocio();

        long resultado = logica.calcularSegundos(1, 3, 6, 20, 1);

        assertEquals(4996860L, resultado);
    }
}