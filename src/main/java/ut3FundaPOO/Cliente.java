package ut3FundaPOO;

public class Cliente {
	private String nombre;
	private String direccion;
	private Perro perro;
	
	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		//this.perro = perro;
	}
	
	public void comprarPerro(Perro perro1) {
		this.perro = perro1;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", direccion=" + direccion + ", perro=" + perro + "]";
	}
}
