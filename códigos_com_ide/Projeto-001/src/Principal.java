public class Principal {
    public static void main(String[] args) {
        Pessoa edu = new Pessoa();
        edu.nome = "Eduardo";
        edu.cpf = "009873900";
        edu.anoNascimento = 2003;

        Moto minhaMoto = new Moto();
        minhaMoto.anoDeFabricacao = 2014;
        minhaMoto.modelo = "fan 125";
        minhaMoto.cor = "vermelha";
        minhaMoto.fabricante = "honda";

        minhaMoto.proprietario = edu;
//        minhaMoto.proprietario.nome = "Eduardo";
//        minhaMoto.proprietario.cpf = "009873900";
//        minhaMoto.proprietario.anoNascimento = 2003;

        System.out.printf("Proprietária da moto %s %s %s é: %s",
            minhaMoto.fabricante,
            minhaMoto.modelo,
            minhaMoto.cor,
            minhaMoto.proprietario.nome
        );
    }
}
