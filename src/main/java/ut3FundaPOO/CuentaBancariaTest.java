package ut3FundaPOO;

public class CuentaBancariaTest {

	public static void main(String[] args) {
		// Creo objeto cuenta bancaria
		CuentaBancaria cuentaFlor = new CuentaBancaria("Flor", 1000);
		
		// Compruebo los atributos preestablecidos
		System.out.println("Nombre del titular: "+cuentaFlor.getTitular());
		System.out.println("Saldo en cuenta: "+cuentaFlor.getSaldo());
		
		//Cambio los atributos con setter
		cuentaFlor.setTitular("Nina");
		System.out.println("Nuevo nombre del titular: "+cuentaFlor.getTitular());
		
		//Imprimo toString
		System.out.println(cuentaFlor.toString());
		
		//Utilizo métodos
		cuentaFlor.incrementar(500);
		System.out.println("Nuevo saldo en cuenta: "+cuentaFlor.getSaldo());
		
		cuentaFlor.retirar(200);
		System.out.println("El saldo actual de Flor es: "+cuentaFlor.getSaldo());
		
		CuentaBancaria Cuenta1 = new CuentaBancaria("Pepe", 5);
		CuentaBancaria Cuenta2 = new CuentaBancaria("Ana", 10);
		
	}

}
