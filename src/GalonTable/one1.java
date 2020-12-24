package GalonTable;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Введите имя первый игрок: ");
        String user1 = in.nextLine();
        System.out.print("Введите имя второй игрок: ");
        String user2 = in.nextLine();

        System.out.print(user1 + ", вы хотите выбрать rock, paper или scissors?");
        String u1= in.nextLine();
        System.out.print(user2 + ", вы хотите выбрать rock, paper или scissors?");
        String u2 = in.nextLine();

        System.out.println(compare(u1, u2));
    }

    public static String compare(String u1, String u2) {
            if (u1 == u2)
                System.out.print("Ничья!");
            if (u1 == "rock")
                if (u2 == "scissors")
                    return ("Камень выиграл");
                else
                    return ("бумага выиграла!");
            else if (u1 == "scissors")
                if (u2 == "paper")
                    return ("ножницы выиграли!");
                else
                    return ("камень выиграл!");
            else if (u1 == "paper")
                if (u2 == "rock")
                    return ("бумага выиграла!");
                else
                    return ("ножницы выиграли");
            else if (u1 == "rock")
                if (u2 == "paper")
                    return ("Ножницы выиграли");
                    else
                        return ("бумага выиграла");
        else
            return ("Неверный код! Необходимо ввести одно из: rock, paper или scissors");
    }
}










//        Scanner in = new Scanner(System.in);
//        int i = 0;
//        do{
//            System.out.println("Введите число: ");
//            i = in.nextInt();
//        }while (i != 0);
//        System.out.print("Вы угадали число!");
//        for(int a = -7; a <= 12; a+=3) {
//            if(a != -1 && a != 5 && a != 11)
//            System.out.println(a);
//        }
//        int b = -7;
//        do{
//            if(b != -1 && b != 5 && b != 11)
//        System.out.println(b);
//            b +=3;
//        }while (b < 12);
////        int i = 0;
//        while (i < 10) {
//            if(i == 5)
//                break;
//            if(i % 2 == 0){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//                i++;
//
//        }

//        ArrayList<String> names = new ArrayList<>(0);
//        names.add("Мартин");
//        names.add("Лютер");
//        names.add("Кинг");
//        names.add("Двач");
//        names.add("Саб");
//
//        for (String el : names)
//            System.out.println(el);
//        short [][] arr = new short[][]{
//                {2, 5, 6, 1, 3},
//                {2, 5, 1, 5, 6},
//                {6, 5, 1, 6},
//                {25, 61, 15, 10}
//        };
//
//        for(int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        short[] ar = new short[] {2, 7, 10, 15, 21, 8};
//        for (int i = 0; i < ar.length; i++)
//            System.out.println("Значение элемента " + (i+ 1) + " = " + ar[i]);
//
//
//        int user_input;
//        Scanner in = new Scanner(System.in);
//        do {
//            System.out.print("Введите число 5: ");
//            user_input = in.nextInt();
//        } while (user_input != 5);
//        System.out.println("Вы ввели верно!");


//        for (float i = 100; i > 1; i /= 2) {
//            System.out.println(i);
////        }
////        int i = 0;
////        while (i < 10) {
////            System.out.println("Значение переменной: " + i);
////            i++;
////
////        }
////        int j = 100;
////        do{
////            System.out.println("Сработал: ");
////            j /= 2;
////        } while (j > 10);