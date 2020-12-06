import java.util.Scanner;


//Write a program which accepts two array and returns the new array 
//which contains that two array in reverse format.

class ArrRevContcat
{
    public int[] reverse(int arr1[], int arr2[])
    {
        int rev[]= new int[arr1.length+arr2.length];
        int j=0;
        for(int i=arr1.length-1 ;i >=0 ;i--,j++)
        {
            rev[j]=arr1[i];
        }

        for(int i=arr2.length-1 ; i>=0 ;i--,j++)
        {
            rev[j]=arr2[i];
        }

        return rev;
    }
}


class ArrayRevConcat
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of the first array");
        int size1 = sobj.nextInt();
        int arr1[]= new int[size1];

        System.out.println("Enter the Elements of First array");
        for(int i=0;i<size1;i++)
        {
            arr1[i]=sobj.nextInt();
        }

        System.out.println("Enter the size of the Secong array");
        int size2 = sobj.nextInt();
        int arr2[]= new int[size2];

        System.out.println("Enter the Elements of second array");
        for(int i=0;i<size1;i++)
        {
            arr2[i]=sobj.nextInt();
        }


    }
}