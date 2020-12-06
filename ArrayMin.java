//Assignment 66 amd 67
import java.util.*;

class arraycls
{

    public void DisplyMin(int arr1[], int arr2[])
    {
        int imin=0;

        imin=arr1[0];
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]<imin)
            {
                imin=arr1[i];
            }
        }
        System.out.println("min elemnet of First array is "+imin);
        imin=arr2[0];

        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]< imin)
            {
                imin=arr2[i];
            }
        }
        System.out.println("min element of Second array is "+imin);
    }
}
class ArrayMin
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

        aobj.DisplyMin(arr, brr);
    }
}