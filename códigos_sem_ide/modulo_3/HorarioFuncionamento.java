import java.util.Scanner;

public class HorarioFuncionamento {
  public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Qual dia? (ex: seg, ter, qua, etc) ");
    String dia = entrada.nextLine();

    System.out.print("Qual mês? (ex: 1, 2, 3, etc) ");
    int mes = entrada.nextInt();

    String horarioDeFuncionamento = switch (dia) {
      case "seg", "ter", "qua", "qui", "sex" -> "7:00 as 12:00 e das 14:00 as 17:00";
      case "sab" -> {
        if (mes == 11 || mes == 12) {
  	   yield "8:00 as 11:00 e das 14:00 as 17:00";
	}

        yield "7:00 as 12:00";      
      };
      case "dom" -> "Fechado";
      default -> "Dia invalido";
    };

    /*
    switch (dia) {
      case "seg", "ter", "qua", "qui", "sex" -> horarioDeFuncionamento = "7:00 as 12:00 e das 14:00 as 17:00";
      case "sab" -> horarioDeFuncionamento = "7:00 as 12:00";
      case "dom" -> horarioDeFuncionamento = "Fechado";
      default -> horarioDeFuncionamento = "Dia invalido";
    }
    */
    
    /*
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
    */    

    System.out.printf("Funcionamento: %s%n", horarioDeFuncionamento);
  }
}