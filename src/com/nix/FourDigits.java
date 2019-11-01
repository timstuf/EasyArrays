package com.nix;

public class FourDigits {
    /*Дан массив из n четырехзначных натуральных чисел. Вывести на экран только те, у которых сумма
первых двух цифр равна сумме двух последних.*/
    public int[] fourdigits(int[] mas)
    {
        int[] res = new int[mas.length];
        int count = 0;
        for(int i = 0;i<mas.length; i++)
        {
            if(check(mas[i])) res[count++] = mas[i];
        }
        int[] result = new int[count];
        System.arraycopy(res,0,result,0,count);
        return result;
    }
    public static boolean check(int four)
    {
        int sum = four%10 + four/10%10;
        int sum2 = four/100%10+four/1000%10;
        if(sum == sum2) return true;
        else return false;
    }
}
