package InterfazCorreoElectronico;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CorreoElectronico extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textoPara, textoC, textoCodigoOculto, textoAsunto;
	private JTextArea cuerpo;
	private JLabel para, C, CC, Asunto;
	private JButton enviar;
	private JScrollPane scrol;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CorreoElectronico frame = new CorreoElectronico();
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
	public CorreoElectronico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		para = new JLabel("Para: ");
		para.setBounds(42, 14, 60, 14);
		getContentPane().add(para);
		
		C = new JLabel("C: ");
		C.setBounds(42, 38, 60, 14);
		getContentPane().add(C);
		
		CC = new JLabel("CC: ");
		CC.setBounds(42, 62, 60, 14);
		getContentPane().add(CC);
		
		Asunto = new JLabel("Asunto: ");
		Asunto.setBounds(42, 86, 60, 14);
		getContentPane().add(Asunto);
		
		textoPara = new JTextField();
		textoPara.setBounds(100, 14, 200, 20);
		getContentPane().add(textoPara);
		
		textoC = new JTextField();
		textoC.setBounds(100, 38, 200, 20);
		getContentPane().add(textoC);
		
		textoCodigoOculto = new JTextField();
		textoCodigoOculto.setBounds(100, 62, 200, 20);
		getContentPane().add(textoCodigoOculto);
		
		textoAsunto = new JTextField();
		textoAsunto.setBounds(100, 86, 200, 20);
		getContentPane().add(textoAsunto);
		
		cuerpo = new JTextArea();
		cuerpo.setBounds(42,115,270, 120);
		getContentPane().add(cuerpo);
		scrol = new JScrollPane(cuerpo);
		scrol.setBounds(42,115,270, 120);
		getContentPane().add(scrol);
		
		enviar = new JButton("Enviar");
		enviar.setBounds(42,240,80,20);
		getContentPane().add(enviar);
		enviar.addActionListener(Al);
	}
	ActionListener Al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==enviar) {
				textoAsunto.setText("");
				textoC.setText("");
				textoCodigoOculto.setText("");
				cuerpo.setText("");
				textoPara.setText("");
			}
			
		}
	};

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
