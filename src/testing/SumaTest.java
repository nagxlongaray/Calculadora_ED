package testing;

import javabean.Suma;

import static org.junit.jupiter.api.Assertions.*;


class SumaTest {

    // Declaramos la variable suma
    private Suma suma;

    /**
     * Metodo que se ejecuta antes de cada test.
     * Aquí inicializamos la instancia de Suma para que cada test tenga un objeto nuevo.
     */

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        suma = new Suma();
    }

    /**
     * Test para comprobar la suma de dos números reales (double).
     */
    @org.junit.jupiter.api.Test
    void sumar() {
        double resultado = suma.sumar(3.6, 3.5);
        assertEquals(7.1, resultado);
    }

    /**
     * Test para comprobar la suma de tres números enteros (int).
     */
    @org.junit.jupiter.api.Test
    void testSumar() {
        int resultado = suma.sumar(8,8);
        assertEquals(16, resultado);
    }

    /**
     * Test para comprobar la suma de tres números reales (double).
     */
    @org.junit.jupiter.api.Test
    void testSumar1() {
        double resultado = suma.sumar(2.5, 3.5, 4.5);
        assertEquals(10.5, resultado);
    }

    /**
     * Test para comprobar la funcionalidad de la suma acumulada.
     */
    @org.junit.jupiter.api.Test
    void sumarAcumulado() {
        suma.sumarAcumulado(5);
        suma.sumarAcumulado(4);
        assertEquals(9, suma.getAcumulado());
    }

    /**
     * Test para comprobar que el acumulado empieza en 0 y se actualiza correctamente.
     * Primero verificamos que el valor inicial es 0.
     * Luego sumamos 10 y comprobamos que el acumulado se ha actualizado.
     */
    @org.junit.jupiter.api.Test
    void getAcumulado() {
        assertEquals(0, suma.getAcumulado());
        suma.sumarAcumulado(10);
        assertEquals(10, suma.getAcumulado());
    }
}