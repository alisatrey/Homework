package com.alisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class Task88
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        out.print("Enter the number: ");
        int n= in.nextInt();

        int N=n*n;                         //a
        out.println("Number squared: "+N);
        String s = Integer.toString(N);
        int count = 0;
        boolean answer=false;
        for ( int i = 0; i < s.length(); i++ )
        {
            char ch1 = s.charAt(i);
            if(ch1 =='3')
            {
                count=count+1;
            }
        }
        if(count>0)
        {
            answer=true;
        }
        out.println(answer);   // a


        String str = Integer.toString(n);//в
        for ( int i = 0; i <= str.length(); i++ )
        {
            char[] chars = str.toCharArray();
            char ch2 = chars[0];
            chars[0] = chars[chars.length-1];
            chars[chars.length-1]=ch2;
            str=new String(chars);
        }
        out.println("Swap first and last elements: "+str);//в

        String str1 = Integer.toString(n);
        char[] charArray = str1.toCharArray();//б
        String revstr = "";
        for (int i = charArray.length - 1; i >= 0; i--)
        {
            revstr += charArray[i];
        }
        out.println("Reversed string: "+revstr);//б

        List<String> numbers = new ArrayList<String>();//г
        numbers.add("1"+str1+"1");
        out.println("Add '1' at the beginning and at the end: "+numbers);//г
    }
}
