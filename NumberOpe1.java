import java.util.*;
class Number
{
    public int Diff(int arr[])
    {
        int iEsum=0;
        int iOsum=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] %2 ==0)
            {
                iEsum=iEsum+arr[i];
            }
            else
            {
                iOsum=iOsum+arr[i];
            }
        }
        return iEsum-iOsum;
    }

    public void DivbyFive(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % 5==0)
            {
                System.out.print(arr[i]);
            }
        }
    }

    public void EvenDivByFive(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]%5==0) && (arr[i]%2==0))
            {
                System.out.print(arr[i]);
            }
        }
    }
}

class NumberOpe1
{
    public static void main(String args[])
    {
        
        Scanner sobj=new Scanner(System.in);   
        System.out.println("Enter the Number");
        int iSize=sobj.nextInt();

        int arr[] =new int[iSize];

        System.out.println("ENter the elements");
        for(int i=0;i<iSize;i++)
        {
            arr[i]=sobj.nextInt();    
        }
        Number nobj=new Number();

        int iRet=nobj.Diff(arr);
        System.out.println("Differnce is "+iRet);
    }
}