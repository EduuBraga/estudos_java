import com.github.EduuBraga.banco.*;

public class Principal {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("Eduardo Braga", "07608608456"),
                7777,
                12345,
                90);
        conta1.setLimiteChequeEspecial(1000);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("Eduardo Braga", "07608608456"),
                7777, 12345);
        conta2.depositar(200);

        Conta conta3 = new Conta(new Titular("Eduardo Braga", "07608608456"),
                7777, 12345);
        conta3.depositar(200);

        ContaSalario conta4 = new ContaSalario(new Titular("Eduardo Braga", "07608608456"),
                7777, 12345, 18_000);
        conta4.depositar(200);

        caixaEletronico.imprimirInformacoes(conta4);
    }
}