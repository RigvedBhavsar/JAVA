/*
1. Write a java program to find Maximum difference between two
elements such that larger element appears after the smaller
number
Examples:
If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff
between 10 and 2).
If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff
between 7 and 9)
*/
import java.util.*;

class arrayDif
{
    public int ArrayDiff(int arr[] )
    {
        int istart=arr[0];
        int iEnd=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>iEnd);
            {
                iEnd=arr[i];
            }
        }
        return iEnd - istart;
    }
}

class ArrayMaxDiffEle
{
    public static void main(String[] args)
    {
        int arr[]={2, 3, 10, 6, 4, 8, 1};
        int brr[]={7, 9, 5, 6, 3, 2 };

        arrayDif aobj = new arrayDif();
        int iRet=aobj.ArrayDiff(arr);
        System.out.println(iRet);
        iRet=aobj.ArrayDiff(brr);
        System.out.println(iRet);
    }  
}