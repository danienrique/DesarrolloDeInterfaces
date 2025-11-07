package PruebaManejoEntrePaginas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Ven2 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton irAVentana1, irAVentana3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ven2 frame = new Ven2();
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
	public Ven2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		irAVentana1 = new JButton("Ven1");
		irAVentana1.setBounds(162, 122, 89, 23);
		contentPane.add(irAVentana1);
		irAVentana1.addActionListener(irAVen1);
		
		irAVentana3 = new JButton("Ven3");
		irAVentana3.setBounds(162, 88, 89, 23);
		contentPane.add(irAVentana3);
		irAVentana3.addActionListener(irAVen3);
		
	}
	ActionListener irAVen1 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==irAVentana1) {
				Ven1 ven1 = new Ven1();
				ven1.setVisible(true);
				dispose();
			}
		}
	};
	ActionListener irAVen3 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==irAVentana3) {
				Ven3 ven3 = new Ven3();
				ven3.setVisible(true);
				dispose();
			}
		}
	};
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
