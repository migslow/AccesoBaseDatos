
public class Pelicula {
	private int id, anyo;
	private String titulo, descripcion;

	public Pelicula(int id, int anyo, String titulo, String descripcion) {
		super();
		this.id = id;
		this.anyo = anyo;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", anyo=" + anyo + ", titulo=" + titulo + ", descripcion=" + descripcion + "]";
	}

}
