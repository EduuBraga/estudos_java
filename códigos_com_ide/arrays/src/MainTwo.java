import java.util.ArrayList;
import java.util.Arrays;

public class MainTwo {
    public static void main(String[] args) {
        //Removendo elemento de array sem collection;
        String[] jogadores = {"Eduardo", "Vitória", "Chalme", "Imaculada", "Davi", "Dalton", "larissa"};
        String[] timeRefeito = new String[jogadores.length - 1];

        int indiceExclusao = 3;

        System.arraycopy(jogadores,
                0,
                timeRefeito,
                0,
                indiceExclusao);
        System.arraycopy(jogadores,
                indiceExclusao + 1,
                timeRefeito,
                indiceExclusao,
                timeRefeito.length - indiceExclusao);

        System.out.printf("Jogadores: %s%n", Arrays.toString(jogadores));
        System.out.printf("Novo time: %s%n", Arrays.toString(timeRefeito));


        //ArrayList;
        ArrayList<String> gunsCODM = new ArrayList<>();
        gunsCODM.add("Grau 5.56");
        gunsCODM.add("QQP 19");
        gunsCODM.add("DLQ");
        gunsCODM.add("Locus");

        for (int i = 0; i < gunsCODM.size(); i++) {
            String gun = gunsCODM.get(i);
            System.out.println((i + 1) + " - " + gun);
        }

        //Arrays multidimensionais
        String[][] estadosCidades = new String[2][3];

        String[] cearaCidades = estadosCidades[0];
        cearaCidades[0] = "Pentecoste";
        cearaCidades[1] = "Fortaleza";
        cearaCidades[2] = "Paraipaba";

        String[] bahiaCidades = estadosCidades[1];
        bahiaCidades[0] = "Salvador";
        bahiaCidades[1] = "Porto Seguero";
        bahiaCidades[2] = "Chapada Diamantina";

        System.out.println("[" + Arrays.toString(bahiaCidades) + ", " + Arrays.toString(cearaCidades) + "]");

        for (int i = 0; i < estadosCidades.length; i++) {
            for (int j = 0; j < estadosCidades[i].length; j++) {
                String cidade = estadosCidades[i][j];
                System.out.println("cidade = " + cidade);
            }
        }

        for (String[] estado : estadosCidades) {
            for (String cidade : estado) {
                System.out.println("cidade = " + cidade);
            }
        }
    }
}
