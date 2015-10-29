package dbM;

import java.util.List;
import java.util.Scanner;

import pojo.Pista;

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
				+ "1.Añadir tripulante \n"
				+ "2.Ver tripulante \n"
				+ "3.Salir");
		
		int opcion1=Integer.parseInt(sc.nextLine());
		 switch(opcion1){
		 case 1: 
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
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 break;
		 case 2:  List<Pista> listaPista = gestor.selectPista();
		for (Pista pista : listaPista) {
			System.out.println(pista.toString());
		}
			 break;
		 case 3: 
			 break;
		 default: System.out.println("Opción no válida");
		 }
	}public static void main(String []args) {
		gestor = new DbManager("Airport.db");
		opcion1();
		
	}
}
