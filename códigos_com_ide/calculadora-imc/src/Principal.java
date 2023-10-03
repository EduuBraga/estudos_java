public class Principal {
    public static void main(String[] args) {
        Paciente eduardo = new Paciente();
        eduardo.altura = 1.74;
        eduardo.peso = 73.9;

        indiceMassaCorporal imcEduardo = eduardo.caucularImcDoPaciente();

        System.out.printf("IMC: %.2f%n", imcEduardo.resultado);
    }
}