package s1.ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciApp {

    public static void main(String[] args) {
        // Pedimos un número
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int x = input.nextInt();

        FibonacciApp app = new FibonacciApp();
        System.out.println("La serie de Fibonacci es:" );
        List<Integer> serie = app.obtenerSerieFibonacci(x);
        for (int i = 0; i < serie.size(); i++) {
            System.out.println("F(" + i + "): " + serie.get(i));
        }

        input.close();
    }

    private List<Integer> obtenerSerieFibonacci(int n) {
        List<Integer> serie = new ArrayList<>();
        serie.add(0);
        serie.add(1);

        for (int i = 2; i <= n; i++) {
            serie.add(serie.get(i - 1) + serie.get(i - 2));
        }
        return serie;
    }
}
