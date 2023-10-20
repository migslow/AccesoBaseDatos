
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException {
		List<Empleado> listaEmpleados = new ArrayList();
		Departamento d1 = new Departamento(10, "Finanzas", "Huesca");
		Departamento d2 = new Departamento(20, "I+D", "Walqa-Cuarte");
		Departamento d3 = new Departamento(30, "Comercial", "Almudévar");
		Departamento d4 = new Departamento(40, "Producción", "Barbastro");
		Departamento d5 = new Departamento(50, "Marketing", "Zaragoza");

		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Empleado e1 = new Empleado(1039, "Alberto Carrera Martín", "Presidente", null, formato.parse("1999-10-27"),
				4900, null, d1);
		Empleado e2 = new Empleado(1082, "Mario Carrera Bailín", "Director", e1, formato.parse("2001-07-06"), 3385,
				null, d1);
		Empleado e3 = new Empleado(1034, "Raquel Carrera Bailín", "Empleado", e2, formato.parse("2002-11-12"), 2690,
				null, d1);

		Empleado e4 = new Empleado(2066, "Blanca Bailín Perarnau", "Director", e1, formato.parse("2001-07-12"), 2970,
				null, d2);
		Empleado e5 = new Empleado(2002, "Araceli Carrera Salcedo", "Investigador", e4, formato.parse("2003-02-24"),
				3000, null, d2);
		Empleado e6 = new Empleado(2069, "Fernando Carrera Martín", "Empleado", e5, formato.parse("2001-11-19"), 2840,
				null, d2);
		Empleado e7 = new Empleado(2088, "Carmen Bailín Perarnau", "Investigador", e4, formato.parse("2001-10-19"),
				2600, null, d2);
		Empleado e8 = new Empleado(2076, "Fernando Carrera Salcedo", "Empleado", e7, formato.parse("2005-02-13"), 2730,
				null, d2);
		//
		Empleado e9 = new Empleado(3098, "Fernando Martínez Pérez", "Director", e1, formato.parse("2000-02-03"), 3150,
				null, d3);
		Empleado e10 = new Empleado(3099, "Belén Carrera Sausán", "Comercial", e9, formato.parse("2000-02-22"), 2500,
				500, d3);
		Empleado e11 = new Empleado(3051, "Enrique Casado Alvarez", "Comercial", e9, formato.parse("2002-07-23"), 2600,
				550, d3);
		Empleado e12 = new Empleado(3054, "Antonio Mériz Piedrafita", "Comercial", e9, formato.parse("2003-03-22"),
				2600, 1000, d3);
		Empleado e13 = new Empleado(3044, "Lorenzo Blasco González", "Comercial", e9, formato.parse("2001-03-07"),
				2350, 400, d3);
		Empleado e14 = new Empleado(3000, "Javier Escartín Nasarre", "Empleado", e9, formato.parse("2003-07-13"), 2435,
				null, d3);
		listaEmpleados.add(e1);
		listaEmpleados.add(e2);
		listaEmpleados.add(e3);
		listaEmpleados.add(e4);
		listaEmpleados.add(e5);
		listaEmpleados.add(e6);
		listaEmpleados.add(e7);
		listaEmpleados.add(e8);
		listaEmpleados.add(e9);
		listaEmpleados.add(e10);
		listaEmpleados.add(e11);
		listaEmpleados.add(e12);
		listaEmpleados.add(e13);
		listaEmpleados.add(e14);

	}

}
