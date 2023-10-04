public class indiceMassaCorporal {
    double resultado;
    double peso;
    double altura;
    String situacao;
    Paciente paciente;

    void situacaoPaciente() {
        if(resultado < 18.5) {
            situacao = "Abaixo do peso ideal";
        } else if(resultado >= 18.5 && resultado < 25) {
            situacao = "Peso ideal";
        } else if(resultado >= 25 && resultado < 30) {
            situacao = "Acima do peso";
        } else if(resultado >= 30 && resultado < 35) {
            situacao = "Obesidade grau I";
        } else if(resultado >= 35 && resultado < 40) {
            situacao = "Obesidade grau II";
        } else {
            situacao = "Obesidade grau III";
        }

        System.out.printf("O paciente %s obteve o resultado de %.2f%n", paciente.nome, resultado);
        System.out.printf("Sua situação: %s%n", situacao);
    }
}
