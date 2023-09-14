import java.util.Scanner;

public class HorarioFuncionamento {
  public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in);
    String horarioDeFuncionamento;

    System.out.print("Qual dia? (ex: seg, ter, qua, etc) ");
    String dia = entrada.nextLine();

    switch (dia) {
      case "seg":
      case "ter":
      case "qua":
      case "qui":
      case "sex":
        horarioDeFuncionamento = "7:00 as 12:00 e das 14:00 as 17:00";
        break;
      case "sab":
        horarioDeFuncionamento = "7:00 as 12:00";
        break;
      case "dom":
        horarioDeFuncionamento = "Fechado";
        break;
      default:
        horarioDeFuncionamento = "Dia invalido";
    }

    System.out.printf("Funcionamento: %s%n", horarioDeFuncionamento);
  }
}