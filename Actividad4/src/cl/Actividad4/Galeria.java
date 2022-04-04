package cl.Actividad4;

import java.util.ArrayList;

public class Galeria extends Evento {
	
	int PrecioGaleria; 
	int cantidadGaleria;
	boolean EnUso;
	
	public Galeria(int precioGaleria, int cantidadGaleria, boolean EnUso) {
		super();
		PrecioGaleria = precioGaleria;
		this.cantidadGaleria = cantidadGaleria;
		this.EnUso=EnUso;
	}
	
	
	
	public boolean isEnUso() {
		return EnUso;
	}



	public void setEnUso(boolean enUso) {
		EnUso = enUso;
	}



	public int getPrecioGaleria() {
		return PrecioGaleria;
	}
	public void setPrecioGaleria(int precioGaleria) {
		PrecioGaleria = precioGaleria;
	}
	public int getCantidadGaleria() {
		return cantidadGaleria;
	}
	public void setCantidadGaleria(int cantidadGaleria) {
		this.cantidadGaleria = cantidadGaleria;
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

	
}
