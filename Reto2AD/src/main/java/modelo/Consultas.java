package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consultas {

	 private Conexion conexion;
	 private Connection connection;
	    
	    
	 public Consultas(Conexion conexion) {
	    this.conexion = conexion;
	    this.connection = null;
	 }
	 //METER POR PARAMETRO EL OBJETO DE DEPARTAMENTOS
	 public void insertarDepartamentos() {

			PreparedStatement stmt = null;
			ResultSet result = null;
			int codReserva = 0;
			String query;
			int cod_dept = 10;
			String lugar = "Erreka";
			String Dnombre = "Infor";
			query = "INSERT INTO departamento (Cod_Dept, Lugar, Dnombre) VALUES (?, ?, ?)";

			try {

			    // abrimos una conexion
			    connection = conexion.conectar();

			    // preparamos la consulta INSERT
			    stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			    //Cod dept, lugar,dnombre
			 // ID,Nomrbe,apellidos,sueldo,boss(id empleado),cod_dept,jefe(si/no),puesto
			    // añadimos los valores a insertar
	//stmt.setInt(1, departamento.getCod_dept());
	//stmt.setInt(2, departamento.getLugar());	
	//stmt.setInt(3, departamento.getDnombre());
			    
			    stmt.setInt(1, cod_dept);
			    stmt.setString(2, lugar);
			    stmt.setString(3, Dnombre);
			

			    // Ejecuta la consulta y guarda los resultados en un objeto ResultSet
			    stmt.executeUpdate();

			} catch (SQLException e) {
			    e.printStackTrace();
			} finally {
			    try {
				connection.close();
			    } catch (Exception e) {
				e.printStackTrace();
			    }
			}
	 }
	 
	 //METER POR PARAMETRO EL OBJETO DE Empleado
	 public void insertarEmpleados(Empleado emple) {

			PreparedStatement stmt = null;
			ResultSet result = null;
			
			String query;
		
			query = "INSERT INTO empleado (ID, NOMBRE, APELLIDOS, SUELDO, BOSS,COD_DEPT,JEFE, PUESTO) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

			try {

			    // abrimos una conexion
			    connection = conexion.conectar();

			    // preparamos la consulta INSERT
			    stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			    // añadimos los valores a insertar

			    
			    stmt.setInt(1, emple.getId());
			    stmt.setString(2, emple.getNombre());
			    stmt.setString(3, emple.getApellido());
			    stmt.setInt(4, emple.getSueldo());
			    stmt.setInt(5, emple.getBoss());
			    stmt.setInt(6, emple.getCod_dept());
			    stmt.setBoolean(7, emple.getJefe());
			    stmt.setString(8, emple.getPuesto());
			    
			    

			    // Ejecuta la consulta y guarda los resultados en un objeto ResultSet
			    stmt.executeUpdate();

			} catch (SQLException e) {
			    e.printStackTrace();
			} finally {
			    try {
				connection.close();
			    } catch (Exception e) {
				e.printStackTrace();
			    }
			}
	 }
}
	 
