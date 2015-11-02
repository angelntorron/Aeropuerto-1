package pojo;

public class Billete {
	private int id;
	private String clase;
	private int asiento;
	private Vuelo vuelo;
	private Pasajero pasajero;
	
	public Billete(){
		
	}
	public Billete(int id, String clase, int asiento, Vuelo vuelo, Pasajero pasajero){
		this.id=id;
		this.clase=clase;
		this.asiento=asiento;
		this.vuelo=vuelo;
		this.pasajero=pasajero;
	}
	
	public Billete(String clase, int asiento, Vuelo vuelo, Pasajero pasajero){
		this.clase=clase;
		this.asiento=asiento;
		this.vuelo=vuelo;
		this.pasajero=pasajero;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getClase(){
		return clase;
	}
	public void setClase(String c){
		clase=c;
	}
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	public String getVuelo(){
		return vuelo.toString(); //La verdad que no estoy muy seguro de que este get sea necesario..
	}
	
	public void setVuelo(Vuelo vuelo){
		this.vuelo=vuelo; //y esto es un buen triple
	}
	public String getPasajero(){
		return pasajero.toString();
	}
	public void setPasajero(Pasajero pasajero){ //y ya puestos a tirar de tres..
		this.pasajero=pasajero;
	}
	public String toString(){
		String a="Id: "+id+" clase: "+clase+" asiento: "+asiento+" vuelo: "+ vuelo+" pasajero: "+pasajero;
		return a;
	}
	// Falta el equals y el hashcode pero al intentar generarlos me da error por lo de la foreign key
}
