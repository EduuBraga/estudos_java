public class Paciente {
    double altura;
    double peso;

    indiceMassaCorporal caucularImcDoPaciente() {
        double imcCauculado = peso / (altura * altura);

        indiceMassaCorporal imc = new indiceMassaCorporal();
        imc.resultado = imcCauculado;
        imc.peso = this.peso;
        imc.altura = this.altura;

        return imc;
    }
}
