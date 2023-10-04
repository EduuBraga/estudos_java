public class CalculadoraImc {
    indiceMassaCorporal calcular(Paciente paciente) {
        double imcCalculado = paciente.peso / (paciente.altura * paciente.altura);

        indiceMassaCorporal imc = new indiceMassaCorporal();
        imc.resultado = imcCalculado;
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;
        imc.paciente = paciente;

        return imc;
    }
}
