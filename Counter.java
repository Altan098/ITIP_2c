public class Counter {
    private static int count = 0; // Статическая переменная

    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}