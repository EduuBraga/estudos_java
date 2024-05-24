import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        // Endereço canônico e absoluto
        File fileLog = new File("C:\\www\\repositories\\REPO-estudos_java\\códigos_com_ide\\api-classica-io\\logs\\logInput.txt");
        System.out.println(fileLog);
        System.out.println("---------------------");

        File fileLog2 = new File("logs\\logInput.txt");
        System.out.println(fileLog2);
        System.out.println(fileLog2.getAbsoluteFile());
        System.out.println("---------------------");

        File fileLog3 = new File("..\\logs\\logInput.txt");
        System.out.println(fileLog3.getAbsoluteFile());
        System.out.println(fileLog3.getCanonicalFile());

        System.out.println("---------------------");

        // Renomeando e removendo
        File folderLogs = new File("C:\\www\\repositories\\REPO-estudos_java\\códigos_com_ide\\api-classica-io\\logs");
        File folderLogOutput = new File("C:\\www\\repositories\\REPO-estudos_java\\códigos_com_ide\\api-classica-io\\logsOutput");

        System.out.println(folderLogs.renameTo(folderLogOutput));

        File fileRemove = new File(folderLogOutput, "logInput.txt");
        System.out.println(fileRemove.delete());
    }
}
