package Cofrinho;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Cofre cofrinho = new Cofre();
		Scanner usuario = new Scanner(System.in);

		while(true) {
			System.out.println("Indique o caminho que quer seguir:");
			System.out.println("1 - Adicicionar moeda");
			System.out.println("2 - Remover moeda");
			System.out.println("3 - Listar moedas");
			System.out.println("4 - Ver total de moedas convertidas");
			System.out.println("5 - Sair");
			System.out.println("------------------------------");
			
			//Variável que vai determinar o caminha a ser seguido pelo usuário.
			int rotaEscolhida = usuario.nextInt();
			System.out.println("------------------------------");
		
			//Condição para adicionar uma moeda.
			if(rotaEscolhida == 1) {
				while(true) {
					System.out.println("Qual moeda deseja adicionar ao cofrinho?");
					System.out.println("1 - Real");
					System.out.println("2 - Dolar");
					System.out.println("3 - Euro");
					System.out.println("4 - Sair");
					System.out.println("------------------------------");
					
					int moedaEscolhidaParaAdicionar = usuario.nextInt();
					System.out.println("------------------------------");
					
					//Caminha caso a moeda Escolhida seja Real.
					if(moedaEscolhidaParaAdicionar == 1) {
						adicionarMoeda("real", cofrinho, usuario);
						break;
					}//Caminha caso a moeda Escolhida seja dolar.
					else if(moedaEscolhidaParaAdicionar == 2) { 
						adicionarMoeda("dolar", cofrinho, usuario);
						break;
					}//Caminha caso a moeda Escolhida seja euro.
					else if(moedaEscolhidaParaAdicionar == 3) {
						adicionarMoeda("euro", cofrinho, usuario);
						break;
					}//Caminha caso o usuário deseje sair da etapa de adicionar moeda.
					else if(moedaEscolhidaParaAdicionar == 4) {
						break;
					}//Caminha caso o número digitado esteja diferente dos disponíveis.
					else {
						System.out.println("Caminho não identificado, tente novamente.");
						System.out.println("------------------------------");
					}
				}
			}
			//Condição para remover uma moeda.
			else if(rotaEscolhida == 2) {
				while(true) {
					System.out.println("Qual moeda deseja remover do cofrinho?");
					System.out.println("1 - Real");
					System.out.println("2 - Dolar");
					System.out.println("3 - Euro");
					System.out.println("4 - Sair");
					System.out.println("------------------------------");
					
					int moedaEscolhidaParaRemover = usuario.nextInt();
					System.out.println("------------------------------");
					
					//Caminha caso a moeda Escolhida seja Real.
					if(moedaEscolhidaParaRemover == 1) {
						removerMoeda("real", cofrinho, usuario);
						break;
					}//Caminha caso a moeda Escolhida seja dolar.
					else if(moedaEscolhidaParaRemover == 2) { 
						removerMoeda("dolar", cofrinho, usuario);
						break;
					}//Caminha caso a moeda Escolhida seja euro.
					else if(moedaEscolhidaParaRemover == 3) {
						removerMoeda("euro", cofrinho, usuario);
						break;
					}//Caminha caso o usuário deseje sair da etapa de remover moeda.
					else if(moedaEscolhidaParaRemover == 4) {
						break;
					}//Caminha caso o número digitado esteja diferente dos disponíveis.
					else {
						System.out.println("Caminho não identificado, tente novamente.");
						System.out.println("------------------------------");
					}
				}
			}
			//Condição listar todas as moedas.
			else if(rotaEscolhida == 3) {
				cofrinho.listagemMoedas();
				System.out.println("------------------------------");
			}
			//Condição ver o total das moedas convertidas.
			else if(rotaEscolhida == 4) {
				cofrinho.totalConvertido();
				System.out.println("------------------------------");
			}
			//Condição para fechar o menu.
			else if(rotaEscolhida == 5) {
				System.out.println("Até a próxima 👋🏻");
				System.out.println("------------------------------");
				break;
			}
			//Condição caso o número seja inválido.
			else {
				System.out.println("Caminho não identificado, tente novamente.");
				System.out.println("------------------------------");
			}
		}
	}
	
	//método que recebe o valor a ser adicionar e o adiciona.
	private static void adicionarMoeda(String moedaEscolhida, Cofre cofrinho, Scanner usuario) {
		System.out.println("Digite o valor:");
		double valorDaMoeda = usuario.nextDouble();
		System.out.println("------------------------------");
		
		cofrinho.adicionar(moedaEscolhida, valorDaMoeda);
		System.out.println("Moeda adicionar com sucesso!");
		System.out.println("------------------------------");
	}
	
	//Método que recebe o valor a ser removido e o remove.
	private static void removerMoeda(String moedaEscolhida, Cofre cofrinho, Scanner usuario) {
		System.out.println("Digite o valor:");
		double valorDaMoeda = usuario.nextDouble();
		System.out.println("------------------------------");
		
		cofrinho.remover(moedaEscolhida, valorDaMoeda);
		System.out.println("Moeda removida com sucesso!");
		System.out.println("------------------------------");
	}
}
