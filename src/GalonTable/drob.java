package GalonTable;

import java.util.Scanner;

public class drob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        byte a = in.nextByte();
        System.out.print("Введите 2 число: ");
        byte b = in.nextByte();

        String num0 = "10";
        
        System.out.println("Результаты: ");
        System.out.println("Сумма - " + (a + b));
        System.out.println("Разница - " + (a - b));
        System.out.println("Умножение - " + (a * b));
        System.out.println("Деление - " + (a / b));
        System.out.println("Остаток от деления - " +(a % b));

        float res = a / b;
        float res2 = a + b + Integer.parseInt(num0);
        System.out.println("Деление - " + res);
        System.out.println("Остаток от деления - " + (a % b));

    }
}