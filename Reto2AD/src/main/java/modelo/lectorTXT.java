package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class lectorTXT {
	public static String[] lecturaTXT() throws IOException {
		String s1;
        String s2;
        String[] datos = new String[8];
        
        // Cargamos el buffer con el contenido del archivo
        BufferedReader br = new BufferedReader (new FileReader ("datos.txt"));
 
        // s1 será la primera línea
        s1 = br.readLine(); 
 
        int numTokens = 0;
        StringTokenizer st = new StringTokenizer (s1);
 
        // bucle por todas las palabras
        while (st.hasMoreTokens())
        {       	
            s2 = st.nextToken(";");
            datos[numTokens]=s2;
            numTokens++;
            //System.out.println ("    Palabra " + numTokens + " es: " + s2);
        }


		return datos;
		
	}
}
