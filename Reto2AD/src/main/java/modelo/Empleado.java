package modelo;

public class Empleado {
	private int id;
	private String nombre;
	private int boss;
	private int cod_dept;	
	
	public Empleado(int id, String nombre, int boss, int cod_dept, Boolean jefe, String puesto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.boss = boss;
		this.cod_dept = cod_dept;
		this.jefe = jefe;
		this.puesto = puesto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getBoss() {
		return boss;
	}
	public void setBoss(int boss) {
		this.boss = boss;
	}
	public int getCod_dept() {
		return cod_dept;
	}
	public void setCod_dept(int cod_dept) {
		this.cod_dept = cod_dept;
	}
	public Boolean getJefe() {
		return jefe;
	}
	public void setJefe(Boolean jefe) {
		this.jefe = jefe;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	private Boolean jefe;
	private String puesto;
}
