package GalonTable;

import java.util.Scanner;

public class we {
    public static void main(String[] args) {
        int i, a,str;

        System.out.print("Количество строк: ");
        Scanner in = new Scanner(System.in);
        str = in.nextInt();

        for(i = 1; i <= str; i++) {
            for (a = 1; a <= i; a++)
                System.out.print(i);
            System.out.println("");
        }
    }
}
