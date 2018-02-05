package com.java.guvi;

import java.util.Scanner;

public class Hunter133
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String string, reversestring = new String();
        string = scan.nextLine();
        String[] split = string.split(" ");
        for (int i = split.length - 1; i >= 0; i--)
        {
            reversestring += split[i] + " ";
        }
        System.out.println(reversestring);

    }
}
