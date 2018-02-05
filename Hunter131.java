package com.java.guvi;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Hunter131
{

    public static void main(String ags[])
    {
        System.out.println("Input");
        Scanner scan = new Scanner(System.in);
        int lim = scan.nextInt();
        int[] num = new int[lim];
        for (int i = 0; i < lim; i++)
        {
            num[i] = scan.nextInt();
        }

        for (int i = 0; i < lim; i++)
        {
            for (int j = i + 1; j < lim; j++)
            {
                if (num[i] > num[j])
                {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("OUTPUT");
        int total = 0;
        for (int k = 0 ; k < lim / 2 ; k++)
        {
            for (int i = 0 + total; i <= lim / 2; )
            {
                System.out.print(num[i] + " ");
                break;
            }
            for (int j = lim - total - 1; j >= lim / 2; )
            {
                System.out.print(num[j] + " ");
                break;
            }
            total++;
        }
        if(!(lim%2==0))
        {
            System.out.print(num[((lim + 1)/2)-1]);
        }

    }
}
