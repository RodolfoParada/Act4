package cl.Actividad;

import java.util.ArrayList;
import java.util.Scanner;

import cl.Actividad4.Galeria;
import cl.Actividad4.IEvento;
import cl.Actividad4.Palco;
import cl.Actividad4.Platea;

public class Asiento implements IEvento {

	
	public void disponibles(ArrayList<Palco> palcoList, ArrayList<Platea> plateaList, ArrayList<Galeria> galeriaList) {
        System.out.println("Estos son los asientos disponibles ");
        for(int i= 0 ; i<galeriaList.size(); i++){
            if (!galeriaList.get(i).isEnUso()){
                System.out.println("Asiento "+galeriaList.get(i).getCantidadGaleria() +" numero ["+galeriaList.get(i).getPrecioGaleria()+"]");
            }
        }
        for(int i= 0 ; i<plateaList.size(); i++){
            if (!plateaList.get(i).isEnUso(false)){
                System.out.println("Asiento "+plateaList.get(i).getCantidadPlatea()+" numero ["+
                        plateaList.get(i).getCantidadPlatea()+"] "+ plateaList.get(i).toString());
            }
        }
        for(int i= 0 ; i<palcoList.size(); i++){
            if (!palcoList.get(i).isEnUso()){
                System.out.println("Asiento "+palcoList.get(i).getCantidadPalco() +" numero ["
                        +palcoList.get(i).getCantidadPalco()+"] "+palcoList.get(i).toString());
            }
        }
    }

    @Override
    public void recaudar(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria) {
        int reservpalco = 0;
        int reservgaleria = 0;
        int reservplatea = 0;
        int cantidadpalco = 0;
        int cantidadplatea = 0;
        int cantidadgaleria = 0;
        int totalVenta;
        int totalNAsiento;
        for (int i = 0; i < galeria.size(); i++) {
            if (galeria.get(i).isEnUso()) {
                reservgaleria += galeria.get(i).getPrecioGaleria();
                cantidadgaleria += 1;
            }
        }
        for (int e = 0; e < platea.size(); e++) {
            if (platea.get(e).isEnUso(false)) {
                reservplatea += platea.get(e).getPrecioPlatea();
                cantidadplatea += 1;
            }
        }
        for (int u = 0; u < palco.size(); u++) {
            if (palco.get(u).isEnUso()) {
                reservpalco += palco.get(u).getPrecioPlatea();
                cantidadpalco += 1;
            }
        }


        totalVenta = reservpalco + reservgaleria + reservplatea;
        totalNAsiento = cantidadpalco + cantidadplatea + cantidadgaleria;
        System.out.println("Se han vendido " + totalNAsiento + " asientos y se han recaudado $" + totalVenta + " Donde:");
        System.out.println(cantidadplatea + " son de platea, " + cantidadpalco + " son de palco y "
                + cantidadgaleria + " son de galeria");
    }

    @Override
    public void reservar(ArrayList<Palco> palcoList, ArrayList<Platea> plateaList, ArrayList<Galeria> galeriaList,
                         String opcion, int numeral, int menu2) {
        Scanner scan = new Scanner(System.in);
        boolean bandera = true;
        //platea tiene asientos desde el 34 al 66, galeria tiene asientos desde 1 al 33 y los demas son palco
        System.out.println("Los asientos de galeria son desde el [1 hasta el 33], platea desde [34 al 66] y palco " +
                "desde [67 al 100]");
        System.out.println("escriba el numero del asiento que desea");
        opcion=scan.nextLine();
        try {
            menu2 = Integer.parseInt(opcion);
        } catch (NumberFormatException ex) {
            System.out.println("Error !"+ ex.getMessage()+" No es un numero");
            menu2 = 100;
        }
        ArrayList<Palco> palco;
		for (int i=0; i< palco.size(); i++) {
            if (palcoList.get(e) == menu2) {
                bandera = false;
                if (!palcoList.get(i).isEnUso()) {
                    palcoList.get(i).setEnUso(bandera););
                    System.out.println("Usted acaba de reservar un asiento en palco");
                } else {
                    System.out.println("No puede reservar el asiento ya que se encuentra reservado con antelacion");
                }
            }
        }
        for (int o=0; o<plateaList.size(); o++) {
            if (plateaList.get(o).getCantidadPlatea() == menu2) {
                bandera = false;
                if (!plateaList.get(o).isEnUso(false)) {
                    plateaList.get(o).setEnUso(true);
                    System.out.println("Usted acaba de reservar un asiento en platea");
                } else {
                    System.out.println("No puede reservar el asiento ya que se encuentra reservado con antelacion");
                }
            }
        }
        for (int u=0; u<plateaList.size(); u++) {
            if (galeriaList.get(u).() == menu2) {
                bandera = false;
                if (!galeriaList.get(u).isEnUso()) {
                    galeriaList.get(u).isEnUso();
                    System.out.println("Usted acaba de reservar un asiento en galeria");
                } else {
                    System.out.println("No puede reservar el asiento ya que se encuentra reservado con antelacion");
                }
            }
        }
        if (bandera){
            System.out.println("el numero ingresado mayor a 100");
        }
    }


	@Override
	public void ingeso() {
		// TODO Auto-generated method stub

	}

	@Override
	public void salida() {
		// TODO Auto-generated method stub

	}

	@Override
	public void CantidadPublico() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ingreso(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria, String valueOf,
			int num, String menu) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void reservar(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria, Object object,
			int num, String menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reservar(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria, Object object,
			int num, int menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ingreso(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria, String valueOf,
			int num, int menu2) {
		// TODO Auto-generated method stub
		
	}
	
}