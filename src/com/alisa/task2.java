package com.alisa;

import java.util.Scanner;

public class task2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = in.nextLine();
        System.out.println("Where are you live, "+name+"?");
        String address = in.nextLine();
        System.out.println("So, your name is "+name+" and yo live in "+address);
    }
}
