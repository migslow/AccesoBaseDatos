import java.util.ArrayList;

public class MyListaPeliculas {

	private ArrayList<Pelicula> lista = new ArrayList<Pelicula>();

	public MyListaPeliculas() {
	}
	
	public void add(Pelicula p) {
		lista.add(p);
	}
	
	public ArrayList<Pelicula> getListaPeliculas(){
		return lista;
	}
	

}
