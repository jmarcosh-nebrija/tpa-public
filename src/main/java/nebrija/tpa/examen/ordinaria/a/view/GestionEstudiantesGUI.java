package nebrija.tpa.examen.ordinaria.a.view;

import nebrija.tpa.examen.ordinaria.a.core.*;

import javax.swing.*;
import java.awt.*;


/**
 * Clase principal que gestiona la interfaz gráfica y la lógica del programa.
 */
public class GestionEstudiantesGUI extends JFrame {

    private JPanel panelPrincipal;
    private CardLayout cardLayout;
    private GestorEstudiantes gestorEstudiantes;

    /**
     * Enum para los tres tipos de paneles de la aplicación
     */
    public enum Panel {
        AGREGAR("Agregar"),
        BUSCAR("Buscar"),
        MOSTRAR_TODOS("Mostrar Todos");

        private final String nombreInterno;

        /**
         * Constructor del enum con un nombre interno para el panel
         *
         * @param nombreInterno El nombre interno del panel
         */
        Panel(String nombreInterno) {
            this.nombreInterno = nombreInterno;
        }

        /**
         * Metodo para obtener el nombre interno
         *
         * @return el nombre interno
         */
        public String getNombreInterno() {
            return nombreInterno;
        }
    }

    /**
     * Constructor de la GUI de la aplicación.
     *
     * @param gestorEstudiantes
     */
    public GestionEstudiantesGUI(GestorEstudiantes gestorEstudiantes) {
        this.gestorEstudiantes = gestorEstudiantes;
        configurarInterfaz();
    }

    private void configurarInterfaz() {
        setTitle("Gestión de Estudiantes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana
        setLayout(new BorderLayout());

        // Panel para botones
        JPanel panelBotones = crearBotonera();
        add(panelBotones, BorderLayout.NORTH);

        // Paneles con funcionalidad
        cardLayout = new CardLayout();
        panelPrincipal = new JPanel(cardLayout);
        panelPrincipal.add(new AgregarEstudiantePanel(gestorEstudiantes), Panel.AGREGAR.getNombreInterno());
        panelPrincipal.add(new BuscarEstudiantePanel(gestorEstudiantes), Panel.BUSCAR.getNombreInterno());
        panelPrincipal.add(new MostrarEstudiantesPanel(gestorEstudiantes), Panel.MOSTRAR_TODOS.getNombreInterno());
        add(panelPrincipal, BorderLayout.CENTER);
        cardLayout.show(panelPrincipal, Panel.AGREGAR.getNombreInterno());
    }

    private JPanel crearBotonera() {
        JPanel panelBotones = new JPanel();

        JButton botonAgregar = new JButton("Agregar Estudiante");
        JButton botonBuscar = new JButton("Buscar Estudiante");
        JButton botonMostrarTodos = new JButton("Mostrar Todos");
        panelBotones.add(botonAgregar);
        panelBotones.add(botonBuscar);
        panelBotones.add(botonMostrarTodos);

        // Acción para agregar estudiantes
        botonAgregar.addActionListener(e -> cardLayout.show(panelPrincipal, Panel.AGREGAR.getNombreInterno()));

        // Acción para buscar estudiantes
        botonBuscar.addActionListener(e -> cardLayout.show(panelPrincipal, Panel.BUSCAR.getNombreInterno()));

        // Acción para mostrar todos los estudiantes
        botonMostrarTodos.addActionListener(e -> cardLayout.show(panelPrincipal, Panel.MOSTRAR_TODOS.getNombreInterno()));

        return panelBotones;
    }


}

