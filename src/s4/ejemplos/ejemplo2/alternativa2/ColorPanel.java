package s4.ejemplos.ejemplo2.alternativa2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorPanel extends JPanel {

    // Panel 1 con algunos componentes
    public ColorPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY);

        // Add panel label
        JLabel l = new JLabel("Este es el Panel de cambio de color random");
        add(l, BorderLayout.NORTH);

        // Add change panel color button
        JButton changePanelColorButton = new JButton("Cambia color de panel");
        changePanelColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(getRandomColor());
            }
        });
        add(changePanelColorButton, BorderLayout.SOUTH);
    }

    private Color getRandomColor() {

        int R = (int) (Math.random() * 256);
        int G = (int) (Math.random() * 256);
        int B = (int) (Math.random() * 256);

        return new Color(R, G, B);
    }
}
