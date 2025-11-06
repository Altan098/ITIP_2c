import java.util.Scanner;

// Класс исключения для возраста
class CustomAgeException extends Exception {
    public CustomAgeException(String message, int age) {
        super(message + "\n" + age + " Недопустимый возраст ");
    }
}

// Основная программа
public class CustomAgeExceptionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите возраст: ");
            int age = scanner.nextInt();

            // Проверка возраста
            if (age < 0) {
                throw new CustomAgeException("Возраст не может быть отрицательным", age);
            }
            if (age > 120) {
                throw new CustomAgeException("Возраст не может превышать 120 лет", age);
            }

            System.out.println("Возраст корректен: " + age + " лет");

        } catch (CustomAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());

            // Запись в файл (простой способ)
            try {
                java.io.FileWriter writer = new java.io.FileWriter("exceptions.log", true);
                writer.write("CustomAgeException: " + e.getMessage() + "\n");
                writer.close();
            } catch (java.io.IOException ioException) {
                System.out.println("Не удалось записать в файл логов");
            }

        } catch (Exception e) {
            System.out.println("Ошибка: введите целое число");
        } finally {
            scanner.close();
        }
    }
}