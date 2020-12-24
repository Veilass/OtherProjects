package GalonTable;

import java.util.Arrays;
import java.util.Scanner;

public class xxx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A[];
        int n = 10;

        A = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter A[" + i + "] = ");
        A[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(A[i] + " ");
        }
    }
}

