import com.github.EduuBraga.banco.Conta;
import com.github.EduuBraga.banco.ContaEspecial;
import com.github.EduuBraga.banco.Titular;

public class Principal3 {
    public static void main(String[] args) {
        Titular titular = new Titular("Eduardo", "06508779172");
        ContaEspecial conta = new ContaEspecial(titular, 777, 888, 90);
        conta.setLimiteChequeEspecial(1000);

        conta.depositar(100);
        conta.imprimirInformacoes();

        conta.sacar(200);
        conta.imprimirInformacoes();
    }
}
