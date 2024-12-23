import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Criando arquivos
        File folder1 = new File("C:\\www\\repositories\\REPO-estudos_java\\códigos_com_ide\\api-classica-io\\docs");
        System.out.printf("Pasta criada: %b%n", folder1.mkdir());

        File folder2 = new File("C:\\www\\repositories\\REPO-estudos_java\\códigos_com_ide\\api-classica-io\\tmp\\logs");
        System.out.printf("Pasta criada: %b%n", folder2.mkdirs());

        File folder3 = new File("C:\\www\\repositories\\REPO-estudos_java\\códigos_com_ide\\api-classica-io\\fotos\\icons\\dev");
        System.out.printf("Pasta criada: %b%n", folder3.mkdirs());

        File file1 = new File("C:\\Users\\choco\\www\\repositories\\REPO-estudos_java\\códigos_com_ide\\api-classica-io\\docs\\log1.txt");
        File file2 = new File("C:\\Users\\choco\\www\\repositories\\REPO-estudos_java\\códigos_com_ide\\api-classica-io\\docs", "log1.txt");
        File file3 = new File(folder1, "log1.txt");

        System.out.printf("Arquivo 3 criado: %b%n", file3.createNewFile());

    }
}
