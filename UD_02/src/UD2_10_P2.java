import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;

public class UD2_10_P2 {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws FileNotFoundException {
        XStream xs = new XStream();
        xs.alias("peliculas", MyListaPeliculas.class);
        xs.alias("pelicula", Pelicula.class);
        xs.addImplicitCollection(MyListaPeliculas.class, "lista");

        MyListaPeliculas listadoTodos = (MyListaPeliculas) xs.fromXML(new FileInputStream("Ficheros\\Peliculas.xml"));
        System.out.println("Numero de peliculas: " + listadoTodos.getListaPeliculas().size());
        for (Pelicula p : listadoTodos.getListaPeliculas()) {
            System.out.println(p);
        }
        System.out.println("Fin del listado....");
    }
}

