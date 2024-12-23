package Cofrinho;

public class Dolar extends Moeda {
	public Dolar(double valor) {
		super(valor);
	}

	public void info() {
		System.out.println("Dolar - " + valor);
	}
	
	public double converter() {
		return this.valor * 4.87;
	}
}
