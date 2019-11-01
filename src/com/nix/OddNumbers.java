package com.nix;

public class OddNumbers {
    /*Написать программу, определяющую сумму чисел, содержащих только нечетные
цифры. Определить также, сколько четных цифр в найденной сумме.*/
    public int[] sumOdd(int[] mas)
    {
        int sum = 0;
        for(int i = 0; i<mas.length; i++)
        {
            if(isOdd(mas[i])) sum+= mas[i];
        }
        int[] result = {sum, countEven(sum)}; //first element - sum, second - count of even numbers in this sum
        return result;
    }
    public static boolean isOdd(int number)
    {
        switch(number%10)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9: return true;
            default: return false;
        }
    }
    public static int countEven(int number)
    {
        int count = 0;
        while (number>0)
        {
            if(!isOdd(number%10)) count++;
            number/=10;
        }
        return count;
    }
}
