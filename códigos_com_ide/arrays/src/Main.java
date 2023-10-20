import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Turma b = new Turma();
        b.identificacao = "3º - B";
        b.professora = "Mailza";

        b.alunos = new Aluno[2];

        b.alunos[0] = new Aluno();
        b.alunos[0].nome = "Alan faustino";
        b.alunos[0].idade = 20;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Amanda mikelly";
        aluno1.idade = 20;

        b.alunos[1] = aluno1;

        for (Aluno aluno : b.alunos) {
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Idade: " + aluno.idade);
        }

        System.out.printf("Total de alunos na turma %s: %d", b.identificacao, b.alunos.length);
    }
}