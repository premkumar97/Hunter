package com.java.guvi;

import java.util.Scanner;

public class Hunter11
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String string, reverseword = new String();
        string = scan.nextLine();
        String[] split = string.split(" ");
        for (int i = 0; i < split.length; i++)
        {
            StringBuilder input1 = new StringBuilder("");
            input1.append(split[i]).reverse();
            reverseword += input1 + " ";
        }
        System.out.println(reverseword);

    }
}
