package dz1;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        example1();
//        example2();
        example3();
    }

    public static void example1() {
//        1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] arrrr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arrrr.length; i++) {
            arrrr[i] = random.nextInt(50);
            System.out.printf(" %s", arrrr[i]);
        }
        int maxi = arrrr[0];
        int mini = arrrr[0];
        for (int i = 1; i < arrrr.length; i++) {
            if (arrrr[i] > maxi) {
                maxi = arrrr[i];
            }
            if (arrrr[i] < mini) {
                mini = arrrr[i];
            }
        }
        System.out.println();
        System.out.println(maxi);
        System.out.println(mini);

    }

    public static void example2() {
        //2. Написать метод, который определяет, является ли введенный пользователем год високосным,\
        // и возвращает в консоль boolean (високосный - true, не високосный - false). Каждый 4-й год
        // является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the year: ");
        int year400 = scan.nextInt();
        if (year400 % 400 == 0 || year400 % 4 == 0 && year400 % 100 != 0) {
            System.out.printf("The year is leap year %s", year400);
        } else {
            System.out.printf("The year is, not leap year %s", year400);
        }

    }

    public static void example3() {
        //3. Дан массив nums = [3,2,2,3] и число val = 3.
        //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
        // а остальные - равны ему.
        int[] arrrray = new int[15];

        Random random = new Random();
        for (int i = 0; i < arrrray.length; i++) {
            arrrray[i] = random.nextInt(0, 4);
            System.out.print(arrrray[i]);
        }
        int leftInd = 0;
        int rightInd = arrrray.length - 1;
        while (rightInd > leftInd) {
            if (arrrray[rightInd] == 3) {
                rightInd--;
            }
            if (arrrray[leftInd] != 3) {
                leftInd++;
            }
            if (arrrray[leftInd] == 3 && arrrray[rightInd] != 3) {
                int temp = arrrray[rightInd];
                arrrray[rightInd] = arrrray[leftInd];
                arrrray[leftInd] = temp;
                rightInd--;
                leftInd++;
            }

        }
        System.out.println();
        for (int j : arrrray) {
            System.out.print(j);
        }

    }

}
