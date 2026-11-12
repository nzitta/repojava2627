package ut3FundaPOO;

public class CuentaBancaria {
	/*Atributos en min y privado*/
	private String titular;
	private double saldo;
	//Incluir un atributo que me diga cuántas cuentas llevo creadas en mi banco
	//Y genera método int getNumeroCuentas()
	private static int numeroCuentas;
	
	/*Generamos el constructor*/
	public CuentaBancaria(String nTitular, double eSaldo) {
		this.titular = nTitular;
		this.saldo = eSaldo;
		numeroCuentas++;
		System.out.println("El número de cuentas creadas es: "+numeroCuentas);
	}
	
	/*Getter*/
	
	public String getTitular() {
		return titular;
	}

	public int getCuentas() {
		return numeroCuentas;
	}

	public void setCuentas(int numeroCuentas) {
		this.numeroCuentas = numeroCuentas;
	}

	/*Setter*/
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	/*Getter*/
	public double getSaldo() {
		return saldo;
	}
	
	/*Setter*/
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + "]";
	}

	public void incrementar(double incremento) {
		saldo += incremento;
	}
	
	public void retirar(double retiro) {
		saldo -= retiro;
	}
	
}
