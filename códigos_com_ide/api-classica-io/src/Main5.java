import java.io.*;

public class Main5 {
    public static void main(String[] args) {
        File file = new File("docs\\hello.txt");

        try (InputStream inputStream = new FileInputStream(file)) {
            int byteRead;

            while ((byteRead = inputStream.read()) != -1) {
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
