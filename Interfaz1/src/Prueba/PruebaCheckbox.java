package Prueba;
import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PruebaCheckbox extends JFrame implements ChangeListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JCheckBox check;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaCheckbox frame = new PruebaCheckbox();
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
	public PruebaCheckbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		check = new JCheckBox("Arbitro");
		check.setBounds(100,100,100,100);
		check.addChangeListener(this);
		add(check);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		String cad = "";
		if(check.isSelected()==true) {
			cad = cad+"Arbitro";
		} 
	}

}
