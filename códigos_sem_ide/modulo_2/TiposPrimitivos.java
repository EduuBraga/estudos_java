public class TiposPrimitivos {
  public static void main(String[] args) {
    // Exemplo boolean
    boolean pedidoConfirmado = true;

    /*
      Exemplo char
      é utilizado quando se quer declarar apenas um caractere, sempre sendo declarado em aspas simples. 
    */
    char inicialNome = 'E';
    char arroba = '@';


    // Exemplo byte
    byte numeroMaximoByte = 127;
    byte numeroMinimoByte = -128;

    System.out.println("O número máximo que o byte suporta é: " + numeroMaximoByte);
    System.out.println("O número minimo que o byte suporta é: " + numeroMinimoByte);

    // Exemplo short
    short numeroMaxShort = 32767;
    short numeroMinShort = -32768;

    System.out.println("O número máximo que o short suporta é: " + numeroMaxShort);
    System.out.println("O número minimo que o short suporta é: " + numeroMinShort);
  }
}