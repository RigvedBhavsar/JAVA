//Assignment 66 amd 67
import java.util.*;

class arraycls
{

    public void SumArray(int arr1[], int arr2[])
    {
        int iSum=0;
        
        for(int i=0;i<arr1.length;i++)
        {
            iSum=iSum+arr1[i];
        }
        System.out.println("Sum of elements of First array is"+iSum);
        iSum=0;
        for(int i=0;i<arr2.length;i++)
        {
            iSum=iSum+arr2[i];
        }
        System.out.println("Sum of elements of Second array is"+iSum);
    }

}
class ArraySum
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

        aobj.SumArray(arr, brr);
    }
}