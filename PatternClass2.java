//Assignment 63
import java.util.*;

class patterncls
{   
    public void pattern1(String str)
    {
        int ilength=str.length();

        for(int i=0;i<ilength;i++)
        {
            for(int j=0;j<ilength;j++)
            {
                System.out.print(str.charAt(j) +"\t");
            }
            System.out.println();
        }
    }
    public void pattern2(String str)
    {
        int ilength=str.length();

        for(int i=ilength;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(str.charAt(j)+"\t");
            }
            System.out.println();
        }
    }
    public void pattern3(String str)
    {
        int ilength=str.length();

        for(int i=0;i<ilength;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(str.charAt(j)+"\t");
            }
            System.out.println();
        }
    }

    public void pattern4(String str)
    {
        int ilength=str.length();

        for(int i=ilength;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(str.charAt(j)+"\t");
            }
            System.out.println();
        }
        
        for(int i=1;i<ilength;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(str.charAt(j)+"\t");
            }
            System.out.println();
        }
    }

    public void pattern5(String str)
    {
        int ilength=str.length();

        for(int i=0;i<ilength-1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(str.charAt(j)+"\t");
            }
            System.out.println();
        }

        for(int i=ilength;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(str.charAt(j)+"\t");
            }
            System.out.println();
        }

    }
}

class PatternClass2
{
    public static void main(String args[])
    {
        patterncls pobj = new patterncls();
//        pobj.pattern1("Hello");
//        System.out.println();
        
//        pobj.pattern2("Hello");
//        System.out.println();
        
//        pobj.pattern3("Hello");
//        System.out.println();
        
//        pobj.pattern4("Hello");
//        System.out.println();
        
        pobj.pattern5("Hello");
        System.out.println();
        

    }
}