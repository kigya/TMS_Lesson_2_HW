/**
 * 5. Создать класс.
 * В методе main объявить две переменные.
 * Первую переменную объявить типом char и присвоить значение 1, вторую переменную объявить типом int и присвоить занчение 1.
 * Вывести на консоль результат первая переменная + вторая переменная.
 * Подумать над полученным результатом.
 */
public class Task5 {
    /**
     * Main method that prints char + int result
     */
    public static void main(String[] args) {
        char first = '1';
        int second = 2;
        System.out.println(first + second);
        /*
         Compiler uses Unicode (a superset of ASCII), so character '1' is actually decimal integer 49 (hex 31 is decimal 49)
         Since addition by default returns an integer, the character gets transformed and added: 49 + 2 = 51
         */
    }
}
