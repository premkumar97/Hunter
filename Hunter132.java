package com.java.guvi;

import java.util.Scanner;

public class Hunter132
{

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String string = new String();
        string = scan.next();
        char[] ch = string.toCharArray();
        int total = 0;
        for (char c : ch)
        {
            total += (int) c;
        }
        System.out.println(total);
    }
}
