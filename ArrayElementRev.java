import java.util.*;
class arr
{
    public void RevArrEle(int arr[])
    {
        int iDigit=0;
        int iElement=0;
        int iRev=0;
        
        for(int i=0;i<arr.length;i++)
        {
            iElement=arr[i];
            iRev=0;
            iDigit=0;

            while(iElement != 0)
            {
                iDigit=iElement % 10;
                iRev=iRev*10+iDigit;
                iElement=iElement / 10;
            }
            arr[i]=iRev;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }

}

class ArrayElementRev
{
    public static void main(String args[])
    {
        int arr[]={89,687,56,549,87,9};
        
        arr obj =new arr();
        obj.RevArrEle(arr);
    }
}