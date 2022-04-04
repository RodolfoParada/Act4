package cl.Actividad4;

import java.util.ArrayList;

public class Asientos extends Evento {
	
	 String tipoAsiento; 
	 int valorAsiento; 
	
 public Asientos(String tipoAsiento, int valorAsiento) {
		super();
		this.tipoAsiento = tipoAsiento;
		this.valorAsiento = valorAsiento;
	}

public String getTipoAsiento() {
	return tipoAsiento;
}

public void setTipoAsiento(String tipoAsiento) {
	this.tipoAsiento = tipoAsiento;
}

public int getValorAsiento() {
	return valorAsiento;
}

public void setValorAsiento(int valorAsiento) {
	this.valorAsiento = valorAsiento;
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
