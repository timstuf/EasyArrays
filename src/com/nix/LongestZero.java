package com.nix;

public class LongestZero {
    /*Дан массив А. Найти длину самой длинной последовательности подряд идущих элементов массива,
равных нулю.*/
    public  int longestZero(int[] mas) {
        int max=0, temp = 0;
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] == 0) max = Math.max(max,++temp);
            else temp = 0;
        }
        return max;
    }
}
