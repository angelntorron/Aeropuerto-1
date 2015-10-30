package pojo;

import java.sql.Date;

public class Trabajador {
	private int id;
	private String tripulacion;
	private String nombre;
	private Date fechaDeNacimiento;
	private Date fechaInicioTrabajo;
	
	
	public Trabajador(){
		
	}
	public Trabajador(String tripu, String nombre, Date fechaDeNacimiento, Date fechaInicioTrabajo){
		this.tripulacion=tripu;
		this.nombre=nombre;
		this.fechaDeNacimiento=fechaDeNacimiento;
		this.fechaInicioTrabajo=fechaInicioTrabajo;
		
	}
	
	public Trabajador(int id, String tripulacion, String nombre, Date fechaDeNacimiento, Date fechaInicioTrabajo){
		this.id=id;
		this.tripulacion=tripulacion;
		this.nombre=nombre;
		this.fechaDeNacimiento=fechaDeNacimiento;
		this.fechaInicioTrabajo=fechaInicioTrabajo;
	}
	
	public String toString(){
		String c = new String();
		c = "Id: "+id +"\n"+"Tripulacion: "+tripulacion +"\n"+"nombre:"+nombre+"\n"+"Fecha de Nacimiento:" + 
		fechaDeNacimiento+"\n"+"Fecha De inicio de contrato:"+ fechaInicioTrabajo;
		return c;
	}
		
	
	public String getTripulacion(){
		return tripulacion;
		
	}
	public void setTripulacion(String a){
		this.tripulacion= a;
		
		
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public Date getFechaInicioTrabajo() {
		return fechaInicioTrabajo;
	}
	public void setFechaInicioTrabajo(Date fechaInicioTrabajo) {
		this.fechaInicioTrabajo = fechaInicioTrabajo;
	}
	
	

}
