//Write a program which accept the matrix from user and return the sum of border element
import java.util.*;

class matrixop1
{
    public int SumBorder(int arr[][], int irows , int icols)
    {
        int sum=0;
        for(int i=0 ; i<irows ; i++)
        {
            for(int j=0; j<icols ; j++)
            {
                if( i==0 || i==irows-1 || j==0 || j==icols-1)
                {
                    sum= sum+ arr[i][j];
                }
            }
        }
        return sum;
    }
}
class MatrixSumBorder
{
    public static void main(String args[])
    {
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("Enter the no of rows");
        int irows=sobj.nextInt();
        
        System.out.println("Enter the number of cols");
        int icols=sobj.nextInt();
        
        int arr[][]=new int[irows][icols];

        System.out.println("Enter the elements of the array");

        for(int i=0;i<irows;i++)
        {
            for(int j=0;j<icols;j++)
            {
                arr[i][j]=sobj.nextInt();
            }
        }

        System.out.println("Matrix is : \n");

        for(int i=0;i<irows;i++)
        {
            for(int j=0;j<icols;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        
        matrixop1 mobj= new matrixop1();
        int iret=mobj.SumBorder(arr, irows, icols);

        System.out.println("Sum of border element is \t"+iret);
    }
}