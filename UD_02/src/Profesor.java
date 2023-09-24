import java.io.Serializable;

public class Profesor implements Serializable {
	private String nombre;
	private int antiguedad;

	public Profesor(String nombre, int antiguedad) {
		this.nombre = nombre;
		this.antiguedad = antiguedad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", antiguedad=" + antiguedad + "]";
	}

}
