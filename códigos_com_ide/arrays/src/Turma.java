import java.util.Arrays;

public class Turma {
    String identificacao;
    String professora;
    Aluno[] alunos = new Aluno[0];

    void adicionarAluno(Aluno aluno) {
        this.alunos = Arrays.copyOf(alunos, alunos.length + 1);

        int ultimoElementoDoArray = this.alunos.length - 1;
        this.alunos[ultimoElementoDoArray] = aluno;
    }

    void imprimirListaAlunos() {
        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = alunos[i];

            if(aluno != null) {
                System.out.printf("%d - %s, %d anos%n", i, aluno.nome, aluno.idade);
            } else {
                System.out.printf("%d - Vago%n", i);
            }
        }
    }
}
