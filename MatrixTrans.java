//Accept the matrix form user and return the transpose of the matrix
import java.util.*;
class matrixtran
{
    public void transpose(int arr[][], int irows , int icols)
    {
        int brr[][]= new int [irows][icols];

        for(int i=0;i<irows ; i++)
        {
            for(int j=0;j<icols; j++)
            {
                brr[j][i]=arr[i][j];
            }
        }
        System.out.println("After Transpose");
        for(int i=0;i<irows ; i++)
        {
            for(int j=0;j<icols; j++)
            {
                System.out.print(brr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
class MatrixTrans
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
        matrixtran mobj = new matrixtran();
        mobj.transpose(arr, irows, icols);
    }
}