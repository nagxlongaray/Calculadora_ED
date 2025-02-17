package javabean;

/**
 * Clase Suma
 *
 * @author Nagore Longaray
 * @profile https://github.com/nagxlongaray
 * @version 1.0
 */
public class Suma {

    // Atributo donde almacenamos el valor acumulado de la suma.
    private double acumulado = 0;

    /**
     * Este metodo, realiza la suma de dos números reales.
     *
     * @param num1 El primer número a sumar.
     * @param num2 El segundo número a sumar.
     * @return devuelve el resultado de los números reales sumados.
     */
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Realiza la suma de dos números enteros.
     *
     * @param num1 El primer número a sumar.
     * @param num2 El segundo número a sumar.
     * @return El resultado de la suma de los dos números enteros.
     */
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Este metodo, realiza la suma de tres números reales.
     *
     * @param num1 El primer número a sumar.
     * @param num2 El segundo número a sumar.
     * @param num3 El tercer número a sumar.
     * @return El resultado de la suma de los tres números reales.
     */
    public double sumar(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    /**
     * Este metodo, realiza la suma acumulada de un número con el valor actual acumulado.
     *
     * @param num El número a sumar al acumulado.
     * @return El nuevo valor acumulado después de la suma.
     */
    public double sumarAcumulado(double num) {
        acumulado += num;  // Acumula el valor
        return acumulado;
    }

    /**
     * Obtiene el valor acumulado.
     *
     * @return El valor actual acumulado.
     */
    public double getAcumulado() {
        return acumulado;
    }
}
