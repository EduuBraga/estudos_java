package Cofrinho;

import java.util.ArrayList;
import java.util.Iterator;

public class Cofre {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(String moeda, double valor) {	
		if(moeda == "dolar") {
			listaMoedas.add(new Dolar(valor));
		}
		else if(moeda == "euro") {
			listaMoedas.add(new Euro(valor));
		}
		else if(moeda == "real") {
			listaMoedas.add(new Real(valor));
		}
	}
	
	private void removerMoeda(Moeda moedaDaVez, double valor, int indexDoArray) {
		if(moedaDaVez.valor == valor) {
			listaMoedas.remove(indexDoArray);
		}
	}
	
	public void remover(String moedaParam, double valorParam) {
		for(int i = 0; i < listaMoedas.size(); i++) {
			Moeda moedaDaVez = listaMoedas.get(i);
			
			if(moedaDaVez instanceof Dolar && moedaParam == "dolar") {
				removerMoeda(moedaDaVez, valorParam, i);
			}
			else if(moedaDaVez instanceof Real && moedaParam == "real") {
				removerMoeda(moedaDaVez, valorParam, i);
			}
			else if(moedaDaVez instanceof Euro && moedaParam == "euro") {
				removerMoeda(moedaDaVez, valorParam, i);
			}
		}
	}
	
	public void totalConvertido() {
		double total = 0;
		
		for(int i = 0; i < listaMoedas.size(); i++) {
			Moeda moedaDaVez = listaMoedas.get(i);
			
			if(moedaDaVez instanceof Dolar) {
				total += moedaDaVez.converter();
			}
			else if(moedaDaVez instanceof Real) {
				total += moedaDaVez.converter();
			}
			else if(moedaDaVez instanceof Euro) {
				total += moedaDaVez.converter();
			}
		}	
		
		System.out.println("O total convertido é: " + total);
	}
	
	public void listagemMoedas() {
		Iterator<Moeda> it = listaMoedas.iterator();
		
		while(it.hasNext()) {
			Moeda moeda = it.next();
			moeda.info();
		}
	}
}
