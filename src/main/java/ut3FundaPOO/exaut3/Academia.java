package ut3FundaPOO.exaut3;

public class Academia {
	private String nombre;
	private String ciudad;
	private Alumno alumno;
	
	public Academia(String nombre, String ciudad) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	
	public void registrarAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public Alumno getAlumno() {
		return alumno;
	}

	@Override
	public String toString() {
		return "Academia [nombre=" + nombre + ", ciudad=" + ciudad + ", alumno=" + alumno + "]";
	}

}
