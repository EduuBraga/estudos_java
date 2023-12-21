import com.github.EduuBraga.banco.Conta;
import com.github.EduuBraga.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {
        Titular edu = new Titular("Eduardo", "06508779172");

        Conta conta = new Conta();
        conta.setAgencia(777);
        conta.setNumero(777);
        conta.setTitular(edu);

        conta.depositar(600);
        conta.imprimirInformacoes();

        conta.sacar(200);
        conta.imprimirInformacoes();
    }
}
