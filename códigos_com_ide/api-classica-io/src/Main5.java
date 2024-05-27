import java.io.*;

public class Main5 {
    public static void main(String[] args) {
        File fileOrigin = new File("docs\\hello.txt");
        File fileDestiny = new File("docs\\hello2.txt");

        try (InputStream inputStream = new FileInputStream(fileOrigin);
            OutputStream outputStream = new FileOutputStream(fileDestiny)) {
            byte[] bytesRead = new byte[1024];
            int quantityBytesRead;

            while ((quantityBytesRead = inputStream.read(bytesRead)) > 0) {
                outputStream.write(bytesRead, 0, quantityBytesRead);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
