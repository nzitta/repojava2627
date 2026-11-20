package ut3FundaPOO.exaut3;

public class Curso {
	private String nombre;
	private int horas;
	private double precio;
	private static int totalCursos;
	
	public Curso(String nombre, int horas, double precio) {
		super();
		this.nombre = nombre;
		this.horas = horas;
		this.precio = precio;
		totalCursos++;
	}

	public String getNombre() {
		return nombre;
	}

	public int getHoras() {
		return horas;
	}

	public double getPrecio() {
		return precio;
	}

	public static int getTotalCursos() {
		return totalCursos;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", horas=" + horas + ", precio=" + precio + "]";
	}
	
}
