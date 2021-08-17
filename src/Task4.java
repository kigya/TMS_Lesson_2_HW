/**
 * 4. Создать класс.
 * В методе main объявить переменную типа double и присвоить ей произвольные числовые значения.
 * Сделать явное приведение переменной к типу int.
 * Результат вывести на консоль.
 */
public class Task4 {
    /**
     * Main method that prints variable after explicit conversion to the int type
     */
    public static void main(String[] args) {
        double a = 3.14;
        int b = (int) a;
        System.out.printf("Int: %d", b);
    }
}
