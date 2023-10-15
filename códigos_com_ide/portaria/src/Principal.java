public class Principal {
    public static void main(String[] args) {
        Visitante edu = new Visitante();
        edu.nome = "Eduardo";
        edu.idade = 19;

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(edu, 3);
    }
}