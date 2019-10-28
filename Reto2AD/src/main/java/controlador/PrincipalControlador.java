package controlador;

import bbdd.Conexion;
import modelo.FechasTarifas;
import modelo.PrincipalModelo;
import vista.JframePrincipal;

public class PrincipalControlador {
	public PrincipalModelo modelo;
    public JframePrincipal vista;
    public Conexion conexion;
    
    private ControladorJframe controladorJframe;
    private ControladorPanBienvenida controladorPanBienvenida;
    public ControladorPanBuscarAlojamiento controladorPanBuscarAlojamiento;
    private ControladorPanSelHabitacion controladorPanSelHabitacion;
    private ControladorPanDetallesReserva controladorPanDetallesReserva;
    private ContrPanDetReservaAloj contrPanDetReserCasaApart;
    public ControladorPanPersonasAloj controladorPanPersonasAloj;
  
    
    /**
     * Constructor del PrincipalControlador
     * @param modelo
     * @param vista
     */
    public PrincipalControlador(PrincipalModelo modelo, JframePrincipal vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.conexion = new Conexion();
		this.funcionesPago = new FuncionesPago(modelo);
		this.funcionesRegistro = new FuncionesRegistro(modelo, this, vista);
		this.funcionesReserva = new FuncionesReserva(modelo,vista,this);
		this.funcionesValidaciones = new FuncionesValidaciones(modelo,vista,this);
		this.fechasTarifas = new FechasTarifas(modelo,vista,this);
		this.funcionesBotones = new FuncionesBotones(modelo, vista, this);
		this.funcionesOrdenar = new FuncionesOrdenar(modelo, vista, this);
		this.funcionesBasesLegales = new FuncionesBasesLegales(modelo, vista, this);
		this.funcionesCodigosPromo = new FuncionesCodigosPromo(modelo, vista, this);
		this.funcionesPersonasAlojadas = new FuncionesPersonasAlojadas(modelo, vista, this);
		this.funcionesServicios = new FuncionesServicios(modelo, vista, this);
		
    }
    /**
	 * Esta funcion se encarga de inicializar la interfaz
	 */
    public void inicializarVista() {
    	vista.setVisible(true);
    	vista.bienvenida.setVisible(true);
    	vista.buscarAlojamiento.setVisible(false);
    	vista.selHabitacion.setVisible(false);
    	vista.detallesReserva.setVisible(false);
    	vista.detallesReservaCasaApart.setVisible(false);
    	vista.panPersonasAlojadas.setVisible(false);
    	vista.pago.setVisible(false);
    	vista.vueltas.setVisible(false);
    	vista.login.setVisible(false);
    	vista.registro.setVisible(false);
    	vista.bases.setVisible(false);
    	vista.cupon.setVisible(false);
    }
    /**
	 * Esta funcion de encarga de inicializar los botones
	 */
    public void inicializarListeners() {
    	// añadimos un listener para comprobar el cierre de la aplicacion en el Jframe principal
    	this.controladorJframe = new ControladorJframe(vista);
    	this.controladorJframe.addListeners();
    	
    	// añadimos listeners a los botones del panel bienvenida
    	this.controladorPanBienvenida = new ControladorPanBienvenida(vista, this);
    	this.controladorPanBienvenida.addListeners();
    	
    	// añadimos listeners a los botones del panel 'controladorPanBuscarHotel'
    	this.controladorPanBuscarAlojamiento = new ControladorPanBuscarAlojamiento(vista, modelo, conexion, this);
    	this.controladorPanBuscarAlojamiento.addListeners();
    }
}
