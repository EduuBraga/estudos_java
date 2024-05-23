import com.github.EduuBraga.empresa.Holerite;
import com.github.EduuBraga.empresa.Programador;

public class Principal {
    public static void main(String[] args) {
        Programador devEdu = new Programador("Eduardo Ponciano", 9);
        devEdu.setValorBonus(300);

        double salarioMesDezembro2023 = devEdu.calcularSalario(160);
        System.out.println(salarioMesDezembro2023);
        System.out.println(devEdu.toString());


    }
}
