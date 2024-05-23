import java.util.Scanner;

public class CalcIMC_Condicionais {
  public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in);

    System.out.print("Qual sua altura? ");
    double altura = entrada.nextDouble();

    System.out.print("Qual seu peso? ");
    double peso = entrada.nextDouble();

    double resultadoCalcIMC = peso /  (altura * altura); 

    if(resultadoCalcIMC < 18.5) {
      System.out.println("Abaixo do peso ideal");
    } else if(resultadoCalcIMC >= 18.5 && resultadoCalcIMC < 25) {
      System.out.println("Peso ideal");
    } else if(resultadoCalcIMC >= 25 && resultadoCalcIMC < 30) {
      System.out.println("Acima do peso");
    } else if(resultadoCalcIMC >= 30 && resultadoCalcIMC < 35) {
      System.out.println("Obesidade grau I");
    } else if(resultadoCalcIMC >= 35 && resultadoCalcIMC < 40) {
      System.out.println("Obesidade grau II");
    } else {
      System.out.println("Obesidade grau III");
    }
  }
}