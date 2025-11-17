package Coloreas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Colorear extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int PLAIN = 0;
	private JPanel Ventana;
	private JTextField rojoValor;
	private JTextField verdeValor;
	private JTextField azulValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colorear frame = new Colorear();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Colorear() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 578);
		Ventana = new JPanel();
		Ventana.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Ventana);
		Ventana.setLayout(null);

		rojoValor = new JTextField();
		rojoValor.setBounds(127, 384, 155, 20);
		Ventana.add(rojoValor);
		rojoValor.setColumns(10);

		verdeValor = new JTextField();
		verdeValor.setColumns(10);
		verdeValor.setBounds(127, 415, 155, 20);
		Ventana.add(verdeValor);

		azulValor = new JTextField();
		azulValor.setColumns(10);
		azulValor.setBounds(127, 446, 155, 20);
		Ventana.add(azulValor);

		JLabel lblNewLabel = new JLabel("Rojo");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(69, 384, 46, 20);
		Ventana.add(lblNewLabel);

		JLabel lblVerde = new JLabel("Verde");
		lblVerde.setForeground(new Color(0, 255, 0));
		lblVerde.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVerde.setBounds(69, 418, 58, 20);
		Ventana.add(lblVerde);

		JLabel lblAzul = new JLabel("Azul");
		lblAzul.setForeground(new Color(0, 0, 255));
		lblAzul.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAzul.setBounds(69, 449, 46, 20);
		Ventana.add(lblAzul);

	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.RED);
		g2d.setFont(new Font("Arial", PLAIN, 26));
		g2d.drawString("Rojo", 800, 65);

		g2d.setColor(Color.GREEN);
		g2d.setFont(new Font("Arial", PLAIN, 26));
		g2d.drawString("Verde", 800, 90);

		g2d.setColor(Color.BLUE);
		g2d.setFont(new Font("Arial", PLAIN, 26));
		g2d.drawString("Azul", 800, 115);

		g2d.setColor(Color.blue);
		g2d.drawRect(770, 95, 20, 20);
		g2d.fillRect(770, 95, 20, 20);

		g2d.setColor(Color.green);
		g2d.drawRect(770, 65, 20, 20);
		g2d.fillRect(770, 65, 20, 20);

		g2d.setColor(Color.red);
		g2d.drawRect(770, 35, 20, 20);
		g2d.fillRect(770, 35, 20, 20);

		g2d.setColor(Color.black);
		g2d.drawArc(250, 50, 250, 250, 0, 360);

		g2d.setColor(Color.blue);
		g2d.drawArc(250, 50, 250, 250, 0, 120);
		g2d.fillArc(250, 50, 250, 250, 0, 120);

		g2d.setColor(Color.green);
		g2d.drawArc(250, 50, 250, 250, 120, 120);
		g2d.fillArc(250, 50, 250, 250, 120, 120);

		g2d.setColor(Color.red);
		g2d.drawArc(250, 50, 250, 250, 240, 120);
		g2d.fillArc(250, 50, 250, 250, 240, 120);
	}

	ActionListener pintarRojo = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == rojoValor) {

			}
		}
	};

	ActionListener pintarVerde = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == verdeValor) {

			}
		}
	};

	ActionListener pintarAzul = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == rojoValor) {
				
			}
		}
	};
}
