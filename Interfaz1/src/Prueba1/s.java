package Prueba1;

import javax.swing.*;
import java.awt.event.*;

public class s extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
    private JLabel etiqueta;

    public s() {
        setTitle("Ejemplo de refresco");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        etiqueta = new JLabel("Texto original");
        JButton boton = new JButton("Refrescar");

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("Texto actualizado: " + System.currentTimeMillis());
                
                // 🔁 Fuerza que se repinte el panel
                panel.revalidate();
                panel.repaint();
            }
        });

        panel.add(etiqueta);
        panel.add(boton);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new s());
    }
}
