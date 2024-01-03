import com.github.EduuBraga.banco.Conta;
import com.github.EduuBraga.banco.Titular;

public class Principal {
    public static void main(String[] args) {
        Titular titular = new Titular("Eduardo", "06506506506");

        Conta conta1 = new Conta(titular, 7777, 123456789);
        Conta conta2 = conta1;
        Conta conta3 = new Conta(titular, 7077, 123456789);

        System.out.println(conta1.equals(conta2));
        System.out.println(conta1.equals(conta3));
    }
}