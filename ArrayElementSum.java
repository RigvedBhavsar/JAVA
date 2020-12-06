import java.util.*;
class arr
{
    public void SumArrEle(int arr[])
    {
        int iDigit=0;
        int iElement=0;
        int iSum=0;
        
        for(int i=0;i<arr.length;i++)
        {
            iElement=arr[i];
            iSum=0;
            iDigit=0;

            while(iElement != 0)
            {
                iDigit=iElement % 10;
                iSum=iSum+iDigit;
                iElement=iElement / 10;
            }
            arr[i]=iSum;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}

class ArrayElementSum
{
    public static void main(String args[])
    {
        int arr[]={89,687,56,549,87,9};
        
        arr obj =new arr();
        obj.SumArrEle(arr);
        System.out.println();
       
    }
}