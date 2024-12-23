public class Principal {
    public static void main(String[] args) {
        Pessoa edu = new Pessoa();
        edu.nome = "Eduardo";
        edu.cpf = "009873900";
        edu.anoNascimento = 2003;

        Pessoa chalme = new Pessoa();
        chalme.nome = "Chalme";
        chalme.cpf = "008762800";
        chalme.anoNascimento = 39;

        Moto motoEdu = new Moto();
        motoEdu.anoDeFabricacao = 2014;
        motoEdu.modelo = "fan 125";
        motoEdu.cor = "vermelha";
        motoEdu.fabricante = "honda";
        motoEdu.precoCompra = 10500;
        motoEdu.proprietario = edu;

        Moto motoChalme = new Moto();
        motoChalme.anoDeFabricacao = 2016;
        motoChalme.modelo = "bros 160";
        motoChalme.cor = "preta";
        motoChalme.fabricante = "honda";
        motoChalme.precoCompra = 14000;
        motoChalme.proprietario = edu;

        motoEdu.imprimirResumoDepreciacao();
        motoChalme.imprimirResumoDepreciacao();
    }
}
