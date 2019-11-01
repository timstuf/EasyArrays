package com.nix;

import java.util.Arrays;

public class MagicSquare {
    /*Дана целая квадратная матрица n-го порядка. Определить, является ли она магическим квадратом,
т.е. такой, в которой суммы элементов во всех строках и столбцах одинаковы.*/

    public boolean isMagic(int[][] mas)
    {
        int[] sum = new int[mas.length*2];
        Arrays.fill(sum,0);
        for(int i = 0,j=mas.length; i<mas.length; i++,j++)
        {
            for(int k =0; k<mas.length; k++)
            {
                sum[i]+=mas[i][k];
                sum[j]+=mas[k][i];
            }
        }
        for(int i =0;i<sum.length-1; i++)
        {
            if(sum[i]!=sum[i+1]) return false;
        }
        return true;
    }
}
