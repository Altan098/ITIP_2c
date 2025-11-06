import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        FileInputStream sourceFile = null;
        FileOutputStream copy2File = null;

        try {
            // Попытка открыть исходный файл
            sourceFile = new FileInputStream("source.txt");
            // Попытка открыть целевой файл
            copy2File = new FileOutputStream("copy2.txt");

            int data;
            while ((data = sourceFile.read()) != -1) {
                copy2File.write(data);

            }
            System.out.println("Файл успешно скопирован");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка открытия файла: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка чтения/записи файла: " + e.getMessage());
        } finally {
            try {
                if (sourceFile != null) {
                    sourceFile.close();
                }
                if (copy2File != null) {
                    copy2File.close();

                }

            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файлов: " + e.getMessage());
            }
        }
    }
}