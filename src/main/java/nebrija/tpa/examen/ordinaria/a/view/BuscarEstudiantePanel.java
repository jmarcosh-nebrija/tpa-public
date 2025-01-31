package nebrija.tpa.examen.ordinaria.a.view;

import nebrija.tpa.examen.ordinaria.a.core.AppException;
import nebrija.tpa.examen.ordinaria.a.core.Estudiante;
import nebrija.tpa.examen.ordinaria.a.core.GestorEstudiantes;

import javax.swing.*;
import java.awt.*;

/**
 * Panel para la búsqueda de estudiantes.
 */
public class BuscarEstudiantePanel extends JPanel {

    private GestorEstudiantes gestorEstudiantes;

    /**
     * Constructor del Panel.
     *
     * @param gestorEstudiantes El gestor de estudiantes usado en la aplicación
     */
    public BuscarEstudiantePanel(GestorEstudiantes gestorEstudiantes) {
        crearPanel();
        this.gestorEstudiantes = gestorEstudiantes;
    }

    private void crearPanel() {

        // Layout del panel
        setLayout(new BorderLayout());

        // Panel de campos de entrada
        JPanel panelEntrada = new JPanel(new GridLayout(1, 2, 10, 10));
        panelEntrada.add(new JLabel("Número de Matrícula:"));
        JTextField campoMatricula = new JTextField();
        panelEntrada.add(campoMatricula);
        add(panelEntrada, BorderLayout.NORTH);

        // Text area de resultado
        JTextArea areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        add(areaResultado, BorderLayout.CENTER);

        // Boton buscar
        JButton botonBuscar = new JButton("Buscar");
        add(botonBuscar, BorderLayout.SOUTH);

        botonBuscar.addActionListener(e -> {
            try {
                String matricula = campoMatricula.getText();
                // Validación
                if (matricula == null || matricula.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Campo matricula vacio");
                    return;
                }
                // Busqueda delegada al gestor
                Estudiante estudiante = this.gestorEstudiantes.buscarEstudiante(matricula);
                areaResultado.setText("Estudiante encontrado:\n" + estudiante.obtenerInformacion());
            } catch (AppException ex) {
                areaResultado.setText("Estudiante no encontrado.");
            }

        });
    }
}
