package nebrija.tpa.examen.ejercicio2;

import nebrija.tpa.examen.ejercicio2.participante.ParticipanteRegular;
import nebrija.tpa.examen.ejercicio2.participante.ParticipanteVIP;
import nebrija.tpa.examen.ejercicio2.registro.Registro;

import java.io.IOException;

/**
 * Clase principal que ejecuta la aplicación de registro de participantes en la fiesta.
 * Permite agregar participantes y realizar la serialización y deserialización del registro.
 */
public class Main {

    /**
     * Metodo principal que actúa como punto de entrada de la aplicacion.
     *
     * @param args argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        try {
            // Obtiene la instancia única del registro
            Registro registro1 = Registro.getInstancia();

            // Agregar algunos participantes y guardar registro
            registro1.agregarParticipante(new ParticipanteRegular("Juan", 20));
            registro1.agregarParticipante(new ParticipanteVIP("Ana", 25));
            registro1.guardarRegistro();

            // Cargar el registro y mostrar participantes
            Registro registro2 = Registro.getInstancia();
            registro2.cargarRegistro();
            registro2.mostrarParticipantes();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}