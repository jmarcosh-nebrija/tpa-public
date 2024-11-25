package nebrija.tpa.s1.ejercicio01;

import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {
        // Pedimos los números
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int x = input.nextInt();
        System.out.println("Introduzca otro número: ");
        int y = input.nextInt();
        input.close();

        // Creamos e inicializamos la calculadora
        Calculadora calculadora = new Calculadora();
        calculadora.setX(x);
        calculadora.setY(y);

        // Calculamos la suma y la mostramos por pantalla
        System.out.println("Suma: " + calculadora.suma());
    }

}
