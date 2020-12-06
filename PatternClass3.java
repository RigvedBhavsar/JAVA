//Assignment 64

import java.util.*;
 
class patternclass
{
    public void Pattern1(String str)
    {
        int ilength= str.length();
        for(int i=0 ; i<ilength ; i++)
        {
            for(int j=0 ; j<ilength ; j++)
            {
                if(i>=j)
                {
                    System.out.print(str.charAt(j)+"\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

    public void Pattern2(String str)
    {
        int ilength=str.length();

        for(int i=ilength;i > 0;i--)
        {
            for(int j=0;j<ilength;j++)
            {
                if(j<i)
                {
                    System.err.print(str.charAt(j)+"\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

    public void Pattern3(String str)
    {
        int ilength=str.length();

        for(int i=ilength;i>0;i--)
        {
            for(int j=0;j<ilength;j++)
            {
                if(i>j)
                {
                    System.out.print(str.charAt(j)+"\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
       
        for(int i=1;i<ilength;i++)
        {
            for(int j=0;j<ilength;j++)
            {
                if(j<=i)
                {
                    System.out.print(str.charAt(j)+"\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }


    public void Pattern4(String str)
    {
        int ilength=str.length();

        for(int i=0;i<ilength;i++)
        {
            for(int j=0;j<ilength;j++)
            {
                if(i>=j)
                {
                    System.out.print(str.charAt(j)+"\t");
                }
                else
                {
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }
       
        for(int i=ilength-1;i>0;i--)
        {
            for(int j=0;j<ilength;j++)
            {
                if(i>j)
                {
                    System.out.print(str.charAt(j)+"\t");
                }
                else
                {
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }
    }

}

class PatternClass3
{
    public static void main(String args[])
    {
        patternclass pobj = new patternclass();
/*
        pobj.Pattern1("hello");
        System.out.println();

        pobj.Pattern2("hello");
        System.out.println();

        pobj.Pattern3("hello");
        System.out.println();
*/
        pobj.Pattern4("Hello");
    }
}