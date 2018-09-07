package by.it.ushakov.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60
*/
import java.sql.SQLOutput;
import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        int number1 = k.nextInt();
        int number2 = k.nextInt();
        System.out.print(number1 + number2);

    }
}