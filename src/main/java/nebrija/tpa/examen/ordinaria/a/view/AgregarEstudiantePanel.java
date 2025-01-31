package nebrija.tpa.examen.ordinaria.a.view;

import nebrija.tpa.examen.ordinaria.a.core.Estudiante;
import nebrija.tpa.examen.ordinaria.a.core.EstudianteGrado;
import nebrija.tpa.examen.ordinaria.a.core.EstudiantePosgrado;
import nebrija.tpa.examen.ordinaria.a.core.GestorEstudiantes;

import javax.swing.*;
import java.awt.*;

/**
 * Panel para agregar estudiantes.
 */
public class AgregarEstudiantePanel extends JPanel {

    private GestorEstudiantes gestorEstudiantes;

    /**
     * Constructor del Panel.
     *
     * @param gestorEstudiantes El gestor de estudiantes usado en la aplicación
     */
    public AgregarEstudiantePanel(GestorEstudiantes gestorEstudiantes) {
        crearPanel();
        this.gestorEstudiantes = gestorEstudiantes;
    }

    private void crearPanel() {
        // Layout del panel
        setLayout(new BorderLayout());

        // Panel de campos de entrada
        JPanel panelEntrada = new JPanel(new GridLayout(5, 2, 10, 10));
        JTextField campoNombre = new JTextField();
        JTextField campoEdad = new JTextField();
        JTextField campoMatricula = new JTextField();
        String[] opciones = {"Grado", "Posgrado"};
        JComboBox<String> comboTipo = new JComboBox<>(opciones);
        JTextField campoExtra = new JTextField();

        panelEntrada.add(new JLabel("Nombre:"));
        panelEntrada.add(campoNombre);
        panelEntrada.add(new JLabel("Edad:"));
        panelEntrada.add(campoEdad);
        panelEntrada.add(new JLabel("Número de Matrícula:"));
        panelEntrada.add(campoMatricula);
        panelEntrada.add(new JLabel("Tipo de Estudiante:"));
        panelEntrada.add(comboTipo);
        panelEntrada.add(new JLabel("Carrera o Línea de Investigación:"));
        panelEntrada.add(campoExtra);
        add(panelEntrada, BorderLayout.CENTER);

        // Boton buscar
        JButton botonGuardar = new JButton("Guardar");
        botonGuardar.addActionListener(e -> {
            try {
                String nombre = campoNombre.getText();
                int edad = Integer.parseInt(campoEdad.getText());
                String matricula = campoMatricula.getText();
                String extra = campoExtra.getText();

                Estudiante estudiante;
                if (comboTipo.getSelectedItem().equals("Grado")) {
                    estudiante = new EstudianteGrado(nombre, edad, matricula, extra);
                } else {
                    estudiante = new EstudiantePosgrado(nombre, edad, matricula, extra);
                }
                this.gestorEstudiantes.addEstudiante(estudiante);
                JOptionPane.showMessageDialog(this, "Estudiante agregado correctamente.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "La edad debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        add(botonGuardar, BorderLayout.SOUTH);
    }
}
