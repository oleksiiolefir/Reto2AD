package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;


/**
 * Clase que se utiliza para establecer la conexion con la base de datos
 */
public class Conexion {
	
	private String bd;
	private String usuario;
	private String contrasena;
	private String host;
	private String url;
	private Connection connection;
	
	private final String params = "serverTimezone=UTC"; // https://stackoverflow.com/questions/26515700/mysql-jdbc-driver-5-1-33-time-zone-issue
	
	/**
	 * Constructor de la clase conexion
	 */
	public Conexion() {
		
		String[] datos = getConnectionInfo();
		
		this.connection = null;
		/*this.host = "localhost";
		this.bd = "reto4";
		this.usuario = "grupo4";
		this.contrasena = "grupo4";*/
		host = datos[0];
		bd = datos[1];
		usuario = datos[2];
		contrasena = datos[3];
		this.url = "jdbc:mysql://"+host+":3306/"+bd+"?"+params;
	}
	
	/**
	 * lee los datos de conexion a la base de datos del archivo /resources/datosBBDD.txt
	 * 
	 * @return Reotrna el array de datos con los valores adecuados
	 */
	
	public String[] getConnectionInfo() {

		String filePath = "datosBBDD.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		String[] datos = new String[4];
		String linea = "";
		int count = 0;
		
		// carga el archivo de datos en un buffer
		try {
			fileReader = new FileReader(filePath);
			buffer = new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		  
		// recorre el buffer leyendo de cada linea del archivo el substring
		// necesario y lo guarda en una entrada del array
		try {
			while ((linea = buffer.readLine()) != null) {
				datos[count] = linea.substring(linea.indexOf(":") + 2);
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return datos;
		
	}
	
	/**
	 * Comprueba la conexion con la base de datos
	 * 
	 * @return Retorna si el programa se ha podido conectar a la base de datos o no
	 */
	public Connection conectar(){
		try {
			
			connection = DriverManager.getConnection(this.url, this.usuario , this.contrasena); 
		} 
		catch (SQLException e) { 
			
			JOptionPane.showMessageDialog(null, e.getMessage(), "Alerta se va a cerrar la aplicación debido a un error", 0);
			System.exit(0);
			throw new IllegalStateException("Cannot connect the database!", e);
			
		}
		return connection;
	}
	/**
	 * Desconecta el programa de la base de datos
	 */
	public void desconectar(){
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
