package nebrija.tpa.s1.ejercicio04;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SumaNumerosAppHandleException {

    public static void main(String[] args) {

        SumaNumerosAppHandleException app = new SumaNumerosAppHandleException();
        List<Double> numeros = app.leerNumeros();
        System.out.println("La suma de los números es: " + app.sumaNumeros(numeros));
    }

    private List<Double> leerNumeros() {
        Scanner input = new Scanner(System.in);
        List<Double> numeros = new ArrayList<Double>();
        System.out.println("Introduce números (número negativo o letras para detener): ");

        // Bucle para recoger los números
        boolean entradaValida = true;
        while (entradaValida) {
            System.out.print("Número: ");

            try {
                // Verificar si es un número válido y lo añadimos
                double numero = input.nextDouble();
                if (numero < 0) {
                    // Si es negativo, salimos
                    System.out.println("Número negativo. Saliendo...");
                    entradaValida = false;
                } else {
                    // Es double positivo, lo añadimos
                    numeros.add(numero);
                }
            } catch (InputMismatchException e) {
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
