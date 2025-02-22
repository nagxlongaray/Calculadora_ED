package javabean;

import java.util.Scanner;

/**
 * Clase resta
 * @author Raquel Garcia Salinas
 * @profile https://github.com/raquelgs02
 * Version 1.0
 */

public class Resta {
    private double acumulado = 0;

    /**
     * Metodo para restar de dos números reales
     * @param num1 Minuendo
     * @param num2 Sustraendo
     * @return Devuelve el resultado de la resta de dos numeros reales
     */
    public double restarReales (double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Metodo para restar dos números enteros
     * @param num1 Minuendo
     * @param num2 Sustraendo
     * @return Devuelve el resultado de la resta de dos numeros enteros
     */
    public int restarEnteros(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Metodo para restar de tres números reales
     * @param num1 Primer número
     * @param num2 Segundo número
     * @param num3 Tercer número
     * @return Devuelve el resultado de la resta de tres numeros reales
     */
    public double restarTresReales(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    /**
     * Realiza una resta acumulativa. El valor acumulado se guarda internamente en la clase.
     *
     * @param numero número a restar del valor acumulado.
     * @return nuevo valor acumulado después de la resta.
     */
    public double restarAcumulado(double numero) {
        this.acumulado -= numero;
        return this.acumulado;
    }

    /**
     * Obtiene el valor acumulado actual.
     *
     * @return valor acumulado.
     */
    public double getAcumulado() {
        return acumulado;
    }

    /**
     * Reinicia el valor acumulado a cero.
     */
    public void resetAcumulado() {
        this.acumulado = 0;
    }

    public static void menu() {
        // Crear un objeto Scanner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear la clase Resta
        Resta resta = new Resta();

        // Menú interactivo para probar los métodos de la clase Resta
        System.out.println("___ Calculadora de Resta ___");
        while (true) {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1. Resta de dos números reales");
            System.out.println("2. Resta de dos números enteros");
            System.out.println("3. Resta de tres números reales");
            System.out.println("4. Resta acumulativa");
            System.out.println("5. Ver valor acumulado");
            System.out.println("6. Resetear valor acumulado");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número real: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número real: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + resta.restarReales(num1, num2));
                    break;

                case 2:
                    System.out.print("Introduce el primer número entero: ");
                    int int1 = scanner.nextInt();
                    System.out.print("Introduce el segundo número entero: ");
                    int int2 = scanner.nextInt();
                    System.out.println("Resultado: " + resta.restarEnteros(int1, int2));
                    break;

                case 3:
                    System.out.print("Introduce el primer número real: ");
                    double real1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número real: ");
                    double real2 = scanner.nextDouble();
                    System.out.print("Introduce el tercer número real: ");
                    double real3 = scanner.nextDouble();
                    System.out.println("Resultado: " + resta.restarTresReales(real1, real2, real3));
                    break;

                case 4:
                    System.out.print("Introduce el número a restar del acumulado: ");
                    double acumular = scanner.nextDouble();
                    System.out.println("Nuevo valor acumulado: " + resta.restarAcumulado(acumular));
                    break;

                case 5:
                    System.out.println("Valor acumulado actual: " + resta.getAcumulado());
                    break;

                case 6:
                    resta.resetAcumulado();
                    System.out.println("Valor acumulado reiniciado a 0.");
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
    }
}

