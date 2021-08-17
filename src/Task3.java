/**
 * 3. Создать класс.
 * В методе main объявить две переменные типа int и присвоить им произвольные числовые значения.
 * Для первой переменной вызвать операцию инкремента, для второй переменной вызвать операцию декримента.
 * Результаты вывести на консоль.
 */
public class Task3 {
    /**
     * Main method that prints increment and decrement values of two int variables
     */
    public static void main(String[] args) {
        int first = 13;
        int second = 46;
        first++; --second;
        System.out.printf("Postfix increment first: %d%nPrefix decrement second: %d", first, second);
    }
}
