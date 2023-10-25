import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
    String identificacao;
    String professora;
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    void removerAluno(int indice) {
        this.alunos.remove(indice);
    }

    ArrayList<Aluno> consultarAlunosPorIdade(int idadeMinima, int idadeMaxima) {
        ArrayList<Aluno> alunosFiltrados = new ArrayList<>();

        for (Aluno aluno : alunos) {
            if(aluno.idade >= idadeMinima && aluno.idade <= idadeMaxima) {
               alunosFiltrados.add(aluno);
            }
        }

        return alunosFiltrados;
    }

    void imprimirListaAlunos() {
        for (int i = 0; i < this.alunos.size(); i++) {
            Aluno aluno = this.alunos.get(i);

            if(aluno != null) {
                System.out.printf("%d - %s, %d anos%n", i, aluno.nome, aluno.idade);
            } else {
                System.out.printf("%d - Vago%n", i);
            }
        }
    }
}
