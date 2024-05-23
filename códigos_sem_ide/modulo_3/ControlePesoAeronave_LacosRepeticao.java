import java.util.Scanner;

public class ControlePesoAeronave_LacosRepeticao {
  public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in);

    System.out.print("Peso maximo da aeronave: ");
    int pesoMaximoAeronave = entrada.nextInt();

    int totalPesoPassageiros = 0;
    boolean incluirNovoPassageiro = true;
    
    while (totalPesoPassageiros <= pesoMaximoAeronave && incluirNovoPassageiro) {
      System.out.print("Peso do passageiro: ");
      int pesoPassageiro = entrada.nextInt();

      totalPesoPassageiros += pesoPassageiro;

      if (totalPesoPassageiros <= pesoMaximoAeronave) { 
        System.out.print("Deseja incluir um novo passageiro? ");
        incluirNovoPassageiro = entrada.nextBoolean();
      } else { 
        incluirNovoPassageiro = false;
      }
    }

    System.out.printf("Peso maximo da aeronave: %d%n", pesoMaximoAeronave);
    System.out.printf("Peso total dos passageiros: %d%n", totalPesoPassageiros);
    System.out.printf("Situacao da decolagem: %s%n", 
      totalPesoPassageiros > pesoMaximoAeronave ? "Nao autorizada" : "Autorizada");
  }
}