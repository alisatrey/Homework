package com.alisa;

import java.util.Scanner;

public class task3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String c1 = "Germany";
        String c2 = "Italy";
        String c3 = "Ukraine";
        System.out.println("How much the phone call will cost from "+c1+" per minute?");
        double u1 = in.nextDouble();
        System.out.println("And how long did the phone call from "+c1+" last?");
        double t1 = in.nextDouble();

        System.out.println("How much the phone call will cost from "+c2+" per minute?");
        double u2 = in.nextDouble();
        System.out.println("And how long did the phone call from "+c2+" last?");
        double t2 = in.nextDouble();

        System.out.println("How much the phone call will cost from "+c3+" per minute?");
        double u3 = in.nextDouble();
        System.out.println("And how long did the phone call from "+c3+" last?");
        double t3 = in.nextDouble();

        System.out.println("The phone call from"+c1+" will cost "+u1*t1);
        System.out.println("The phone call from"+c2+" will cost "+u2*t2);
        System.out.println("The phone call from"+c3+" will cost "+u3*t3);

        System.out.println("The phone call from all this countries together will cost "+(u1*t1+u2*t2+u3*t3));
    }
}
