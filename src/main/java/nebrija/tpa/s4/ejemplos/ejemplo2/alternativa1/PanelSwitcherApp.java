package nebrija.tpa.s4.ejemplos.ejemplo2.alternativa1;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSwitcherApp extends JFrame {

    private JPanel mainPanel; // Panel that holds all the other panels
    private CardLayout cardLayout; // CardLayout to manage the panels

    public PanelSwitcherApp() {
        // Set up the frame
        setTitle("CardLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Initialize CardLayout and mainPanel
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Create panels
        JPanel panel1 = createPanel1();
        JPanel panel2 = createPanel2();

        // Add panels to the CardLayout container
        mainPanel.add(panel1, "Panel 1");
        mainPanel.add(panel2, "Panel 2");

        // Add mainPanel to the frame
        getContentPane().add(mainPanel, BorderLayout.CENTER);

        // Button to switch panels
        JButton switchButton = new JButton("Switch Panel");
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Switch to the next panel
                cardLayout.next(mainPanel);
            }
        });

        // Add the button to the bottom of the frame
        getContentPane().add(switchButton, BorderLayout.SOUTH);
    }

    // Estos paneles así creados es difícil extenderlos

    private JPanel createPanel1() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(new JLabel("This is Panel 1"));
        return panel;
    }

    private JPanel createPanel2() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.add(new JLabel("This is Panel 2"));
        return panel;
    }

    public static void main(String[] args) {
        // Run the application in the Swing event dispatch thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PanelSwitcherApp().setVisible(true);
            }
        });
    }
}
