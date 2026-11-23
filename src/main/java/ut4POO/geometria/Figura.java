package ut4POO.geometria;

public class Figura {
	//"protected" da acceso para que lo vean sólo clases hijas o descendientes
	protected double total = 0;
	
	public void mostrarArea() {
		//Imprimimos resultado. this.getClass() específica clase que es y this.total muestra resultado
		System.out.println("El área calculada de "+this.getClass()+" es: "+this.total);
	}
	
	//Método que DEBEN implementar las subclases
	public void calcularArea() {}
}
