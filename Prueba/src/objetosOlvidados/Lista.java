package objetosOlvidados;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class Lista extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnSalir;
	private JTable table;
	private final Action action = new SwingAction();
	private JButton btnREG;
	private RegistrodeObjetos registro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista frame = new Lista();
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
	public Lista() {
		setBackground(new Color(255, 140, 0));
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Lista.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		setTitle("L I S T A    DE  O B J E T O S   P E R D I D O S");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		// BOTON SALIDA
		btnSalir = new JButton("S A L I R");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});

		btnREG = new JButton("R E G R E S A R");
		btnREG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// se regresa a la ventana de registro
				registro = new RegistrodeObjetos();
				registro.setVisible(true);
				dispose();// cierra ventana

			}
		});
		btnREG.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(btnREG);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(btnSalir);

		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(new Object[][] {
				{ "#", "FECHA", "NO.HABITACION", "NOMBRE DE LA RECAMARISTA", "DESCRIPCION" },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, },
				new String[] { "NO", "      FECHA", "HABITACION", "NOMBRE DE LA RECAMARISTA",
						"                              DESCRIPCION" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(32);
		table.getColumnModel().getColumn(1).setPreferredWidth(93);
		table.getColumnModel().getColumn(2).setPreferredWidth(102);
		table.getColumnModel().getColumn(3).setPreferredWidth(170);
		table.getColumnModel().getColumn(4).setPreferredWidth(230);
		table.setBackground(new Color(255, 255, 255));
		contentPane.add(table, BorderLayout.CENTER);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
}
