package Launcher;

import modelo.Conexion;

public class launcher {

	public static void main(String[] args) {
		Conexion c = new Conexion();
		c.conectar();
	}

}
