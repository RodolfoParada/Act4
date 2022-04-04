package cl.Actividad4;

import java.util.ArrayList;

public interface IEvento {

	void ingeso();
	void salida();
	void CantidadPublico();
	
	 void ingreso(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria, String valueOf,
			int num, String menu);
	
	 void disponibles(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria);
	
	void recaudar(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria);
	void reservar(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria, Object object, int num,
			int menu);
	void ingreso(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria, String valueOf, int num,
			int menu2);
	void reservar(ArrayList<Palco> palco, ArrayList<Platea> platea, ArrayList<Galeria> galeria, Object object, int num,
			String menu);
	void reservar(ArrayList<Palco> palcoList, ArrayList<Platea> plateaList, ArrayList<Galeria> galeriaList,
			String opcion, int numeral, int menu2);

}
