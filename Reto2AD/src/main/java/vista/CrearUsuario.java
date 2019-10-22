package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CrearUsuario {

	private JFrame frame;
	private JTextField tfCodEmple, tfNombre, tfApellido, tfSueldo, tfDeptEmple, tfCargo, tfJefe, tfJefeAsig;
	private JLabel lblCodigoDeEmpleado, lblNombre, lblPrimerApellido, lblSueldo, lblDepartamentoDelEmpleado, lblCargoDelEmpleado, lbltieneAAlguien, lblJefeAsignado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearUsuario window = new CrearUsuario();
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
	public CrearUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblCodigoDeEmpleado = new JLabel("Codigo de empleado: ");
		lblCodigoDeEmpleado.setBounds(10, 12, 137, 19);
		frame.getContentPane().add(lblCodigoDeEmpleado);
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(10, 42, 137, 19);
		frame.getContentPane().add(lblNombre);
		
		lblPrimerApellido = new JLabel("Primer apellido: ");
		lblPrimerApellido.setBounds(10, 72, 137, 19);
		frame.getContentPane().add(lblPrimerApellido);
		
		lblSueldo = new JLabel("Sueldo: ");
		lblSueldo.setBounds(10, 102, 137, 19);
		frame.getContentPane().add(lblSueldo);
		
		lblDepartamentoDelEmpleado = new JLabel("Departamento del empleado: ");
		lblDepartamentoDelEmpleado.setBounds(10, 132, 153, 19);
		frame.getContentPane().add(lblDepartamentoDelEmpleado);
		
		lblCargoDelEmpleado = new JLabel("Cargo del empleado: ");
		lblCargoDelEmpleado.setBounds(10, 162, 137, 19);
		frame.getContentPane().add(lblCargoDelEmpleado);
		
		lbltieneAAlguien = new JLabel("\u00BFTiene a alguien a cargo? (Si/No)");
		lbltieneAAlguien.setBounds(10, 192, 164, 19);
		frame.getContentPane().add(lbltieneAAlguien);
		
		tfCodEmple = new JTextField();
		tfCodEmple.setBounds(245, 11, 120, 19);
		frame.getContentPane().add(tfCodEmple);
		tfCodEmple.setColumns(10);
		
		tfNombre = new JTextField();
		tfNombre.setColumns(10);
		tfNombre.setBounds(245, 41, 120, 19);
		frame.getContentPane().add(tfNombre);
		
		tfApellido = new JTextField();
		tfApellido.setColumns(10);
		tfApellido.setBounds(245, 71, 120, 19);
		frame.getContentPane().add(tfApellido);
		
		tfSueldo = new JTextField();
		tfSueldo.setColumns(10);
		tfSueldo.setBounds(245, 101, 120, 19);
		frame.getContentPane().add(tfSueldo);
		
		tfDeptEmple = new JTextField();
		tfDeptEmple.setColumns(10);
		tfDeptEmple.setBounds(245, 131, 120, 19);
		frame.getContentPane().add(tfDeptEmple);
		
		tfCargo = new JTextField();
		tfCargo.setColumns(10);
		tfCargo.setBounds(245, 161, 120, 19);
		frame.getContentPane().add(tfCargo);
		
		tfJefe = new JTextField();
		tfJefe.setColumns(10);
		tfJefe.setBounds(245, 191, 120, 19);
		frame.getContentPane().add(tfJefe);
		
		lblJefeAsignado = new JLabel("Jefe asignado: ");
		lblJefeAsignado.setBounds(10, 223, 164, 19);
		frame.getContentPane().add(lblJefeAsignado);
		
		tfJefeAsig = new JTextField();
		tfJefeAsig.setColumns(10);
		tfJefeAsig.setBounds(245, 222, 120, 19);
		frame.getContentPane().add(tfJefeAsig);
	}
}
