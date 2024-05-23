public class CalculadoraImc {
    String situacao;

    indiceMassaCorporal calcular(Paciente paciente) {
        double imcCalculado = paciente.peso / (paciente.altura * paciente.altura);

        indiceMassaCorporal imc = new indiceMassaCorporal();
        imc.resultado = imcCalculado;
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;

        return imc;
    }

    void situacaoPaciente(indiceMassaCorporal imc, Paciente paciente) {
        if(imc.resultado < 18.5) {
            situacao = "Abaixo do peso ideal";
        } else if(imc.resultado >= 18.5 && imc.resultado < 25) {
            situacao = "Peso ideal";
        } else if(imc.resultado >= 25 && imc.resultado < 30) {
            situacao = "Acima do peso";
        } else if(imc.resultado >= 30 && imc.resultado < 35) {
            situacao = "Obesidade grau I";
        } else if(imc.resultado >= 35 && imc.resultado < 40) {
            situacao = "Obesidade grau II";
        } else {
            situacao = "Obesidade grau III";
        }

        System.out.printf("O paciente %s obteve o resultado de %.2f%n", paciente.nome, imc.resultado);
        System.out.printf("Sua situação: %s%n", situacao);
    }
}
