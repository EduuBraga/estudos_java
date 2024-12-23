public class OperadoresComparacao {
  public static void main(String[] args) { 
    int weightProducts = 600;
    int weightLimitProducts = 600;

    boolean excessWeight = weightProducts > weightLimitProducts;
    boolean releasedCargo =  weightLimitProducts >= weightProducts;

    System.out.printf("Carga excedeu? %b%n", excessWeight);
    System.out.printf("Carga liberada? %b%n", releasedCargo);
  }
}