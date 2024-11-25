package s4.ejemplos.ejemplo2.alternativa3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSwapper extends JPanel {


    public PanelSwapper(JPanel panel1, JPanel panel2) {
        super(new BorderLayout());

        // Create main Panel with a CardLayout to contain panel1 and panel2
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);
        mainPanel.add(panel1);
        mainPanel.add(panel2);

        // Add mainPanel to this JPanel
        add(mainPanel, BorderLayout.CENTER);

        // Create button panel
        JButton switchButton = new JButton("Switch Panel");
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Switch to the next panel
                cardLayout.next(mainPanel);
            }
        });

        // Add the button to the bottom of the frame
        add(switchButton, BorderLayout.SOUTH);
    }
}

