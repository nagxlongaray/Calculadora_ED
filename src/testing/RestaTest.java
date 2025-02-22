package testing;

import javabean.Resta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaTest {

    private Resta resta;

    // Se ejecuta antes de cada prueba para inicializar el objeto Resta
    @BeforeEach
    void setUp() {
        resta = new Resta();
    }

    // Test para restarReales
    @Test
    void testRestarReales() {
        double resultado = resta.restarReales(10.5, 3.2);
        assertEquals(7.3, resultado);
    }

    // Test para restarEnteros
    @Test
    void testRestarEnteros() {
        int resultado = resta.restarEnteros(8, 3);
        assertEquals(5, resultado);
    }

    // Test para restarTresReales
    @Test
    void testRestarTresReales() {
        double resultado = resta.restarTresReales(10, 2, 1.5);
        assertEquals(6.5, resultado);
    }

    // Test para restarAcumulado
    @Test
    void testRestarAcumulado() {
        double primerResultado = resta.restarAcumulado(5);
        assertEquals(-5.0, primerResultado);

        double segundoResultado = resta.restarAcumulado(2.5);
        assertEquals(-7.5, segundoResultado);
    }

    // Test para resetValorAcumulado
    @Test
    void testResetValorAcumulado() {
        resta.restarAcumulado(5);
        resta.resetAcumulado();
        assertEquals(0.0, resta.getAcumulado());
    }

    // Test para verificar que getValorAcumulado devuelve 0 al inicio
    @Test
    void testGetValorAcumuladoInicial() {
        assertEquals(0.0, resta.getAcumulado());
    }

    // Test para manejar casos especiales: resta con cero
    @Test
    void testRestarConCero() {
        double resultadoReales = resta.restarReales(10, 0);
        assertEquals(10.0, resultadoReales);

        int resultadoEnteros = resta.restarEnteros(8, 0);
        assertEquals(8, resultadoEnteros);
    }

    // Test para manejar casos especiales: resta acumulativa con cero
    @Test
    void testRestarAcumuladoConCero() {
        double resultado = resta.restarAcumulado(0);
        assertEquals(0.0, resultado);
    }

    // Test para manejar casos especiales: números negativos
    @Test
    void testRestarNumerosNegativos() {
        double resultadoReales = resta.restarReales(-10, -3);
        assertEquals(-7.0, resultadoReales);

        int resultadoEnteros = resta.restarEnteros(-8, -3);
        assertEquals(-5, resultadoEnteros);
    }

    // Test para manejar casos especiales: tres números reales con negativos
    @Test
    void testRestarTresRealesConNegativos() {
        double resultado = resta.restarTresReales(-10, 2, -1.5);
        assertEquals(-8.5, resultado); // Resultado esperado: -10 + 2 - (-1.5) = -8.5
    }
}