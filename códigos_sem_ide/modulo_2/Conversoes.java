public class Conversoes {
  public static void main(String[] args) {
    long a = 9200000076687L;

    // int b = a; - não compila
    int b = (int) a; // - Compila, mas ocorre um perda da precião do número.

    System.out.println(a);
    System.out.println(b);
    // A = 9200000076687
    // B = 180128655
 }
}