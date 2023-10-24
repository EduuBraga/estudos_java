public class Main {
    public static void main(String[] args) {
        Turma b = new Turma();
        b.identificacao = "3º - B";
        b.professora = "Mailza";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Amanda mikelly";
        aluno1.idade = 20;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Alan faustino";
        aluno2.idade = 20;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Carlos Eduardo";
        aluno3.idade = 20;

        b.adicionarAluno(aluno1);
        b.adicionarAluno(aluno2);
        b.adicionarAluno(aluno3);

        b.removerAluno(0);

        b.imprimirListaAlunos();
    }
}