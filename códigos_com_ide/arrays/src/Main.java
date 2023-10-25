import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Turma b = new Turma();
        b.identificacao = "3º - B";
        b.professora = "Mailza";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Amanda mikelly";
        aluno1.idade = 16;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Alan faustino";
        aluno2.idade = 20;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Carlos Eduardo";
        aluno3.idade = 23;

        b.adicionarAluno(aluno1);
        b.adicionarAluno(aluno2);
        b.adicionarAluno(aluno3);

//        b.imprimirListaAlunos();

        ArrayList<Aluno> alunosFiltrados = b.consultarAlunosPorIdade(17, 18);

        for (Aluno alunosFiltrado : alunosFiltrados) {
            System.out.println("Alunos filtrados: " + alunosFiltrado.nome);
        }
    }
}