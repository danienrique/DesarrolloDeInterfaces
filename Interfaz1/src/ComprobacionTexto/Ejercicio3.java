package ComprobacionTexto;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejercicio3 extends JFrame implements ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> jc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
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
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		jc = new JComboBox<String>();
		jc.setBounds(30, 40, 250, 20);
		add(jc);
		jc.addItem("Si");
		jc.addItem("Sa");
		jc.addItem("Se");
		jc.addItem("So");
		jc.addItem("Su");
		jc.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jc) {
			String seleccionado = (String) jc.getSelectedItem();
			setTitle(seleccionado);
		}
	}

}
