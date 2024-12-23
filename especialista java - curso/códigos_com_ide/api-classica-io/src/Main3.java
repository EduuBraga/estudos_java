import java.io.File;
import java.io.IOException;
import java.time.Instant;

public class Main3 {
    public static void main(String[] args) throws IOException {
        File directory1 = new File("docs");
        File file1 = new File(directory1, "log.txt");

        System.out.println(directory1.getName());
        System.out.println(file1.getParent());

        System.out.printf("É um arquivo: %b%n", directory1.isFile());
        System.out.printf("É um diretório: %b%n", directory1.isDirectory());

        System.out.printf("Arquivo existe: %b%n", file1.exists());
        System.out.printf("Arquivo está oculto: %b%n", file1.isHidden());

        System.out.printf("Tamanho: %d%n", file1.length());
        System.out.printf("Última modificação: %s%n", Instant.ofEpochMilli(file1.lastModified()));

        System.out.printf("Pode executar: %b%n", directory1.canExecute());
        System.out.printf("Pode ser lido: %b%n", directory1.canRead());
        System.out.printf("Pode ser escrito: %b%n", directory1.canWrite());
    }
}
