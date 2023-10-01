import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class UD2_11_P1 {
	public static void main(String[] args) {
		try {
			List<Pelicula> peliculas = Arrays.asList(new Pelicula(1, 1990, "Pelicula 1", "Era se una vez"),
					new Pelicula(2, 2021, "Pelicula 2", "Esto empieza asi"),
					new Pelicula(3, 1999, "Pelicula 3", "Si, soy yo"),
					new Pelicula(4, 1996, "Pelicula 4", "En una realidad muy lejana"));
			FileWriter fw = new FileWriter("Ficheros\\Peliculas.json");
			new Gson().toJson(peliculas, fw);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
