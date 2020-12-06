//Accept the matrix from the user and swap the cocicative coloumns of the matrix 
import java.util.*;

class matrixcol
{
    public void SwapCol(int arr[][], int irows , int icols)
    {
        int temp=0;

        for(int i=0;i<irows; i++)
        {
            for(int j=0;j<icols;j=j+2)
            {
                temp=arr[i][j];
                arr[i][j]=arr[i][j+1];
                arr[i][j+1]=temp;
            }
        }
        System.out.println("After the Swap");

        for(int i=0;i<irows;i++)
        {
            for(int j=0;j<icols;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
class MatrixSwapCols
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

        matrixcol mobj= new matrixcol();
        mobj.SwapCol(arr, irows, icols);
    }
}