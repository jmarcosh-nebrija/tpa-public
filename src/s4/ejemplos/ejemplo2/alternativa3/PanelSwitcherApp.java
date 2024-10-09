package s4.ejemplos.ejemplo2.alternativa3;


import javax.swing.*;

public class PanelSwitcherApp extends JFrame {

    public PanelSwitcherApp() {
        // Configuración básica del JFrame
        setTitle("Panel Switcher App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Añadimos como ContentPane el Panel que permite intercambiar subpaneles
        setContentPane(new PanelSwapper(new ColorPanel(), new ImagePanel()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PanelSwitcherApp().setVisible(true);
            }
        });
    }
}
