package Launcher;

import java.io.IOException;

import modelo.Conexion;
import modelo.Consultas;
import modelo.Empleado;
import modelo.lecturaCSV;
public class launcher {
	static String archivoCsv = "ArchivoCSV.csv";
	
	public static void main(String[] args) throws IOException {
		
		Conexion c = new Conexion();

		c.conectar();

		Consultas consult = new Consultas(c);
		
	//	lecturaCSV.funcionesDeLectorCsv(archivoCsv);
		
		String [] datos1 = modelo.lectorTXT.lecturaTXT();

		for (int i = 0; i < datos1.length; ++i) {
		    System.out.println(datos1[i]);
		}
		
		Empleado emple = new Empleado();
		
		emple.setId(Integer.parseInt(datos1[0]));
		emple.setNombre(datos1[1]);
		emple.setApellido(datos1[2]);
		emple.setSueldo(Integer.parseInt(datos1[3]));
		emple.setBoss(Integer.parseInt(datos1[4]));
		emple.setCod_dept(Integer.parseInt(datos1[5]));
		emple.setJefe(Boolean.parseBoolean(datos1[6]));
		emple.setPuesto(datos1[7]);
		
		
		
		consult.insertarEmpleados(emple);

	}

}
