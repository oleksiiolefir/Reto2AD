package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Menu {

	private JFrame frame;
	private JButton btnNewButton, btnConsultarUsuarios, btnCrearNuevoDepartamento, btnConsultarDepartamentos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Crear nuevo usuario");
		btnNewButton.setBounds(144, 84, 263, 48);
		frame.getContentPane().add(btnNewButton);
		
		btnConsultarUsuarios = new JButton("Consultar usuarios");
		btnConsultarUsuarios.setBounds(144, 143, 263, 48);
		frame.getContentPane().add(btnConsultarUsuarios);
		
		btnCrearNuevoDepartamento = new JButton("Crear nuevo departamento");
		btnCrearNuevoDepartamento.setBounds(144, 199, 263, 48);
		frame.getContentPane().add(btnCrearNuevoDepartamento);
		
		btnConsultarDepartamentos = new JButton("Consultar departamentos");
		btnConsultarDepartamentos.setBounds(144, 258, 263, 48);
		frame.getContentPane().add(btnConsultarDepartamentos);
	}
}
