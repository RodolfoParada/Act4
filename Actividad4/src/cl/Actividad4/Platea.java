package cl.Actividad4;

import java.util.ArrayList;

public class Platea extends Evento {

	int PrecioPlatea; 
	int cantidadPlatea;
	boolean EnUso;
	
	
	public Platea(int precioPlatea, int cantidadPlatea, boolean EnUso) {
		super();
		PrecioPlatea = precioPlatea;
		this.cantidadPlatea = cantidadPlatea;
		this.EnUso = EnUso;
	}


	public boolean isEnUso(boolean EnUso) { 
		return EnUso;
	}


	public void setEnUso(boolean enUso) {
		EnUso = enUso;
	}


	public int getPrecioPlatea() {
		return PrecioPlatea;
	}


	public void setPrecioPlatea(int precioPlatea) {
		PrecioPlatea = precioPlatea;
	}


	public int getCantidadPlatea() {
		return cantidadPlatea;
	}


	public void setCantidadPlatea(int cantidadPlatea) {
		this.cantidadPlatea = cantidadPlatea;
	}


	@Override
	public void ingreso(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria, String valueOf,
			int num, int menu2) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void disponibles(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void recaudar(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}