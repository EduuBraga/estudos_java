import java.util.Scanner;

public class OperadoresLogicos {
  public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in);

    System.out.println("Entrada gratis para idades menores que 7 e maiores que 60");
    System.out.println("Entrada com descontos para idades entre 8 a 12 anos");
    System.out.print("Sua idade: \n");
    int idade = entrada.nextInt();

    boolean entradaGratis = idade < 7 || idade > 60;
    boolean entradaComDesconto = idade >= 8 && idade <= 12;

    System.out.printf("Entrada grátis: %b%n", entradaGratis);
    System.out.printf("Entrada com desconto: %b%n", entradaComDesconto);
  }
}