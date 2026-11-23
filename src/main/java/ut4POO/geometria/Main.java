package ut4POO.geometria;

public class Main {

	public static void main(String[] args) {
		Figura circ = new Circulo(3);
		Figura rect = new Rectangulo(4,5);
		Figura triang = new Triangulo(6,7);
		
		circ.calcularArea();
		rect.calcularArea();
		triang.calcularArea();
		
		circ.mostrarArea();
		rect.mostrarArea();
		triang.mostrarArea();

	}

}
