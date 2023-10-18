public class Principal {
    public static void main(String[] args) {

        //Wrappers
//      Integer idade;
//      Double altura;
//      Float peso;
//      Character letra;
//      Boolean cansado;
//      Long minhaContaNubank;

        Cliente cliente = new Cliente();
        cliente.nome = "edu";
        cliente.idade = Integer.valueOf(18);

        Float idadePaiFloat = cliente.idade.floatValue();
        Double idadePaiDouble = cliente.idade.doubleValue();

        System.out.printf("%s%n", idadePaiFloat);
        System.out.printf("%s%n", idadePaiDouble);

        // Autoboxing e unboxing

        //  Integer prazoBoleto = Integer.valueOf(7);
        //  int prazoBoletoEmDias = prazoBoleto.intValue();

        Integer prazoBoleto = 7;
        int prazoBoletoEmDias = prazoBoleto;


        //Comparando wrappers
        Integer number1 = 127;
        Integer number2 = 127;
        Float number3 = 127F;

        System.out.println(number1.equals(number2));
        System.out.println(number1.equals(number3));
        System.out.println(number1.intValue() == number3.intValue());
    }
}