import java.util.HashSet;
import java.util.Set;

public class Departamento {

	private int dptoId;
	private String nombre;
	private String localidad;

	//
	public Departamento(int dptoId, String nombre, String localidad) {

		this.dptoId = dptoId;
		this.nombre = nombre;
		this.localidad = localidad;

	}

	//
	public int getDptoId() {
		return dptoId;
	}

	public void setDptoId(int dptoId) {
		this.dptoId = dptoId;
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
		return "DepartamentoEntity [dptoId=" + dptoId + ", nombre=" + nombre + ", localidad=" + localidad + "]";
	}

}
