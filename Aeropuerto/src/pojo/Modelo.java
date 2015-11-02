package pojo;

public class Modelo {
	private int id;
	private int capacidad;
	private String nombre;
	private String asiento;
	
	public Modelo(){
		
	}
	
	public Modelo(int capacidad, String nombre, String asiento){
		this.capacidad=capacidad;
		this.nombre=nombre;
		this.asiento=asiento;
	}
	
	public Modelo(int id, int capacidad, String nombre, String asiento){
		this.id=id;
		this.capacidad=capacidad;
		this.nombre=nombre;
		this.asiento=asiento;
	}
	
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capaciddad) {
		this.capacidad = capaciddad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}
	public String toString(){
		String diego="Id: " +id +"Capacidad: "+capacidad+" Nombre: "+nombre+" Asiento: "+asiento;
		return diego;
		
	}

}

