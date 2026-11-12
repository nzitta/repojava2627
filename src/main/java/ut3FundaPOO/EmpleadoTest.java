package ut3FundaPOO;

public class EmpleadoTest {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado();
		System.out.println("Datos empleado: "+empleado1);
		
		empleado1.setNombre("Flor");
		System.out.println("Datos empleado: "+empleado1);

		//Empleado 2
		Empleado empleado2 = new Empleado("1R", "emp2", "ape2", "Desengaño");
		System.out.println("Datos empleado2: "+empleado2);
		
		empleado2.setCodEmpleado(28);
		empleado2.setSalario(1000);
		System.out.println("Datos empleado2: "+empleado2);
	}

}
