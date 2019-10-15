package modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class lectorTXT {
	public static String funcionDeLectorDeTxt(String archivo) {	
		// Fichero del que queremos leer
				File fichero = new File(archivo);
				Scanner s = null;
				String linea = "";
 
				try {
					// Leemos el contenido del fichero
					//System.out.println("... Leemos el contenido del fichero ...");
					s = new Scanner(fichero);

					// Leemos linea a linea el fichero
					while (s.hasNextLine()) 
					{
						linea = s.nextLine(); 	// Guardamos la linea en un String
						System.out.println(linea);      // Imprimimos la linea
						return linea;
					}

				} 
				catch (Exception ex) 
				{
					System.out.println("Mensaje: " + ex.getMessage());
				} 
				finally
				{
					// Cerramos el fichero tanto si la lectura ha sido correcta o no
					try 
					{
						if (s != null)
							s.close();
						} catch (Exception ex2) 
					{
						System.out.println("Mensaje 2: " + ex2.getMessage());
						return  ex2.getMessage();
					}
				}
				return linea;
			}
	
	
	public static void escritorTXT(String archivo)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }

}
