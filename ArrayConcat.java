import java.util.*;

class arraycls
{

    public int[] ArrayConcat(int arr1[],int iSize1,  int arr2[], int iSize2)
    {
        int crr[]=new int[iSize1 + iSize2];
        int ipos=0;
        for(int i=0;i< iSize1;i++,ipos++)
        {
            crr[ipos]=arr1[i];
        }
        for(int i=0;i<iSize2;i++,ipos++)
        {
            crr[ipos]=arr2[i];
        }

        return crr;
    }

}
class ArrayConcat
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

        int iret[]= new int[size1+ size2];

        iret=aobj.ArrayConcat(arr, size1, brr, size2);
        System.out.println("Concanetaed Array is");

        for(int i=0;i<iret.length;i++)
        {
            System.out.print(iret[i]+"\t");
        }
    }
}