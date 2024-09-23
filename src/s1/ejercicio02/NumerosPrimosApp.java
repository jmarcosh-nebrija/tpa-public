package s1.ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPrimosApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        boolean esEntero = true;

        do {
            try {
                System.out.print("\nIntroduzca un número entero: ");
                n = scan.nextInt();
                esEntero = true;

            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número entero.");
                scan.nextLine();
            }

        } while(!esEntero);

        NumerosPrimosApp app = new NumerosPrimosApp();
        System.out.println((app.esPrimo(n))?"Es primo": "No es primo");
    }

    private boolean esPrimo(int n) {
        boolean esPrimo = true;

        // Un número menos o igual a 1 no es primo
        if (n <= 1) {
            esPrimo = false;
        }

        // Verificamos la divisibilidad hasta la raiz cuadrada del numero
        for (int i = 2; i < n && esPrimo; i++) {
            if (n % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }
}
