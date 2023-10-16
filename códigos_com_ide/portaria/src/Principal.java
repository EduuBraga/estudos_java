public class Principal {
    public static void main(String[] args) {
        Visitante edu = new Visitante();
        edu.nome = "Eduardo";
        edu.idade = 19;

        Visitante dudu = new Visitante();
        dudu.nome = "Duardo";
        dudu.idade = 32;

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(edu, 3);
        cadastroPortaria.cadastrar(dudu);
    }
}