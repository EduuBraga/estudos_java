import java.util.Scanner;

public class ControlePesoAeronave_LacosRepeticao {
  public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in);

    System.out.print("Peso maximo aeronave: ");
    int pesoMaximoAeronave = entrada.nextInt();

    System.out.print("Quantidade de passageiros: ");
    int quantPassageiros = entrada.nextInt();

    int totalPesoPassageiros = 0;
    
    for (int passageiroAtual = 1; passageiroAtual <= quantPassageiros; passageiroAtual++) {
      System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
      int pesoPassageiroAtual = entrada.nextInt();

      totalPesoPassageiros += pesoPassageiroAtual;
    }

    System.out.printf("Peso maximo da aeronave: %d%n", pesoMaximoAeronave);
    System.out.printf("Peso total dos passageiros: %d%n", totalPesoPassageiros);
    System.out.printf("Situacao da decolagem: %s%n", 
      totalPesoPassageiros > pesoMaximoAeronave ? "Nao autorizada" : "Autorizada");
  }
}