package cl.Actividad;

import java.awt.Event;

/*Mejorar proyecto 3.
Genere el código de una aplicacion  de consola para venta de entradas a un evento, considerando que existen 3 tipos de asientos con distinto valor:
1.	Palco   - $100.000.-
2.	Platea  - $60.000.-
3.	Galería - $30.000.-
Se debe considerar que la capacidad del evento es para 100 espectadores. Se debe mostrar en la aplicación la cantidad de entradas vendidas, las entradas disponibles y la cantidad recaudada.
*/

import java.util.ArrayList;

import java.util.Scanner;


import cl.Actividad4.Galeria;
import cl.Actividad4.IEvento;
import cl.Actividad4.Palco;
import cl.Actividad4.Platea;

public class Menu {
	 public static void main(String[] args) {
		 

		  int opcion=0;
	  
		    int num=1;

	    	Scanner leer = new Scanner(System.in);
			int Opcion;
			
			  int menu2=0;
		        int menu=0;
			 
			 ArrayList<Palco> palco = new ArrayList<>();
		     ArrayList<Galeria>galeria = new ArrayList<>();
		        ArrayList<Platea>platea = new ArrayList<>();
		        for (int i=1; i<=50; i++ ){
		            galeria.add(new Galeria(30000,50,true));
		            num+=1;
		        }
		        for (int i=1; i<=20; i++ ){
		            platea.add(new Platea(50000,20,true));
		            num+=1;
		        }
		        for (int i=1; i<=30; i++ ){
		            palco.add(new Palco(100000,30,true));
		            num+=1;
		        }
	 
	 
     do {System.out.println("Elija un asiento: ");
		System.out.println("1.- Platea");
		System.out.println("2.- Palco");
		System.out.println("3.- Galeria");
     
		
		Opcion = leer.nextInt();
		
		if(Opcion == 1) {
			IEvento disponibles = new Asiento();
            disponibles.disponibles(palco,platea,galeria);
            System.out.println(disponibles);
		}
		if(Opcion == 2) {
			palco();
		}
		if(Opcion == 3) {
			galeria();	
		
		
     }try {
          menu2 = menu;
        } catch (NumberFormatException ex) {
            System.out.println("Error !"+ ex.getMessage()+" No es un numero");
            menu2 = 100;
        }
        switch (menu2){
            case OPCION_MENU_RESERVAR:
                IEvento reserva = new Asiento();
                reserva.reservar(palco, platea, galeria, platea, num, menu);

                break;
            case OPCION_MENU_DISPONIBLES:
                IEvento disponibles = new Asiento();
                disponibles.disponibles(palco,platea,galeria);

                break;
            case OPCION_MENU_VER_RECAUDACIONES:
                IEvento recaudar =  new Asiento();
                recaudar.recaudar(palco,platea,galeria);
                break;
        }

    }while (menu2 != OPCION_MENU_SALIR);
}
private static void galeria() {
		// TODO Auto-generated method stub
		
	}
private static void palco() {
		// TODO Auto-generated method stub
		
	}
private static void platea() {
		// TODO Auto-generated method stub
		
	}
//declaracion del menú
public static final int OPCION_MENU_RESERVAR =1;
public static final int OPCION_MENU_DISPONIBLES =2;
public static final int OPCION_MENU_VER_RECAUDACIONES =3;
public static final int OPCION_MENU_SALIR = 0;
}

			
		
     
	 
