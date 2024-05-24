import java.io.File;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) throws IOException {
        File file = new File("books").getCanonicalFile();

//        File[] filesList = file.listFiles();
//        File[] filesList = file.listFiles(File::isFile);
//        File[] filesList = file.listFiles(File::isDirectory);
        File[] filesList = file.listFiles((dir, name) -> name.endsWith(".pdf"));

        if(filesList != null) {
            for (File file1 : filesList) {
                System.out.println(file1.getName());
            }
        }
    }
}
