package ut3FundaPOO;

public class CuentaBancaria {
	/*Atributos en min y privado*/
	private String titular;
	private double saldo;
	
	/*Generamos el constructor*/
	public CuentaBancaria(String nTitular, double eSaldo) {
		super();
		this.titular = nTitular;
		this.saldo = eSaldo;
	}
	
	/*Getter*/
	public String getTitular() {
		return titular;
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
