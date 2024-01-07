import com.github.EduuBraga.banco.*;

public class Principal {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial contaEspecial1 = new ContaEspecial(new Titular("Eduardo Braga", "07608608456"),
                7777,
                12345,
                90);

        ContaEspecial contaEspecial2 = new ContaEspecial(new Titular("Yasmim Ponciano", "98727866644"),
                6666,
                54321,
                90);

        contaEspecial1.depositar(300);

        caixaEletronico.transferir(contaEspecial1, contaEspecial2, 50);
        contaEspecial1.imprimirInformacoes();
        contaEspecial2.imprimirInformacoes();
    }
}