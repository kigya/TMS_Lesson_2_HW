/**
 * 2. Создать класс.
 * В методе main объявить четрые переменные типа int и присвоить им произвольные числовые значения.
 * Первая переменная должна быть в двоичном формате, вторая - в восьмеричном, третья - в десячином, четветая в шестнадцатиричном.
 * Вывести результат на консоль.
 */
public class Task2 {
    /**
     * Main method to output the values of four variables in different number systems to the console
     */
    public static void main(String[] args) {
        int binary = 0b10111;
        int octal = 032;
        int decimal = 15;
        int hexadecimal = 0xA4;
        System.out.printf("Binary: %d%nOctal: %d%nDecimal: %d%nHexadecimal: %d", binary, octal, decimal, hexadecimal);
    }
}
