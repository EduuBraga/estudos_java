package Cofrinho;

public class Euro extends Moeda {
	public Euro(double valor) {
		super(valor);
	}

	public void info() {
		System.out.println("Euro - " + valor);
	}
	
	public double converter() {
		return this.valor * 5.34;
	}
}
