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
import javax.swing.JSeparator;

public class InicioSupervisor {

	private JFrame frameSupervisor;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSupervisor window = new InicioSupervisor();
					window.frameSupervisor.setVisible(true);
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
		frameSupervisor = new JFrame();
		frameSupervisor.setTitle("INICIO");
		frameSupervisor.setBounds(100, 100, 836, 445);
		frameSupervisor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameSupervisor.getContentPane().setLayout(null);
		
		JLabel lblEmpleado = new JLabel("Empleado #1212");
		lblEmpleado.setBounds(702, 11, 108, 14);
		frameSupervisor.getContentPane().add(lblEmpleado);
		
		JLabel lblNewLabel = new JLabel("Actualmente llevas: ");
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 18));
		lblNewLabel.setBounds(243, 109, 162, 41);
		frameSupervisor.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("0");
		textField.setFont(new Font("Malgun Gothic", Font.PLAIN, 18));
		textField.setEditable(false);
		textField.setBounds(412, 108, 46, 43);
		frameSupervisor.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("rec\u00E1maras supervisadas.");
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(468, 109, 292, 41);
		frameSupervisor.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Rec\u00E1maras por supervisar");
		btnNewButton.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(150, 216, 207, 56);
		frameSupervisor.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Objetos olvidados");
		btnNewButton_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		btnNewButton_1.setBounds(465, 216, 209, 56);
		frameSupervisor.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Supervisor de rec\u00E1maras");
		lblNewLabel_2.setBounds(658, 27, 152, 14);
		frameSupervisor.getContentPane().add(lblNewLabel_2);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameSupervisor = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frameSupervisor, "¿Seguro(a) que quieres salir?", "Sistema", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnSalir.setBounds(721, 372, 89, 23);
		frameSupervisor.getContentPane().add(btnSalir);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 52, 800, 7);
		frameSupervisor.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 354, 800, 7);
		frameSupervisor.getContentPane().add(separator_1);
	}
}
