import java.util.Scanner;

public class ApostaMegaSena {
  public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in);

    int quantNumerosEscolhido = 0;

    do { 
      System.out.print("Quantos números deseja apostas? ");
      quantNumerosEscolhido = entrada.nextInt();

      if (quantNumerosEscolhido < 6 || quantNumerosEscolhido > 15) {
        System.out.println("O número deve ser de 6 à 15");
      }
    } while (quantNumerosEscolhido < 6 || quantNumerosEscolhido > 15);

    String numerosApostados = "";
    int numeroAtual = 1;

    do { 
      System.out.printf("Numero apostado %d/%d: ", numeroAtual, quantNumerosEscolhido);
      int numeroApostadoAtual = entrada.nextInt();

      if (numeroApostadoAtual <= 0 || numeroApostadoAtual > 60) {
        System.out.println("O número deve ser de 1 à 60");
      } else {
        numerosApostados += numeroApostadoAtual + " ";
        numeroAtual++;
      }
    } while (numeroAtual <= quantNumerosEscolhido);

    System.out.printf("Numeros apostados: %s%n", numerosApostados);
  }
}