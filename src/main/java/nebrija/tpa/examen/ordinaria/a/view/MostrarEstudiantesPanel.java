package nebrija.tpa.examen.ordinaria.a.view;

import nebrija.tpa.examen.ordinaria.a.core.Estudiante;
import nebrija.tpa.examen.ordinaria.a.core.GestorEstudiantes;

import javax.swing.*;
import java.awt.*;

/**
 * Panel para mostrar estudiantes.
 */
public class MostrarEstudiantesPanel extends JPanel {

    private GestorEstudiantes gestorEstudiantes;

    /**
     * Constructor del Panel.
     *
     * @param gestorEstudiantes El gestor de estudiantes usado en la aplicación
     */
    public MostrarEstudiantesPanel(GestorEstudiantes gestorEstudiantes) {
        crearPanel();
        this.gestorEstudiantes = gestorEstudiantes;
    }

    private void crearPanel() {
        setLayout(new BorderLayout());
        JTextArea areaResultado = new JTextArea();
        JButton botonMostrar = new JButton("Mostrar");
        areaResultado.setEditable(false);

        botonMostrar.addActionListener(e -> {
            areaResultado.setText("Lista de estudiantes:\n");
            for (Estudiante estudiante : this.gestorEstudiantes.getEstudiantes()) {
                areaResultado.append(estudiante.obtenerInformacion() + "\n");
            }
        });

        add(new JScrollPane(areaResultado), BorderLayout.CENTER);
        add(botonMostrar, BorderLayout.SOUTH);
    }
}
