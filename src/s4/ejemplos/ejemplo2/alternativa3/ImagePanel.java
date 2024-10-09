package s4.ejemplos.ejemplo2.alternativa3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {

    private Image image;

    // Constructor que carga la imagen usando un path al recurso
    public ImagePanel() {
        setLayout(new BorderLayout()); // Usamos un BorderLayout para el panel

        // Crear botón para cargar imagen
        JButton loadImageButton = new JButton("Cargar Imagen");
        loadImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir un JFileChooser para seleccionar la imagen
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);

                //
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    if (returnValue == JFileChooser.APPROVE_OPTION) {
                        image = ImageIO.read(selectedFile);
                        repaint();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("Error loading image from: " + selectedFile.getAbsolutePath());
                }
            }
        });

        // Añadir el botón al panel
        add(loadImageButton, BorderLayout.SOUTH);
    }

    // Sobrescribimos paintComponent para dibujar la imagen
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }
}
