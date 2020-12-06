/*Write a java program which accept matrix from user and trace and
normal of given matrix.Here trace of the matrix is the sum of the
elements of the main diagonal i.e the diagonal from the upper left to
the lower right of a matrix. Normal of the matrix is the square root of
the sum of sqaures all the elements.
*/
import java.util.*;

class matrixop
{
    public void TraceNormal(int arr[][], int irows , int icols)
    {
        int trace =0;
        int square=0;
        int normal=0;

        for(int i=0 ; i<irows ; i++)
        {
            for(int j=0 ; j<icols ; j++)
            {
                if(i==j)
                {
                    trace = trace + arr[i][j];
                }
            }
        }
        System.out.println("Trace of the matrix is \t"+trace);
        
        for(int i=0 ; i<irows ; i++)
        {
            for(int j=0;j<icols; j++)
            {
                square = square+ (arr[i][j] * arr[i][j]);
            }
        }
        normal=(int)Math.sqrt(square);
        System.out.println("Normal of the Matrix is \t"+normal);
    }
}

class MatrixTraceNormal
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
        matrixop mobj = new matrixop();
        mobj.TraceNormal(arr, irows, icols); 

    }
}