package Cofrinho;

public class Real extends Moeda {
	public Real(double valor) {
		super(valor);
	}

	public void info() {
		System.out.println("Real - " + valor);
	}
	
	public double converter() {
		return this.valor;
	}
}
