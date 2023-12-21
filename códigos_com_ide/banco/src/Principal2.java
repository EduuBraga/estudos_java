import com.github.EduuBraga.banco.Conta;
import com.github.EduuBraga.banco.ContaInvestimento;
import com.github.EduuBraga.banco.Titular;

public class Principal2 {
    public static void main(String[] args) {
        Titular edu = new Titular("Eduardo", "06508779172");

        ContaInvestimento conta = new ContaInvestimento();
        conta.setAgencia(777);
        conta.setNumero(777);
        conta.setTitular(edu);

        conta.depositar(600);

        conta.creditarRendimentos(0.5);

        conta.imprimirInformacoes();
    }
}
