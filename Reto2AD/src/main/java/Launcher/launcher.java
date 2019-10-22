package Launcher;

import java.io.IOException;

import modelo.Conexion;
import modelo.lecturaCSV;

public class launcher {
	static String archivoCsv = "ArchivoCSV.csv";
	
	public static void main(String[] args) throws IOException {
		Conexion c = new Conexion();
		c.conectar();
		
		
		lecturaCSV.funcionesDeLectorCsv(archivoCsv);
	}

}
