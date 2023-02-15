package dz3;

import java.util.*;

public class main {
    public static void main(String[] args) {
        // Пусть дан произвольный список целых чисел, удалить из него четные числа
        // (в языке уже есть что-то готовое для этого)
        Random random = new Random();
        int[] arrrr = random.ints(30, 0, 56).toArray();
        System.out.println(Arrays.toString(arrrr));
        arrrr = Arrays.stream(arrrr).filter(x -> x % 2 != 0).toArray();
        System.out.println(Arrays.toString(arrrr));

        //2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
        // и среднее арифметическое из этого списка.

        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < 20; i++)  {
            arrList.add(random.nextInt(0, 30));
        }
        System.out.println();
        System.out.println(arrList.toString());
        int max = Collections.max(arrList);
        int min = Collections.min(arrList);
        int avg = (int) arrList.stream().mapToInt(a->a).summaryStatistics().getAverage();
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + avg);

    }

}
