package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CrearUsuario extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public CrearUsuario() {
		setLayout(null);
		
		JLabel label = new JLabel("Codigo de empleado: ");
		label.setBounds(25, 30, 137, 19);
		add(label);
		
		JLabel label_1 = new JLabel("Nombre: ");
		label_1.setBounds(25, 60, 137, 19);
		add(label_1);
		
		JLabel label_2 = new JLabel("Primer apellido: ");
		label_2.setBounds(25, 90, 137, 19);
		add(label_2);
		
		JLabel label_3 = new JLabel("Sueldo: ");
		label_3.setBounds(25, 120, 137, 19);
		add(label_3);
		
		JLabel label_4 = new JLabel("Departamento del empleado: ");
		label_4.setBounds(25, 150, 153, 19);
		add(label_4);
		
		JLabel label_5 = new JLabel("Cargo del empleado: ");
		label_5.setBounds(25, 180, 137, 19);
		add(label_5);
		
		JLabel label_6 = new JLabel("\u00BFTiene a alguien a cargo? (Si/No)");
		label_6.setBounds(25, 210, 164, 19);
		add(label_6);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(260, 29, 120, 19);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(260, 59, 120, 19);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(260, 89, 120, 19);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(260, 119, 120, 19);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(260, 149, 120, 19);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(260, 179, 120, 19);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(260, 209, 120, 19);
		add(textField_6);
		
		JLabel label_7 = new JLabel("Jefe asignado: ");
		label_7.setBounds(25, 241, 164, 19);
		add(label_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(260, 240, 120, 19);
		add(textField_7);

	}
}
