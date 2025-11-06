import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try (FileInputStream sourceFile = new FileInputStream("source.txt");
             FileOutputStream copyFile = new FileOutputStream("copy.txt")) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = sourceFile.read(buffer)) != -1) {
                copyFile.write(buffer, 0, bytesRead);
            }

            System.out.println("Файл успешно скопирован");

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
            e.printStackTrace();
        }
    }
}