import java.util.Scanner;

public class EntradaDeDados {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Seu peso: ");
    int peso = entrada.nextInt();

    System.out.print("Sua altura: ");
    double altura = entrada.nextDouble();

    entrada.nextLine();

    System.out.print("Nome: ");
    String nome = entrada.nextLine();

    double calcIMC = peso / (altura * altura);

    System.out.printf("O IMC de %s é: %.2f%n", nome, calcIMC);    
 }
}