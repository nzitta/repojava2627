package ut3FundaPOO.exaut3;

public class Alumno {
	private String nombre;
	private String email;
	private Curso curso;
	
	
	public Alumno(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public String getEmail() {
		return email;
	}
	public Curso getCurso() {
		return curso;
	}
	
	public void matricularCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", email=" + email + ", curso=" + curso + "]";
	}
	
}
