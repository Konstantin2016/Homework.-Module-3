package goit.homework.module5_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(); //объект случайные числа
        int[] minMax = new int[11];   // новый массив из .. элементов
      for (int i = minMax.length - 1; i >= 0; i--) {
            minMax[i] = random.nextInt(100);//выбираем для массива случайные чисела [0;100]
            System.out.println("miniMax_random " + minMax[i]);
           int[] a = minMax;
            for (int j = 0; j < a.length - 1; j++) { //метод пузырька
                //System.out.println("miniMax[j]1 " + a[j]);
                if (a[j] > a[j + 1]) {
                    int aTemp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aTemp;
                }
            }
        }
        for (int i = minMax.length - 1; i >= 0; i--){
            System.out.println("miniMax_sort " + minMax[i]);
        };
    }
}
;
