package ut3FundaPOO;

public class Persona {
	//atributos privados
	private String nombre;
	private int edad;
	private double estatura;
	
	//Generar el constructor
	public Persona(String pNombre, int pEdad, double pEstatura) {
		this.nombre= pNombre;
		this.edad= pEdad;
		this.estatura= pEstatura;	
	}
	
	/*Getter para obtener el nombre*/
	public String getNombre() {
		return nombre;
	}

	/*Setter para cambiar el nombre*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*Getter para obtener la edad*/
	public int getEdad() {
		return edad;
	}

	/*Setter para cambiar la edad*/
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/*Getter para obtener la estatura*/
	public double getEstatura() {
		return estatura;
	}
	/*Setter para cambiar la estatura*/
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	//Generar toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
	}
	
	/*
	 * Método que dice hola mi nombre encantado de saludarte
	 * */

	public void saludar(String nombre) {
		System.out.println("Hola "+nombre);
	}

	/*Método que añade un año a la persona*/
	/*public void cumplirAnyos() {}*/
	
	/*Método crecer*/
	/*public void crecer(double incremento) {}*/
}
