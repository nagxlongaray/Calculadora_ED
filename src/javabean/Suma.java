package javabean;

import java.util.Scanner;

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

    /**
     * Método que muestra un menú interactivo para realizar sumas.
     */
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        Suma calculadora = new Suma(); // Crear un objeto de la clase Suma

        int opcion;
        do {
            System.out.println("\nElige una opción del menú:");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Sumar tres números");
            System.out.println("3. Sumar al acumulado");
            System.out.println("4. Mostrar acumulado");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            // Leer la opción elegida
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número real: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo número real: ");
                    double num2 = sc.nextDouble();
                    double resultado = calculadora.sumar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    System.out.print("Introduce el primer número entero: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo número entero: ");
                    num2 = sc.nextDouble();
                    System.out.print("Introduce el tercer número: ");
                    double num3 = sc.nextDouble();
                    resultado = calculadora.sumar(num1, num2, num3);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    System.out.print("Introduce el número a sumar al acumulado: ");
                    double numAcumulado = sc.nextDouble();
                    double nuevoAcumulado = calculadora.sumarAcumulado(numAcumulado);
                    System.out.println("Nuevo acumulado: " + nuevoAcumulado);
                    break;

                case 4:
                    System.out.println("Valor acumulado actual: " + calculadora.getAcumulado());
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
