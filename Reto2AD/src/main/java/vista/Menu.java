package vista;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Menu extends JPanel {

	/**
	 * Create the panel.
	 */
	public Menu() {
		setLayout(null);
		
		JButton button = new JButton("Crear nuevo usuario");
		button.setBounds(79, 36, 263, 48);
		add(button);
		
		JButton button_1 = new JButton("Consultar usuarios");
		button_1.setBounds(79, 101, 263, 48);
		add(button_1);
		
		JButton button_2 = new JButton("Crear nuevo departamento");
		button_2.setBounds(79, 157, 263, 48);
		add(button_2);
		
		JButton button_3 = new JButton("Consultar departamentos");
		button_3.setBounds(79, 216, 263, 48);
		add(button_3);

	}
}
