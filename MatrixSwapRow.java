//Write a java Program which accept the matrix from user and swap the contents of the each consicative rows
import java.util.*;

class matrixrwow
{
    public void SwapRow(int arr[][], int irows , int icols)
    {
        int temp=0;
        for(int i=0;i<irows ;i=i+2)
        {
            for(int j=0;j<icols;j++)
            {
                temp = arr[i][j];
                arr[i][j]=arr[i+1][j];
                arr[i+1][j]=temp;
            }
        }
        System.err.println("After Swapning of Rows");
        for(int i=0;i<irows ;i++)
        {
            for( int j=0;j<icols;j++)
            {
                System.err.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}


class MatrixSwapRow
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
        matrixrwow mobj = new matrixrwow();
        mobj.SwapRow(arr,irows, icols);
    }
}