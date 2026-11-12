package ut3FundaPOO;

public class Perro {
	//Atributos
	private String nombre;
	private int edad;
	private String raza;
	
	//Constructor
	public Perro(String nombre, int edad, String raza) {
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}
	
	public void hacerRuido() {
		System.out.println("Guau");;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + "]";
	}
	
	
}

