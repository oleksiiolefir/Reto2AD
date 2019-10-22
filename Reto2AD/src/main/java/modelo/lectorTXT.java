package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lectorTXT {
	public static String[] lecturaTXT() {

		
		String filePath = "datos.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		String[] datos = new String[6];
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
}
