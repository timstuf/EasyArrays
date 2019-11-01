package com.nix;

public class MinusZeroPlus {

    public void sort(int [] mas)
    {
        /*В одномерном массиве переставить элементы так, чтобы сначала располагались отрицательные
элементы, потом нулевые, а затем положительные. Относительное расположение элементов не изменять.*/
        int[] result = new int[mas.length];
        int negative = 0, positive = mas.length-1;
        for(int i = 0; i<mas.length; i++)
        {
            if(mas[i]<0)
            {
                result[negative++] = mas[i];
            }
            if(mas[mas.length-i-1]>0)
            {
                result[positive--] = mas[mas.length-i-1];
            }
        }
        System.arraycopy(result,0, mas,0,mas.length);
    }
}
