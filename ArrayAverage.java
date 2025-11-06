public class ArrayAverage {
    public static void main(String[] args) {
        // Массив с разными типами данных для демонстрации ошибок
        Object[] arr = {1, 2, 3, 4, 5};
        double sum = 0;
        int validCount = 0;

        try {
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] instanceof Integer) {
                    sum += (Integer) arr[i];
                    validCount++;
                } else {
                    throw new NumberFormatException();
                }
            }

            double average = sum / validCount;
            System.out.println("\nСреднее арифметическое: " + average);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n\nОШИБКА:ВЫХОД ЗА ГРАНИЦЫ МАССИВА!");

        } catch (NumberFormatException e) {
            System.out.println("\n\nОШИБКА:НЕВЕРНЫЕ ДАННЫЕ!");
            if (validCount > 0) {
                double average = sum / validCount;
                System.out.println("Среднее арифметическое корректных элементов: " + average);
            }
        }
    }
}