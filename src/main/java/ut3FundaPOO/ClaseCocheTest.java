package ut3FundaPOO;

public class ClaseCocheTest {

	public static void main(String[] args) {
		// Voy a crear el coche de Nina
		ClaseCoche cocheNina = new ClaseCoche("negro", 120, 19.4);
		
		//Llamando a los métodos que he creado puedo acceder a los valores
		System.out.println("¿De qué color es el coche? "+cocheNina.getsColor());
		System.out.println("¿Y a qué velocidad va? "+cocheNina.getsVelocidad());
		System.out.println("¿Y qué tamaño tiene? "+cocheNina.getsTamanyo());
		
		//Utilizo un método para cambiar el color
		cocheNina.setColor("Azul");
		//Compruebo utilizando otro método que se haya cambiado el color
		System.out.println("¿De qué color es el coche? "+cocheNina.getsColor());
		
		//Voy a ver todos los atributos
		System.out.println("Ver todos los atributos del coche de una "+cocheNina.toString());
		cocheNina.acelerar();
		System.out.println(cocheNina.toString());
		cocheNina.acelerar();
		System.out.println(cocheNina.toString());
		cocheNina.tunear("Verde", 10.0);
		System.out.println(cocheNina.toString());
	}

}
