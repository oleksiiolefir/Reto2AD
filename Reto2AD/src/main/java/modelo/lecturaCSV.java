package modelo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class lecturaCSV {
	public static final String SEPARATOR=";";
	public static final String QUOTE="[";
	
	public static String[] funcionesDeLectorCsv(String archivo)  throws IOException 
	{
		String [] fields = null;
		BufferedReader br = null;
		String [] datos ={" "," "," "};
		try 
		{     
			br =new BufferedReader(new FileReader(archivo));
			String line = br.readLine();
			
			while (null!=line) 
			{
				System.out.println("AAAAAA");
				for (int i=0;i<5;i++) {
					System.out.println("AAAAAA");
					fields = line.split(SEPARATOR);
					System.out.println(fields[i]);
					System.out.println("AAAAAA");
					datos[i] = fields[i];
					System.out.println("BBBB");
					
					System.out.println("EL Array datos es "+ datos[i]);

					line = br.readLine();

				}				
				
			}
   
		}
		catch (Exception e)
		{
			//Insercción excepción correspondiente
		}
		finally
		{
			if (null!=br) {
          br.close();
			}
		}
		
		return datos;

	}
	public static void pasarChar(String[] datos) {
		for(int i = 0; i<datos.length;i++) {
			System.out.println("Se muestran letras " +datos[i] );
		}
	}
	 
	
}
