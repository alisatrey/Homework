package com.alisa;

import java.util.Scanner;

public class task1
{
    public static void main(String[] args)
    {
        final double Pi = 3.1415926536;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of flower bed : ");
        int r=in.nextInt();
        double perimeter = 2 * Pi * r;
        System.out.println("Perimeter of this flower bed is: "+ perimeter);
        double area=Pi*r*r;
        System.out.println("Area of this flower bed is: "+ area);
    }

}
