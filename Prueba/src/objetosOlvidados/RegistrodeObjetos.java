package objetosOlvidados;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import supervisorRecamaras.InicioSupervisor;//ventana de supervisor
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;//spinner
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.SystemColor;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import javax.swing.JTextPane;

public class RegistrodeObjetos extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private InicioSupervisor inicioSupervisor;
	private Lista listadeObjetos;

	// private DefaultListModel<Objeto> modelo;//arreglo de objetos

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrodeObjetos frame = new RegistrodeObjetos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RegistrodeObjetos() {
		setResizable(false);
		setBackground(new Color(255, 255, 255));
		setTitle("R E G I S T R O    DE   O B J E T O S   O L V I D A D OS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 102, 51));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblF = new JLabel("Fecha D/M/A");
		lblF.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblF.setBounds(62, 90, 105, 20);
		panel.add(lblF);

		JLabel lblNewLabel = new JLabel("N\u00FAmero de habitaci\u00F3n:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(62, 140, 193, 26);
		panel.add(lblNewLabel);

		JLabel lblDescripcinDelObjeto = new JLabel("Descripci\u00F3n del objeto:");
		lblDescripcinDelObjeto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDescripcinDelObjeto.setBounds(519, 59, 201, 20);
		panel.add(lblDescripcinDelObjeto);
		// boton guardar
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setIcon(new ImageIcon(
				RegistrodeObjetos.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listadeObjetos = new Lista();
				listadeObjetos.setVisible(true);
				dispose();// cerrar ventana
			}
		});
		btnGuardar.setForeground(new Color(0, 0, 0));
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnGuardar.setBounds(632, 322, 155, 34);
		panel.add(btnGuardar);

		// boton cancelar
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setIcon(
				new ImageIcon(RegistrodeObjetos.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicioSupervisor = new InicioSupervisor();
				inicioSupervisor.setVisible(true);
				dispose();// cerrar ventana
			}
		});
		btnCancelar.setForeground(new Color(255, 0, 0));
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCancelar.setBounds(62, 322, 155, 34);
		panel.add(btnCancelar);

		// rango de valor de los dias
		SpinnerNumberModel modelDia = new SpinnerNumberModel(new Integer(0), // inicio
				new Integer(0), // Límite inferior
				new Integer(31), // Límite superior
				new Integer(1) // incremento-decremento
		);
		JSpinner spinnerDia = new JSpinner(modelDia);
		spinnerDia.setForeground(SystemColor.info);
		spinnerDia.setBounds(192, 93, 63, 20);
		panel.add(spinnerDia);

		// rango de valor para los meses
		SpinnerNumberModel modelMes = new SpinnerNumberModel(new Integer(0), new Integer(0), new Integer(12),
				new Integer(1));
		JSpinner spinnerMes = new JSpinner(modelMes);
		spinnerMes.setForeground(SystemColor.info);
		spinnerMes.setBounds(265, 93, 62, 20);
		panel.add(spinnerMes);

		// rango de valor para los años
		SpinnerNumberModel modelAno = new SpinnerNumberModel(new Integer(2000), new Integer(2000), new Integer(2030),
				new Integer(1));
		JSpinner spinnerAño = new JSpinner(modelAno);
		spinnerAño.setForeground(SystemColor.info);
		spinnerAño.setBounds(335, 93, 63, 20);
		panel.add(spinnerAño);

		// rango de valor de las habitaciones
		SpinnerNumberModel modelHabitacion = new SpinnerNumberModel(new Integer(1200), new Integer(1200),
				new Integer(1300), new Integer(1));
		JSpinner spinnerHabitacion = new JSpinner(modelHabitacion);
		spinnerHabitacion.setForeground(new Color(173, 216, 230));
		spinnerHabitacion.setBounds(279, 146, 63, 20);
		panel.add(spinnerHabitacion);

		JLabel lblNombreDeLa = new JLabel("Nombre de la Recamarista:");
		lblNombreDeLa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNombreDeLa.setBounds(62, 192, 265, 20);
		panel.add(lblNombreDeLa);

		txtNombre = new JTextField();
		txtNombre.setBounds(62, 223, 428, 23);
		panel.add(txtNombre);
		txtNombre.setColumns(10);

		JTextPane textDescripcion = new JTextPane();
		textDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textDescripcion.setBounds(519, 90, 268, 162);
		panel.add(textDescripcion);
	}
}
