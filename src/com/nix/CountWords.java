package com.nix;

public class CountWords {
    /*Дана строка, содержащая произвольный текст. Сколько слов в тексте? Сколько цифр в тексте?*/
    /*Here I assume that word is any combination of symbols. Words are separated
    by ' '. So "1 2 3" contains 3 numbers and 3 words.*/
    public int[] count(String s)
    {
        int numbers = 0, words = 0;
        boolean wasCharacter = false;
        int length = s.length();
        for(int i =0; i<length;i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                numbers++;
                wasCharacter = true;
            }
            if(c!= ' ') wasCharacter = true;
            if(c==' '&& wasCharacter)
            {
                words++;
                wasCharacter = false;
            }
            if(i==length-1) words++;
        }
        int[] result = {words, numbers};
        return result;
    }
}
