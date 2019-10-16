package modelo;

public class Departamento {
	private int cod_dept;
	private String lugar;
	private String dnombre;
	
	public Departamento(int cod_dept, String lugar, String dnombre) {
		super();
		this.cod_dept = cod_dept;
		this.lugar = lugar;
		this.dnombre = dnombre;
	}
	public int getCod_dept() {
		return cod_dept;
	}
	public void setCod_dept(int cod_dept) {
		this.cod_dept = cod_dept;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getDnombre() {
		return dnombre;
	}
	public void setDnombre(String dnombre) {
		this.dnombre = dnombre;
	}
	
}
