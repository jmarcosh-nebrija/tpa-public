package nebrija.tpa.examen.ejercicio1;

import nebrija.tpa.examen.ejercicio1.view.PanelPrincipalPlanificadorDestinos;

import javax.swing.*;

/**
 * Clase principal que inicia la aplicación del planificador de destinos.
 */
public class Main {

    /**
     * Metodo principal que actúa como punto de entrada de la aplicacion.
     *
     * @param args argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PanelPrincipalPlanificadorDestinos frame = new PanelPrincipalPlanificadorDestinos();
                frame.setVisible(true);
            }
        });
    }
}
