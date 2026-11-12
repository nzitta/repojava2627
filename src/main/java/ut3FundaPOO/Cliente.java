package ut3FundaPOO;

public class Cliente {
	private String nombre;
	private String direccion;
	private static Perro perro;
	
	public Cliente(String nombre, String direccion, Perro perro) {
		this.nombre = nombre;
		this.direccion = direccion;
		Cliente.perro = perro;
	}
	
	public void adoptarPerro() {
		perro++;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
}
