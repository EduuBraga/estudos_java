public class PromocaoAritmetica {
  public static void main(String[] args) {
    /*
      Isso não compila pois o cauculo de dois números diferentes 
      fazem com que, sempre o compilador promova a variável para o
      tipo maior.
    int x = 10;
    long y = 5; 
    int z = x * y;

    System.out.println("Resultado: " + z); 
    */

 
    //Isso compila
    int x = 10;
    long y = 5; 
    long z = x * y;

    System.out.println("Resultado: " + z); 

    // Isso também
    int a = 10;
    float b = 5.7f;
    float c = b * a;

    System.out.println("Resultado: " + c);   

    //Isso compila
    int dois = 2;
    int tres =  3;
    float divisao = tres / dois; //Resultado {1.0}, isso ocorre pois a soma ocorre primeiro e somente depois vem a atribuição.
    float divisao2 = (float) tres / dois; // Resultado {1.5}, isso pois forçamos a mudança de tipo na variável tres.

    System.out.println("Resultado: " + divisao);
    System.out.println("Resultado 2: " + divisao2);
 }
}