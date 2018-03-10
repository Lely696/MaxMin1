package com.company;
//Программа поиск максимального и минимального элемента массива

public class Main
{
    public static void main(String[] args) {
        int[] arg={12,25,-3,68,14};
        int max=arg[0];
        int min=arg[0];

        for(int i=0;i<arg.length; i++) {
            if (max<arg[i])
                max=arg[i];
            if (min > arg[i])
                min = arg[i];
           }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);


    }
}