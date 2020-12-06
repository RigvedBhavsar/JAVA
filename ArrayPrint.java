//Assignment 66 amd 67
import java.util.*;

class arraycls
{
    public void Display(int arr1[], int arr2[])
    {
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+"\t");
        }
        System.out.println();
        for( int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+"\t");
        }
        System.out.println();
    }

    public void DisplayOdd(int arr1[], int arr2[])
    {
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i] % 2==0)
            {
                System.out.print(arr1[i]+"\t");
            }
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i] % 2==0)
            {
                System.out.print(arr2[i]+"\t");
            }
        }
    }
}
class ArrayPrint
{
    public static void main(String args[])
    {
        Scanner sobj= new Scanner(System.in);
    
        System.out.println("Enter the Size of First array");
        int size1=sobj.nextInt();
        int arr[]= new int [size1];

        System.out.println("Enter the elements of the First array");
        for(int i=0;i<size1;i++)
        {
            arr[i]=sobj.nextInt();
        }

        System.out.println("Enter the Size of Second Array");
        int size2 =sobj.nextInt();
        int brr[]= new int[size2];

        System.out.println("Enter the elemenrts of second array");
        for(int i=0;i<size2;i++)
        {
            brr[i]=sobj.nextInt();
        }
        arraycls aobj= new arraycls();

        aobj.Display(arr, brr);
        aobj.DisplayOdd(arr, brr);
    }
}