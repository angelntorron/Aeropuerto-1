package dbM;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import pojo.Pista;
import pojo.Trabajador;

public class DbMenu{
	
	private static DbManager gestor;
	private static Scanner sc=new Scanner(System.in);
	
	public static void opcion1(){
		
	
		System.out.println("¿Quieres crear las tablas? (y/n)");
		String crearTablas=sc.nextLine();
		if(crearTablas.equalsIgnoreCase("y") || crearTablas.equalsIgnoreCase("s")){
			
			gestor.createTablaModelo();
			gestor.createTablaPista();
			gestor.createTablaTripulacion();
			
			
		}
		
		
		
		
		System.out.println("¿Qué quieres hacer? \n"
				+ "1.Añadir elemento \n"
				+ "2.Ver tabla \n"
				+ "3.Salir");
		
		
		int opcion1=Integer.parseInt(sc.nextLine());
		 switch(opcion1){
		 case 1: 
			 menu2();
			 
			/*
			 // String estado = sc.nextLine();
			 System.out.println("Introduzca los datos de la pista:");
			 System.out.println("Estado:");
			
			 String estado = sc.nextLine();
			 System.out.println("AAAAAA:"+estado);
		     
		     System.out.println("Orientacion:");
		     String orientacion = sc.nextLine();
		     
		   
		     System.out.println("Longitud:");
		     int longitud = sc.nextInt();
		     
		     
		     Pista p1 = new Pista(estado, orientacion, longitud);
		     
		     gestor.insertTablaPista(p1);
			 
			 */
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 break;
		 case 2: 
			 
			 List<Trabajador> trabajador1=gestor.selectTrabajador();
			 
			for(Trabajador trabajador:trabajador1){
				System.out.println(trabajador.toString());
			}
			 
			 /* List<Pista> listaPista = gestor.selectPista();
		for (Pista pista : listaPista) {
			System.out.println(pista.toString());
		}
			 break;
			 */
			 break;
			// menu3();
		 case 3: 
			 opcion1();
			 break;
		 default: System.out.println("Opción no válida");
		 }
	}public static void main(String []args) {
		gestor = new DbManager("Airport.db");
		opcion1();
		
	}
	
	public static void menu2(){
		System.out.println("¿En qué tabla quieres añadir el elemento?");
		System.out.println("1.Trabajador \n"
				+ "2.Aerolínea \n"
				+ "3.Modelo \n"
				+ "4.Pista \n"
				+ "5.Billete \n"
				+ "6.Pasajero \n"
				+ "7.Equipaje \n"
				+ "8.Terminal \n"
				+ "9.Vuelo \n"
				+ "10.Avión");
	
	int a=sc.nextInt();
	sc.nextLine();
	switch(a){
		case 1: 
		System.out.println("¿A qué tripulación pertenece: ");
		String tripulacion=sc.nextLine();
		
		System.out.println("Nombre del trabajador: ");
		String nombre=sc.nextLine();
		
		System.out.println("Fecha de nacimiento (yyyy-MM-dd)");
		String fechaNacimiento1 = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate p = LocalDate.parse(fechaNacimiento1, formatter);
		Date fechaNacimiento =Date.valueOf(p);
		
		System.out.println("Fecha inicio contrato (yyyy-MM-dd");
		String fechaContrato1=sc.nextLine();
		LocalDate p2 = LocalDate.parse(fechaContrato1, formatter);
		Date fechaContrato=Date.valueOf(p2);
		
		Trabajador trabajador1=new Trabajador(tripulacion, nombre, fechaNacimiento, fechaContrato);
		gestor.insertTablaTripulacion(trabajador1);
		case 2:
			
		
	}
	}
	public static void menu3(){
		
	}
}
