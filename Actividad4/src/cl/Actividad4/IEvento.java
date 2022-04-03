package cl.Actividad4;

import java.util.ArrayList;

public interface IEvento {

	public void ingeso();
	public void salida();
	public void CantidadPublico();
	
	public void ingreso(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria, String valueOf,
			int num, int menu2);
	
	public void disponibles(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria);
	
	public void recaudar(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria);

}
