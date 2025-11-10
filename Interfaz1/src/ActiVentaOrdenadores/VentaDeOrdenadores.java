package ActiVentaOrdenadores;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.Color;
import java.awt.Container;

import javax.swing.border.LineBorder;
import javax.swing.event.DocumentListener;

import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.EventListener;

@SuppressWarnings({ "unused", "serial" })
public class VentaDeOrdenadores extends JFrame implements ActionListener {

	private JPanel Panel;
	private JLabel NomCliente, Localidad, ListaCli;
	private JTextField NomClienteTxt;
	private JComboBox<String> LocalidadElec;
	@SuppressWarnings("rawtypes")
	private JList ListaCliTxt;
	private DefaultListModel<String> listaModClientes;
	private JScrollPane scroll = new JScrollPane(ListaCliTxt);
	private JCheckBox GrabadoraDvd, Wifi, Sincronizador, Backup;
	private JButton Salir, Aniadir, Buscar, Eliminar, Cancelar;
	private ButtonGroup grupo_1 = new ButtonGroup();
	private JRadioButtonMenuItem P430, P432, P4Celeron, AMD650;
	private ButtonGroup grupo_2 = new ButtonGroup();
	private JRadioButtonMenuItem Mb128, Mb256, Mb512, Mb1024;
	private ButtonGroup grupo_3 = new ButtonGroup();
	private JRadioButtonMenuItem Mon15, Mon17, Tft15, Tft17;
	private ButtonGroup grupo_4 = new ButtonGroup();
	private JRadioButtonMenuItem Gb60, Gb80, Gb120, Gb200;

	/**
	 * Launch the application.
	 */
	private ArrayList<Venta> ventasGuardadas = new ArrayList<>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentaDeOrdenadores frame = new VentaDeOrdenadores();
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
	public VentaDeOrdenadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 484);
		Panel = new JPanel();
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel);
		Panel.setLayout(null);

		NomCliente = new JLabel("Nombre del cliente");
		NomCliente.setBounds(15, 30, 150, 20);
		Panel.add(NomCliente);

		NomClienteTxt = new JTextField();
		NomClienteTxt.setBorder(new LineBorder(new Color(126, 179, 231)));
		NomClienteTxt.setBounds(140, 30, 150, 20);
		Panel.add(NomClienteTxt);

		// limite de 15 chars
		NomClienteTxt.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (NomClienteTxt.getText().length() >= 15) {
					e.consume();
				}
			}
		});
		NomClienteTxt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (!NomClienteTxt.getText().trim().isEmpty()) {
					activarCompConDefecto();
				}
			}
		});

		Localidad = new JLabel("Localidad");
		Localidad.setBounds(15, 60, 150, 20);
		Panel.add(Localidad);

		LocalidadElec = new JComboBox<String>();
		LocalidadElec.setEnabled(false);
		LocalidadElec.setBorder(new LineBorder(new Color(126, 179, 231)));
		LocalidadElec.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Vilalba", "Alpedrete", "Galapagar/La Navata", "Guadarrama" }));
		LocalidadElec.setSelectedIndex(0);
		LocalidadElec.setBounds(140, 60, 110, 20);
		Panel.add(LocalidadElec);

		Aniadir = new JButton("Añadir");
		Aniadir.setBorder(new LineBorder(new Color(0, 128, 192), 2, true));
		Aniadir.setBounds(23, 343, 89, 41);
		Panel.add(Aniadir);

		Aniadir.addActionListener(aniadirAccion);

		Buscar = new JButton("Buscar");
		Buscar.setBorder(new LineBorder(new Color(0, 128, 192), 2, true));
		Buscar.setBounds(122, 343, 89, 41);
		Panel.add(Buscar);
		
		Buscar.addActionListener(buscarAccion);

		Eliminar = new JButton("Eliminar");
		Eliminar.setBorder(new LineBorder(new Color(0, 128, 192), 2, true));
		Eliminar.setBounds(221, 343, 89, 41);
		Panel.add(Eliminar);

		Eliminar.addActionListener(eliminarAccion);

		Cancelar = new JButton("Cancelar");
		Cancelar.setBorder(new LineBorder(new Color(0, 128, 192), 2, true));
		Cancelar.setBounds(600, 343, 89, 41);
		Panel.add(Cancelar);

		Cancelar.addActionListener(cancelarAccion);

		Salir = new JButton("Salir");
		Salir.setBorder(new LineBorder(new Color(0, 128, 192), 2, true));
		Salir.setBounds(600, 398, 89, 41);
		Panel.add(Salir);

		Salir.addActionListener(salirAccion);

		ListaCli = new JLabel("Lista de clientes");
		ListaCli.setBounds(439, 30, 150, 20);
		Panel.add(ListaCli);

		listaModClientes = new DefaultListModel<>();
		ListaCliTxt = new JList<>(listaModClientes);
		ListaCliTxt.setBorder(new LineBorder(new Color(126, 179, 231), 2));
		ListaCliTxt.setBackground(new Color(240, 240, 240));
		Panel.add(ListaCliTxt);

		JScrollPane scroll = new JScrollPane(ListaCliTxt);
		scroll.setBounds(549, 30, 172, 123);
		Panel.add(scroll);

		JLabel Opciones = new JLabel("Opciones");
		Opciones.setFont(new Font("Tahoma", Font.BOLD, 13));
		Opciones.setBounds(567, 170, 64, 20);
		Panel.add(Opciones);

		JLabel DiscoDuro = new JLabel("Disco Duro");
		DiscoDuro.setFont(new Font("Tahoma", Font.BOLD, 13));
		DiscoDuro.setBounds(402, 170, 80, 20);
		Panel.add(DiscoDuro);

		JLabel Procesador = new JLabel("Procesador");
		Procesador.setFont(new Font("Tahoma", Font.BOLD, 13));
		Procesador.setBounds(15, 170, 80, 20);
		Panel.add(Procesador);

		JLabel Memoria = new JLabel("Memoria");
		Memoria.setFont(new Font("Tahoma", Font.BOLD, 13));
		Memoria.setBounds(140, 170, 64, 20);
		Panel.add(Memoria);

		JLabel Monitor = new JLabel("Monitor");
		Monitor.setFont(new Font("Tahoma", Font.BOLD, 13));
		Monitor.setBounds(260, 170, 64, 20);
		Panel.add(Monitor);

		GrabadoraDvd = new JCheckBox("Grabadora DVD");
		GrabadoraDvd.setEnabled(false);
		GrabadoraDvd.setSelected(true);
		GrabadoraDvd.setBounds(564, 197, 125, 23);
		Panel.add(GrabadoraDvd);

		Wifi = new JCheckBox("Wifi");
		Wifi.setEnabled(false);
		Wifi.setSelected(true);
		Wifi.setBounds(564, 223, 97, 23);
		Panel.add(Wifi);

		Sincronizador = new JCheckBox("Sincronizador TV");
		Sincronizador.setEnabled(false);
		Sincronizador.setBounds(564, 249, 125, 23);
		Panel.add(Sincronizador);

		Backup = new JCheckBox("Backup Restore");
		Backup.setEnabled(false);
		Backup.setBounds(564, 275, 125, 23);
		Panel.add(Backup);

		P430 = new JRadioButtonMenuItem("P4 3.0 Gb");
		P430.setEnabled(false);
		P430.setBounds(15, 197, 109, 23);
		Panel.add(P430);

		P432 = new JRadioButtonMenuItem("P4 3.2 Gb");
		P432.setEnabled(false);
		P432.setSelected(true);
		P432.setBounds(15, 223, 109, 23);
		Panel.add(P432);

		P4Celeron = new JRadioButtonMenuItem("P4 Celeron");
		P4Celeron.setEnabled(false);
		P4Celeron.setBounds(15, 249, 109, 23);
		Panel.add(P4Celeron);

		AMD650 = new JRadioButtonMenuItem("AMD 650");
		AMD650.setEnabled(false);
		AMD650.setBounds(15, 275, 109, 23);
		Panel.add(AMD650);

		grupo_1.add(P430);
		grupo_1.add(P432);
		grupo_1.add(P4Celeron);
		grupo_1.add(AMD650);

		Mb128 = new JRadioButtonMenuItem("128 Mb");
		Mb128.setEnabled(false);
		Mb128.setBounds(140, 197, 109, 23);
		Panel.add(Mb128);
		grupo_2.add(Mb128);

		Mb256 = new JRadioButtonMenuItem("256 Mb");
		Mb256.setEnabled(false);
		Mb256.setBounds(140, 223, 109, 23);
		Panel.add(Mb256);
		grupo_2.add(Mb256);

		Mb512 = new JRadioButtonMenuItem("512 Mb");
		Mb512.setEnabled(false);
		Mb512.setBounds(140, 249, 109, 23);
		Panel.add(Mb512);
		grupo_2.add(Mb512);

		Mb1024 = new JRadioButtonMenuItem("1024 Mb");
		Mb1024.setEnabled(false);
		Mb1024.setSelected(true);
		Mb1024.setBounds(140, 275, 109, 23);
		Panel.add(Mb1024);
		grupo_2.add(Mb1024);

		Mon15 = new JRadioButtonMenuItem("15 \"");
		Mon15.setEnabled(false);
		Mon15.setBounds(260, 197, 109, 23);
		Panel.add(Mon15);
		grupo_3.add(Mon15);

		Mon17 = new JRadioButtonMenuItem("17 \"");
		Mon17.setEnabled(false);
		Mon17.setBounds(260, 223, 109, 23);
		Panel.add(Mon17);
		grupo_3.add(Mon17);

		Tft15 = new JRadioButtonMenuItem("TFT 15 \"");
		Tft15.setEnabled(false);
		Tft15.setBounds(260, 249, 109, 23);
		Panel.add(Tft15);
		grupo_3.add(Tft15);

		Tft17 = new JRadioButtonMenuItem("TFT 17 \"");
		Tft17.setEnabled(false);
		Tft17.setSelected(true);
		Tft17.setBounds(260, 275, 109, 23);
		Panel.add(Tft17);
		grupo_3.add(Tft17);

		Gb60 = new JRadioButtonMenuItem("60 Gb");
		Gb60.setEnabled(false);
		Gb60.setBounds(402, 197, 109, 23);
		Panel.add(Gb60);
		grupo_4.add(Gb60);

		Gb80 = new JRadioButtonMenuItem("80 Gb");
		Gb80.setEnabled(false);
		Gb80.setBounds(402, 223, 109, 23);
		Panel.add(Gb80);
		grupo_4.add(Gb80);

		Gb120 = new JRadioButtonMenuItem("120 Gb");
		Gb120.setEnabled(false);
		Gb120.setBounds(402, 249, 109, 23);
		Panel.add(Gb120);
		grupo_4.add(Gb120);

		Gb200 = new JRadioButtonMenuItem("200 Gb");
		Gb200.setEnabled(false);
		Gb200.setSelected(true);
		Gb200.setBounds(402, 275, 109, 23);
		Panel.add(Gb200);
		grupo_4.add(Gb200);

	}

	// Añadir
	ActionListener aniadirAccion = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String texto = NomClienteTxt.getText().trim();
			if (!texto.isEmpty()) {
				String procesador = getSelectedProcesador();
				String memoria = getSelectedMemoria();
				String monitor = getSelectedMonitor();
				String disco = getSelectedDisco();
				String localidad = (String) LocalidadElec.getSelectedItem();
				boolean grab = GrabadoraDvd.isSelected();
				boolean wifiB = Wifi.isSelected();
				boolean sync = Sincronizador.isSelected();
				boolean backupB = Backup.isSelected();

				Venta ven = new Venta(texto, localidad, procesador, memoria, monitor, disco, grab, wifiB, sync,
						backupB);
				ventasGuardadas.add(ven);

				listaModClientes.addElement(texto);
				NomClienteTxt.setText("");
				NomClienteTxt.requestFocusInWindow();
			} else {
				JOptionPane.showMessageDialog(null, "El campo está vacío");
			}
		}
	};

	// Eliminar
	ActionListener eliminarAccion = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int idx = ListaCliTxt.getSelectedIndex();
			if (idx < 0) {
				JOptionPane.showMessageDialog(null, "Seleccione un cliente en la lista para eliminar.");
				return;
			}
			String cliente = listaModClientes.getElementAt(idx);

			// Confirmación
			int respuesta = JOptionPane.showConfirmDialog(null,
					"¿Deseas eliminar la venta de " + cliente + "?" + "\n"
					+ "En dicha venta, " + cliente + " compró:" + 
					ventasGuardadas.get(idx).detallesVenta(), 
					"Confirmar eliminación",
					JOptionPane.YES_NO_OPTION);
			if (respuesta == JOptionPane.YES_OPTION) {
				// eliminamos en el array y en el JList
				listaModClientes.remove(idx);
				if (idx < ventasGuardadas.size()) {
					ventasGuardadas.remove(idx);

					// limpiar campos y volver al estado inicial
					NomClienteTxt.setText("");
					establecerEstadoInicial();
					Eliminar.setEnabled(true);
				}
			}
		}
	};
	
	//Buscar
	ActionListener buscarAccion = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String texto = NomClienteTxt.getText().trim();
            if (texto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Introduzca nombre de cliente para buscar.");
                return;
            }
            boolean encontrado = false;
            for (int i = 0; i < ventasGuardadas.size(); i++) {
                Venta v = ventasGuardadas.get(i);
                if (v.getNombreCliente().equalsIgnoreCase(texto)) {
                    encontrado = true;
                    int opcion = JOptionPane.showConfirmDialog(null, v.detallesVenta() + "\n¿Desea ver la siguiente venta de este cliente?",
                            "Venta encontrada", JOptionPane.YES_NO_OPTION);
                    if (opcion != JOptionPane.YES_OPTION) {
                        break;
                    }
                    //el bucle busca más ventas
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "El cliente no ha realizado ninguna compra.");
            } else {
                // al acabar la búsqueda, volver a estado inicial (según enunciado).
                establecerEstadoInicial();
            }
		}
	};

	// Salir
	ActionListener salirAccion = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == Salir) {
				System.exit(0);
			}
		}
	};

	// Cancelar
	ActionListener cancelarAccion = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			NomClienteTxt.setText("");
			establecerEstadoInicial();

		}
	};

	private String getSelectedProcesador() {
		if (P430.isSelected())
			return P430.getText();
		if (P432.isSelected())
			return P432.getText();
		if (P4Celeron.isSelected())
			return P4Celeron.getText();
		if (AMD650.isSelected())
			return AMD650.getText();
		return "";
	}

	private String getSelectedMemoria() {
		if (Mb128.isSelected())
			return Mb128.getText();
		if (Mb256.isSelected())
			return Mb256.getText();
		if (Mb512.isSelected())
			return Mb512.getText();
		if (Mb1024.isSelected())
			return Mb1024.getText();
		return "";
	}

	private String getSelectedMonitor() {
		if (Mon15.isSelected())
			return Mon15.getText();
		if (Mon17.isSelected())
			return Mon17.getText();
		if (Tft15.isSelected())
			return Tft15.getText();
		if (Tft17.isSelected())
			return Tft17.getText();
		return "";
	}

	private String getSelectedDisco() {
		if (Gb60.isSelected())
			return Gb60.getText();
		if (Gb80.isSelected())
			return Gb80.getText();
		if (Gb120.isSelected())
			return Gb120.getText();
		if (Gb200.isSelected())
			return Gb200.getText();
		return "";
	}

	// metodo con el estado inicial de la página
	private void establecerEstadoInicial() {
		// El único controles activos serán: NomClienteTxt, ListaCliTxt, Cancelar, Salir
		NomClienteTxt.setEnabled(true);
		NomClienteTxt.requestFocusInWindow();
		NomClienteTxt.setText("");

		ListaCliTxt.setEnabled(true);

		Cancelar.setEnabled(true);
		Salir.setEnabled(true);

		// desactivar todo lo demás
		Aniadir.setEnabled(false);
		Buscar.setEnabled(false);
		Eliminar.setEnabled(false);

		cambiarEstadoGeneral(false);
	}

	// Metodo para activar cuando hayamos introducido una nueva venta
	private void activarCompConDefecto() {
		// activar los grupos y componentes
		cambiarEstadoGeneral(true);

		// configuración por defecto:

		P432.setSelected(true);
		Mb1024.setSelected(true);
		Tft17.setSelected(true);
		Gb200.setSelected(true);

		GrabadoraDvd.setSelected(true);
		Wifi.setSelected(true);
		Sincronizador.setSelected(false);
		Backup.setSelected(false);

		Aniadir.setEnabled(true);
		Buscar.setEnabled(true);

		// Localidad focus
		LocalidadElec.requestFocusInWindow();
	}

	// Metodo para cambiar la habilitacion de todos los componentes
	private void cambiarEstadoGeneral(Boolean bl) {
		P430.setEnabled(bl);
		P432.setEnabled(bl);
		P4Celeron.setEnabled(bl);
		AMD650.setEnabled(bl);
		Mb128.setEnabled(bl);
		Mb256.setEnabled(bl);
		Mb512.setEnabled(bl);
		Mb1024.setEnabled(bl);
		Mon15.setEnabled(bl);
		Mon17.setEnabled(bl);
		Tft15.setEnabled(bl);
		Tft17.setEnabled(bl);
		Gb60.setEnabled(bl);
		Gb80.setEnabled(bl);
		Gb120.setEnabled(bl);
		Gb200.setEnabled(bl);
		LocalidadElec.setEnabled(bl);
		GrabadoraDvd.setEnabled(bl);
		Wifi.setEnabled(bl);
		Sincronizador.setEnabled(bl);
		Backup.setEnabled(bl);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
