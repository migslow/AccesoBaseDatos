package UD01;

import java.io.IOException;
import java.util.ArrayList;

public class Pregunta2 {
	
	public static ArrayList<Double> temperaturaDia(int dia) throws IOException {
		
		
		return null; //Eliminar esta línea y completar
	}
	
public static boolean anyadir (double maxima, double minima) {
		
	   return false; //Eliminar esta línea y completar
}
	//---------------------

	public static void main(String[] args) throws IOException {

		System.out.println(temperaturaDia(-8)); //[-999.0, -999.0]
		System.out.println(temperaturaDia(1)); // [26.1, 11.1]
		System.out.println(temperaturaDia(30)); // [27.5, 16.5]
		System.out.println(temperaturaDia(22)); // [33.8, 19.4]
		System.out.println(temperaturaDia(33)); // [-999.0, -999.0]
		System.out.println(temperaturaDia(31)); // [-999.0, -999.0]
		//System.out.println(anyadir(28.9, 15.8)); // true
		//System.out.println(temperaturaDia(31)); // [28.9, 15.8]
	}

}
