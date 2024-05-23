public class OperadoresIgualdadeNegacao {
  public static void main(String[] args) { 
    int number1 = 10;
    int number2 = 11;

    boolean equalNumbers = number1 == number2;
    boolean differentNumbers = number1 != number2;

    System.out.printf("Numeros iguais? %b%n", equalNumbers);
    System.out.printf("Numeros diferentes? %b%n", differentNumbers);
  }
}