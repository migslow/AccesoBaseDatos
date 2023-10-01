import java.io.FileOutputStream;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class UD2_10_P1 {
	public static void main(String[] args) {
		MyListaPeliculas peliculas = new MyListaPeliculas();
		peliculas.add(new Pelicula(1, 1990, "Pelicula 1", "Era se una vez"));
		peliculas.add(new Pelicula(2, 2021, "Pelicula 2", "Esto empieza asi"));
		peliculas.add(new Pelicula(3, 1999, "Pelicula 3", "Si, soy yo"));
		peliculas.add(new Pelicula(4, 1996, "Pelicula 4", "En una realidad muy lejana"));
		try {
			XStream xs = new XStream(new DomDriver("UTF-8"));
			xs.alias("peliculas", MyListaPeliculas.class);
			xs.alias("pelicula", Pelicula.class);
			xs.addImplicitCollection(MyListaPeliculas.class, "lista");
			xs.toXML(peliculas, new FileOutputStream("Ficheros\\Peliculas.xml"));
			System.out.println("Creando fichero XML...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
