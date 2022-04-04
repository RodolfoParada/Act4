package cl.Actividad4;

import java.util.ArrayList;

public class Palco extends Evento {
	
	int PrecioPlatea; 
	int cantidadPlatea;
	boolean EnUso;
	
	public Palco(int precioPlatea, int cantidadPlatea, boolean EnUso) {
		super();
		PrecioPlatea = precioPlatea;
		this.cantidadPlatea = cantidadPlatea;
		this.EnUso = EnUso;
	}

	public boolean isEnUso() {
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

	@Override
	public void ingreso(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria, String valueOf,
			int num, String menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reservar(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria, Object object,
			int num, int menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reservar(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria, Object object,
			int num, String menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reservar(ArrayList<Palco> palcoList, ArrayList<Platea> plateaList, ArrayList<Galeria> galeriaList,
			String opcion, int numeral, int menu2) {
		// TODO Auto-generated method stub
		
	}

	public String getCantidadPalco() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
