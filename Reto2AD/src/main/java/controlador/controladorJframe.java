package controlador;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import vista.JframePrincipal;

public class controladorJframe {
	private JframePrincipal vista;
	
	public controladorJframe(JframePrincipal vista) {
		this.vista = vista;
	}
	
	/**
	 * Este metodo lo que hace es crear un listener y añade una ventana adaptada
	 */
	public void addListeners() {
		vista.addWindowListener(new WindowAdapter() {
			/**
			 * Este metodo muestra una ventana de confirmación para salir del programa.
			 */
			public void windowClosing(WindowEvent e) {
				// Se pide una confirmación antes de finalizar el programa
	            if (JOptionPane.showConfirmDialog(vista, "¿Estas seguro que quieres salir de la aplicación?", "Salir de la aplicación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
	            	System.exit(0);
	            }
			}
		});
	}
}
