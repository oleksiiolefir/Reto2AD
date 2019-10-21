package Launcher;

import modelo.Conexion;

public class launcher {

	public static void main(String[] args) {
		Conexion c = new Conexion();
		c.conectar();
		String [] datos = modelo.lectorTXT.lecturaTXT();

		for (int i = 0; i < datos.length; ++i) {
		    System.out.println(datos[i]);
		}
		
	}

}
