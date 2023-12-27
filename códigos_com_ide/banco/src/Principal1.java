import com.github.EduuBraga.banco.Conta;
import com.github.EduuBraga.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {
        Titular titular = new Titular("Eduardo", "06508779172");
        Conta conta = new Conta(titular, 777, 888);

        conta.depositar(600);
        conta.imprimirInformacoes();

        conta.sacar(200);
        conta.imprimirInformacoes();
    }
}
