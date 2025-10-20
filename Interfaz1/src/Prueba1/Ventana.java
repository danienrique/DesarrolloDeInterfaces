package Prueba1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel BackGround;
	private JTextField visor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 315);
		BackGround = new JPanel();
		BackGround.setBackground(new Color(254, 75, 201));
		BackGround.setBorder(null);
		setContentPane(BackGround);
		BackGround.setLayout(null);
		
		visor = new JTextField();
		visor.setBounds(89, 11, 252, 20);
		BackGround.add(visor);
		visor.setColumns(10);
		
		JButton dos = new JButton("2");
		dos.setBounds(156, 46, 45, 45);
		dos.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		dos.setBackground(new Color(244, 215, 244));
		dos.setForeground(new Color(0, 0, 0));
		BackGround.add(dos);
		
		JButton uno = new JButton("1");
		uno.setBounds(89, 46, 45, 45);
		uno.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		uno.setForeground(new Color(0, 0, 0));
		uno.setBackground(new Color(244, 215, 244));
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BackGround.add(uno);
		
		JButton tres = new JButton("3");
		tres.setBounds(222, 46, 45, 45);
		tres.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		tres.setBackground(new Color(244, 215, 244));
		tres.setForeground(new Color(0, 0, 0));
		BackGround.add(tres);
		
		JButton cuatro = new JButton("4");
		cuatro.setBounds(89, 102, 45, 45);
		cuatro.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		cuatro.setBackground(new Color(244, 215, 244));
		cuatro.setForeground(new Color(0, 0, 0));
		BackGround.add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.setBounds(156, 102, 45, 45);
		cinco.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		cinco.setBackground(new Color(244, 215, 244));
		cinco.setForeground(new Color(0, 0, 0));
		BackGround.add(cinco);
		
		JButton seis = new JButton("6");
		seis.setBounds(222, 102, 45, 45);
		seis.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		seis.setBackground(new Color(244, 215, 244));
		seis.setForeground(new Color(0, 0, 0));
		BackGround.add(seis);
		
		JButton siete = new JButton("7");
		siete.setBounds(89, 158, 45, 45);
		siete.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		siete.setBackground(new Color(244, 215, 244));
		siete.setForeground(new Color(0, 0, 0));
		BackGround.add(siete);
		
		JButton ocho = new JButton("8");
		ocho.setBounds(156, 158, 45, 45);
		ocho.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		ocho.setBackground(new Color(244, 215, 244));
		ocho.setForeground(new Color(0, 0, 0));
		BackGround.add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.setBounds(222, 158, 45, 45);
		nueve.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		nueve.setBackground(new Color(244, 215, 244));
		nueve.setForeground(new Color(0, 0, 0));
		BackGround.add(nueve);
		
		JButton sumar = new JButton("+");
		sumar.setBounds(296, 46, 45, 45);
		sumar.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		sumar.setBackground(new Color(244, 215, 244));
		sumar.setForeground(new Color(0, 0, 0));
		BackGround.add(sumar);
		
		JButton restar = new JButton("-");
		restar.setIcon(new ImageIcon("C:\\Users\\alumno\\Downloads\\kimi.jpg"));
		restar.setBounds(296, 102, 45, 45);
		restar.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		restar.setBackground(new Color(244, 215, 244));
		restar.setForeground(new Color(0, 0, 0));
		BackGround.add(restar);
		
		JButton multiplicar = new JButton("");
		multiplicar.setIcon(new ImageIcon("C:\\Users\\alumno\\Downloads\\hirohito(1).jpg"));
		multiplicar.setBounds(296, 158, 45, 45);
		multiplicar.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		multiplicar.setBackground(new Color(244, 215, 244));
		multiplicar.setForeground(new Color(0, 0, 0));
		BackGround.add(multiplicar);
		
		JButton Borrar = new JButton("A");
		Borrar.setBounds(89, 214, 45, 45);
		Borrar.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		Borrar.setBackground(new Color(244, 215, 244));
		Borrar.setForeground(new Color(0, 0, 0));
		Borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BackGround.add(Borrar);
		
		JButton cero = new JButton("0");
		cero.setBounds(156, 214, 45, 45);
		cero.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		cero.setBackground(new Color(244, 215, 244));
		cero.setForeground(new Color(0, 0, 0));
		BackGround.add(cero);
		
		JButton igual = new JButton("=");
		igual.setBounds(222, 214, 45, 45);
		igual.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		igual.setBackground(new Color(244, 215, 244));
		igual.setForeground(new Color(0, 0, 0));
		BackGround.add(igual);
		
		JButton dividir = new JButton("");
		dividir.setIcon(new ImageIcon("C:\\Users\\alumno\\Downloads\\mao(1).jpg"));
		dividir.setBounds(296, 214, 45, 45);
		dividir.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		dividir.setBackground(new Color(244, 215, 244));
		dividir.setForeground(new Color(0, 0, 0));
		BackGround.add(dividir);
		
		JLabel lblNewLabel = new JLabel("Sisisi");
		lblNewLabel.setBounds(378, 34, 46, 14);
		BackGround.add(lblNewLabel);

	}
}
