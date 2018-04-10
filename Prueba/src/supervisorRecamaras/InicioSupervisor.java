package supervisorRecamaras;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import objetosOlvidados.RegistrodeObjetos;

import javax.swing.JSeparator;

public class InicioSupervisor extends JFrame{

	
	private JTextField textField;
	private RegistrodeObjetos registro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSupervisor window = new InicioSupervisor();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InicioSupervisor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("INICIO");
		setBounds(100, 100, 836, 445);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblEmpleado = new JLabel("Empleado #1212");
		lblEmpleado.setBounds(702, 11, 108, 14);
		getContentPane().add(lblEmpleado);
		
		JLabel lblNewLabel = new JLabel("Actualmente llevas: ");
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 18));
		lblNewLabel.setBounds(243, 109, 162, 41);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("0");
		textField.setFont(new Font("Malgun Gothic", Font.PLAIN, 18));
		textField.setEditable(false);
		textField.setBounds(412, 108, 46, 43);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("rec\u00E1maras supervisadas.");
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(468, 109, 292, 41);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Rec\u00E1maras por supervisar");
		btnNewButton.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(150, 216, 207, 56);
		getContentPane().add(btnNewButton);
		
		JButton btnObjetos = new JButton("Objetos olvidados");
		btnObjetos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro=new RegistrodeObjetos();
				registro.setVisible(true);
				dispose();
			}
		});
		btnObjetos.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		btnObjetos.setBounds(465, 216, 209, 56);
		getContentPane().add(btnObjetos);
		
		JLabel lblNewLabel_2 = new JLabel("Supervisor de rec\u00E1maras");
		lblNewLabel_2.setBounds(658, 27, 152, 14);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				if(JOptionPane.showConfirmDialog( btnSalir, "¿Seguro(a) que quieres salir?", "Sistema", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnSalir.setBounds(721, 372, 89, 23);
		getContentPane().add(btnSalir);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 52, 800, 7);
		getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 354, 800, 7);
		getContentPane().add(separator_1);
	}
}
