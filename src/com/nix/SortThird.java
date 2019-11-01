package com.nix;

public class SortThird {
    /*Даны два упорядоченные массива А и В. Образовать из элементов этих массивов упорядоченный
массив С.*/

    public int[] third(int[] mas1, int[] mas2) {
        int[] result = new int[mas1.length + mas2.length];
        int firstIndex = 0, secondIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (firstIndex >= mas1.length) result[i] = mas2[secondIndex++];
            else if (secondIndex >= mas2.length) result[i] = mas1[firstIndex++];
            else if (mas1[firstIndex] >= mas2[secondIndex]) result[i] = mas2[secondIndex++];
            else if (mas1[firstIndex] <= mas2[secondIndex]) result[i] = mas1[firstIndex++];
        }
        return result;
    }
}
