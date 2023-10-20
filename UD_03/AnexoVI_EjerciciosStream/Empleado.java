
import java.util.Date;

public class Empleado {

	private int empnoId;
	private String nombre;
	private String oficio;
	private Empleado dirId;
	private Date alta;
	private Integer salario;
	private Integer comision;
	private Departamento departamento;

	//
	public Empleado(int empnoId, String nombre, String oficio, Empleado dirId, Date alta, Integer salario,
			Integer comision, Departamento departamento) {

		this.empnoId = empnoId;
		this.nombre = nombre;
		this.oficio = oficio;
		this.dirId = dirId;
		this.alta = alta;
		this.salario = salario;
		this.comision = comision;
		this.departamento = departamento;
	}

	//
	public int getEmpnoId() {
		return empnoId;
	}

	public void setEmpnoId(int empnoId) {
		this.empnoId = empnoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public Empleado getDirId() {
		return dirId;
	}

	public void setDirId(Empleado dirId) {
		this.dirId = dirId;
	}

	public Date getAlta() {
		return alta;
	}

	public void setAlta(Date alta) {
		this.alta = alta;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public Integer getComision() {
		return comision;
	}

	public void setComision(Integer comision) {
		this.comision = comision;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	//
	@Override
	public String toString() {
		return "Empleado [empnoId=" + empnoId + ", nombre=" + nombre + ", oficio=" + oficio + ", dirId=" + dirId
				+ ", alta=" + alta + ", salario=" + salario + ", comision=" + comision + ", departamento="
				+ departamento + "]";
	}

}
