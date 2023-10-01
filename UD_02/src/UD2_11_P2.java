import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class UD2_11_P2 {

	public static void main(String[] args) {
		try {
			Gson gson = new Gson();
			String sFichero = new String(Files.readAllBytes(Paths.get("Ficheros\\Peliculas.json")));
			List<Pelicula> peliculas = Arrays.asList(gson.fromJson(sFichero, Pelicula[].class));
			for (Pelicula p : peliculas) {
				System.out.println(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
