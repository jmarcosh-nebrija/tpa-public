package nebrija.tpa.s1.ejercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumaNumerosApp {

    public static void main(String[] args) {

        SumaNumerosApp app = new SumaNumerosApp();
        List<Double> numeros = app.leerNumeros();
        System.out.println("La suma de los números es: " + app.sumaNumeros(numeros));
    }

    private List<Double> leerNumeros() {
        Scanner input = new Scanner(System.in);
        List<Double> numeros = new ArrayList();
        System.out.println("Introduce números (número negativo o letras para detener): ");

        // Bucle para recoger los números
        boolean entradaValida = true;
        while (entradaValida) {
            System.out.println("Número: ");

            // Verificar si es un número válido
            if (input.hasNextDouble()) {
                double numero = input.nextDouble();

                // Si es negativo, salimos
                if (numero < 0) {
                    System.out.println("Número negativo. Saliendo...");
                    entradaValida = false;
                } else {
                    // Es un número correcto, lo añadimos
                    numeros.add(numero);
                }
            } else {
                // No es un número correcto, salimos
                System.out.println("Entrada inválida. Saliendo...");
                entradaValida = false;
            }
        }

        input.close();

        return numeros;
    }

    private Double sumaNumeros(List<Double> numeros) {
        double suma = 0;
        for (Double numero : numeros) {
            suma += numero;
        }
        return suma;
    }
}
