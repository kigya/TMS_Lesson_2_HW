/**
 * 1. Создать класс.
 * В методе main объявить три переменные типа int и присвоить первой числовое значение,
 * вторая переменная равна первой переменной увеличенной на 3, а третья переменная равна сумме первых двух.
 * Вывести результат на консоль.
 */

public class Task1 {
    /**
     * Main method to output the values of three variables to the console
     */
    public static void main(String[] args) {
        int first = 10;
        int second = first + 3;
        int third = first + second;
        System.out.printf("First: %d%nSecond: %d%nThird: %d", first, second, third);
    }
}
