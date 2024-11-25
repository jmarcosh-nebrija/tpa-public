package nebrija.tpa.s4.ejemplos.ejemplo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventsFrame extends JFrame {

    private JButton button;
    private JLabel infoLabel;

    public MouseEventsFrame() {
        // Configuración del JFrame
        setTitle("Eventos de Ratón en un Componente");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        // Crear un botón
        button = new JButton("Pasa el ratón sobre mí");

        // Crear una etiqueta para mostrar los eventos
        infoLabel = new JLabel("Interacciones del ratón aparecerán aquí", SwingConstants.CENTER);

        // Configurar el layout
        setLayout(new BorderLayout());

        // Añadir los componentes al JFrame
        add(button, BorderLayout.CENTER);
        add(infoLabel, BorderLayout.SOUTH);

        // Añadir los eventos de ratón al botón
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                infoLabel.setText("Mouse Entered: Ratón sobre el botón");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                infoLabel.setText("Mouse Exited: Ratón fuera del botón");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                infoLabel.setText("Mouse Pressed: Botón presionado");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                infoLabel.setText("Mouse Released: Botón liberado");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                infoLabel.setText("Mouse Clicked: Botón clicado");
            }
        });

        // Añadir los eventos de movimiento del ratón
        button.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                infoLabel.setText("Mouse Moved: Coordenadas (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                infoLabel.setText("Mouse Dragged: Arrastrando en (" + e.getX() + ", " + e.getY() + ")");
            }
        });
    }

    // Metodo principal para iniciar la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseEventsFrame frame = new MouseEventsFrame();
            frame.setVisible(true); // Mostrar la ventana
        });
    }
}
