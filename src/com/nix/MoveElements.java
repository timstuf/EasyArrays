package com.nix;

import java.util.Arrays;

public class MoveElements {
    /*Дана целочисленная квадратная матрица. Найти в каждой строке наибольший элемент и поменять
его местами с элементом главной диагонали.*/
    public void moveBiggestElement(int[][] mas)
    {
        int[] maximum = new int[mas.length];
        Arrays.fill(maximum, 0);

        for(int i = 0; i<mas.length; i++)
        {
            for(int j = 0; j<mas.length; j++)
            {
                if(mas[i][j]>mas[i][maximum[i]]) maximum[i] = j;
            }
            int temp = mas[i][i];
            mas[i][i] = mas[i][maximum[i]];
            mas[i][maximum[i]] = temp;
        }
    }

}
