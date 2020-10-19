package com.alisa;

import java.util.Scanner;

public class task56
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number x: ");
        int x=in.nextInt();
        System.out.print("Input a number y: ");
        int y=in.nextInt();
        System.out.print("Input a number a: ");
        int a=in.nextInt();
        System.out.print("Input a number b: ");
        int b=in.nextInt();
        System.out.print("Input a number c: ");
        int c = in.nextInt();

        if(a < x & b < y)
        {
            System.out.print("The rectangle will go through the hole");
        }
        else if(b<x & a<y)
        {
            System.out.print("The rectangle will go through the hole");
        }
        else if(c<x & b<y)
        {
            System.out.print("The rectangle will go through the hole");
        }
        else if(b<x & c<y)
        {
            System.out.print("The rectangle will go through the hole");
        }
        else if(a<x & c<y)
        {
            System.out.print("The rectangle will go through the hole");
        }
        else if(c<x & a<y)
        {
            System.out.print("The rectangle will go through the hole");
        }
        else
        {
            System.out.print("The rectangle will not go through the hole");
        }

    }
}
