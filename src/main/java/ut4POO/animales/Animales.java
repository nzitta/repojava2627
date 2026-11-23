package ut4POO.animales;

public class Animales {
	private String nombre;
	private int edad;
	public Animales(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public void saludar() {
	//  si  yo      soy     Gato
		if (this instanceof Gato)
			System.out.println(this.nombre+" says Meeeeooooow");
	//    y  si   yo     soy     Perro
		else if (this instanceof Perro)
			System.out.println(this.nombre+" says Guuauuu");
	}
}
