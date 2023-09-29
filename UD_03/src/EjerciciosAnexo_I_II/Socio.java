package EjerciciosAnexo_I_II;

public class Socio {
	private int socioID, estatura, edad;
	private String nombre, localidad;

	public Socio() {
		super();
	}

	public Socio(int socioID, int estatura, int edad, String nombre, String localidad) {
		super();
		this.socioID = socioID;
		this.estatura = estatura;
		this.edad = edad;
		this.nombre = nombre;
		this.localidad = localidad;
	}

	public int getSocioID() {
		return socioID;
	}

	public void setSocioID(int socioID) {
		this.socioID = socioID;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Socio [socioID=" + socioID + ", estatura=" + estatura + ", edad=" + edad + ", nombre=" + nombre
				+ ", localidad=" + localidad + "]";
	}

}
