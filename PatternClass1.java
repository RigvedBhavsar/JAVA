//Assignment 61 nad 62

import java.util.*;
class pattern
{
    public void print1(int irow , int icol)
    {
        char ch='A';
        for(int i=0;i<irow;i++)
        {
            ch='A';
            for(int j=0; j<icol ; j++)
            {
                System.out.print(ch +"\t");
                ch++;
            }
            System.out.println();
        }
    }

    public void pattern2(int irow , int icol)
    {
        char ch;

        for(int i=0;i<irow;i++)
        {
            if((i % 2)==0)
            {
                ch='A';
                for( int j=0;j<icol;j++)
                {
                    System.out.print(ch+"\t");
                    ch++;
                }
            }
            else if((i%2)!=0)
            {
                ch='a';
                for(int j=0; j<icol; j++)
                {
                    System.out.print(ch +"\t");
                    ch++;
                }
            }
            System.out.println();
        }
    }

    public void Pattern3 (int irow , int icol)
    {
        char ch='A';
        for(int i=0;i<irow;i++, ch++)
        {
            for(int j=0;j<icol;j++)
            {
                System.out.print(ch +"\t");
            }

            System.out.println();
        }
    }

    public void Pattern4(int irow , int icol)
    {
        for(int i=irow;i>0;i--)
        {
            for(int j=0;j<icol;j++)
            {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }

    public void  Pattern5(int irow, int icol)
    {
        int num=1;
        for(int i=0;i<irow;i++)
        {
            for(int j=0;j<icol;j++)
            {
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }
    }

    public void Pattern6(int irow, int icol)
    {
        for(int i=0;i<irow;i++)
        {
            for(int j=icol;j>0;j--)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
    public void Pattern7(int irow, int icol)
    {
        for(int i=0;i<irow;i++)
        {
            for(int j=0;j<icol;j++)
            {
                if((j%2)==0)
                {
                    System.out.print("* \t");
                }   
                else
                {
                    System.out.print("# \t");
                }
            }
            System.out.println();
        }
    }
}


class PatternClass1
{
    public static void main(String args[])
    {
/*       Scanner sobj= new Scanner(System.in);

        System.out.println("Enter the number of Rows");
        int rows= sobj.nextInt();

        System.out.println("Enter the number of colomns");
        int cols=sobj.nextInt();
*/        
        pattern pobj = new pattern();

        pobj.print1(4,4);
        System.out.println();
        pobj.pattern2(4, 4);
        System.out.println();
        pobj.Pattern3(4,4);
        System.out.println();
        pobj.Pattern4(4, 4);
        System.out.println();
        pobj.Pattern5(4, 4);
        System.out.println();
        pobj.Pattern6(3,5);
        System.out.println();
        pobj.Pattern7(4,5);
    }
}