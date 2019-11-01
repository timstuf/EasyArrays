package com.nix;

public class MoveK {
    /*Дан массив А. Циклически сдвинуть элементы массива на K элементов вправо (влево).*/
    public void moveK(int[] mas, int k, boolean toRight) {
        int[] result = new int[mas.length];
        if (toRight) k *= -1;
        for (int i = 0; i < mas.length; i++) {
            if (i + k < 0) result[i] = mas[mas.length + i + k];
            else if (i + k > mas.length - 1) result[i] = mas[i + k - mas.length];
            else result[i] = mas[i + k];
        }
        System.arraycopy(result, 0, mas, 0, mas.length);
    }
}
