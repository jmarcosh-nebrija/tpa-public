package nebrija.tpa.examen.ordinaria.a;

import nebrija.tpa.examen.ordinaria.a.core.GestorEstudiantes;
import nebrija.tpa.examen.ordinaria.a.view.GestionEstudiantesGUI;

import javax.swing.*;

/**
 * Clase que proporciona el punto de entrada al programa
 */
public class Main {

    /**
     * Punto de entrada al programa
     * @param args No se esperan argumentos
     */
    public static void main(String[] args) {
        GestorEstudiantes gestorEstudiantes = new GestorEstudiantes();
        SwingUtilities.invokeLater(() -> {
            GestionEstudiantesGUI app = new GestionEstudiantesGUI(gestorEstudiantes);
            app.setVisible(true);
        });
    }
}
