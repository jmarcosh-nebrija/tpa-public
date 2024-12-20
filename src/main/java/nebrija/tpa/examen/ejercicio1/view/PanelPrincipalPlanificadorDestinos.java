package nebrija.tpa.examen.ejercicio1.view;

import examen.ejercicio1.core.Destino;
import examen.ejercicio1.core.DestinoCiudad;
import examen.ejercicio1.core.DestinoPlaya;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Clase que contiene la vista dl planificador de destinos vacacionales.
 * Permite agregar destinos de tipo ciudad o playa y mostrarlos en un área de salida.
 */
public class PanelPrincipalPlanificadorDestinos extends JFrame{
    private JTextField nombreField;
    private JTextField descricionField;
    private JTextArea outputArea;
    private ArrayList<Destino> destinos;

    /**
     * Constructor de la clase PanelPrincipalPlanificadorDestinos.
     * Inicializa la lista de destinos y configura la interfaz de usuario.
     */
    public PanelPrincipalPlanificadorDestinos() {
        destinos = new ArrayList<>();
        initUI();
    }

    /**
     * Inicializa los componentes de la interfaz de usuario.
     */
    private void initUI() {
        setTitle("Planificador de Destinos Vacacionales");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Panel superior
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        inputPanel.add(nombreField);

        inputPanel.add(new JLabel("Descripción:"));
        descricionField = new JTextField();
        inputPanel.add(descricionField);

        JButton agregarCiudadButton = new JButton("Agregar Ciudad");
        JButton agregarPlayaButton = new JButton("Agregar Playa");
        inputPanel.add(agregarCiudadButton);
        inputPanel.add(agregarPlayaButton);

        // Área de salida
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Acciones de los botones
        agregarCiudadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDestinoCiudad();
            }
        });

        agregarPlayaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDestinoPlaya();
            }
        });

        // Layout principal
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    /**
     * Agrega un destino de tipo ciudad a la lista de destinos.
     * Obtiene los datos del usuario desde los campos de texto.
     */
    private void agregarDestinoCiudad() {
        String nombre = nombreField.getText();
        String descripcion = descricionField.getText();
        Destino destino = new DestinoCiudad(nombre, descripcion);
        destinos.add(destino);
        actualizarSalida();
    }

    /**
     * Agrega un destino de tipo playa a la lista de destinos.
     * Obtiene los datos del usuario desde los campos de texto.
     */
    private void agregarDestinoPlaya() {
        String nombre = nombreField.getText();
        String descripcion = descricionField.getText();
        Destino destino = new DestinoPlaya(nombre, descripcion);
        destinos.add(destino);
        actualizarSalida();
    }

    /**
     * Actualiza el área de salida para mostrar la lista de destinos agregados.
     */
    private void actualizarSalida() {
        StringBuilder builder = new StringBuilder();
        for (Destino destino : destinos) {
            builder.append(destino.getNombre())
                    .append(" - ")
                    .append(destino.getDescripcion())
                    .append("\n");
        }
        outputArea.setText(builder.toString());
    }
}
