package goit.homework.module5_1;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(); //объект случайные числа

        int[] minMax = new int[11];   // новый массив из .. элементов
        for (int i = 0; i < minMax.length; i++) {
            minMax[i] = random.nextInt(100);//выбираем для массива случайные чисела [0;100]
            System.out.println(minMax[i]);
        }
        int min = minMax[0];
        for (int i = 0; i < minMax.length; i++) {
            if (min > minMax[i])
                min = minMax[i];
        }
        System.out.println("min number = " + min);

        int max = minMax[0];
        for (int i = 0; i < minMax.length; i++) {
            if (max < minMax[i])
                max = minMax[i];
        }

        System.out.println("max number= " + max);
    }
};


