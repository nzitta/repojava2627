package ut3FundaPOO;

public class ClasePersonaTest {

	public static void main(String[] args) {
		Persona florNina = new Persona("Flor", 27, 1.60);
	
		System.out.println("¿Cómo se llama la persona? "+florNina.getNombre());
		System.out.println("¿Cuántos años tiene? "+florNina.getEdad());
		System.out.println("¿Cuánto mide? "+florNina.getEstatura());
		
		//Voy a cambiar el nombre
		florNina.setNombre("Flor Miau");
		//Compruebo
		System.out.println("El nuevo nombre es: "+florNina.getNombre());
		System.out.println(florNina.toString());
		
		florNina.saludar("Flor");
	}

}