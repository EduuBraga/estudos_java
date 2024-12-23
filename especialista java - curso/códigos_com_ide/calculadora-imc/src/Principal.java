public class Principal {
    public static void main(String[] args) {
        Paciente eduardo = new Paciente();
        eduardo.altura = 1.74;
        eduardo.peso = 73.9;
        eduardo.idade = 19;
        eduardo.nome = "Eduardo Braga";

        CalculadoraImc calculadoraImc = new CalculadoraImc();

        indiceMassaCorporal imcEduardo = calculadoraImc.calcular(eduardo);
        calculadoraImc.situacaoPaciente(imcEduardo, eduardo);
    }
}