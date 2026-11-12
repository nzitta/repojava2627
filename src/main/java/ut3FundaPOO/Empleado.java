package ut3FundaPOO;

public class Empleado {
	
	//Atributos
	private int codEmpleado;
	private String NIF;
	private String nombre;
	private String apellidos;
	private String direccion;
	private double salario;
	
	//Constructor con todos los campos
	public Empleado(int codEmpleado, String nIF, String nombre, String apellidos, String direccion, double salario) {
		super();
		this.codEmpleado = codEmpleado;
		this.NIF = nIF;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.salario = salario;
	}

	//Constructor vacío
	public Empleado() {
		super();
	}

	//Constructor sólo con algunos campos
	public Empleado(String nIF, String nombre, String apellidos, String direccion) {
		super();
		NIF = nIF;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Empleado [codEmpleado=" + codEmpleado + ", NIF=" + NIF + ", nombre=" + nombre + ", Apellidos="
				+ this.apellidos + ", direccion=" + direccion + ", salario=" + salario + "]";
	}

	public int getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
