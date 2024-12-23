public class IntLong {
  public static void main(String[] args) {
    // Exemplo int
    int numeroMaximoInteiro = 2_147_483_647;
    int numeroMinimoInteiro = -2_147_483_648;

    // Exemplo long
    //long numeroLong = 2_147_483_999; //não compila
    long numeroLongCorreto = 122_147_483_999L;
    long numeroLongMaximo = 9_223_372_036_854_775_807L;
    long numeroLongMinimo = -9_223_372_036_854_775_808L;
  }
}