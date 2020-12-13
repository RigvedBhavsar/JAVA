import java.util.*;

class Demo
{
    public void funcMinMaxSum(int arr[])
    {
        int minSum=0;
        int maxSum=0;
        int length=arr.length;
        for(int i=0 ; i<length-1; i++)
        {
            minSum=minSum+arr[i];
        } 

        for(int j=arr.length-1 ; j > 0 ; j--)
        {
            maxSum = maxSum + arr[j];
        }
        System.out.println("["+ minSum +","+ maxSum + "]");
    } 
} 
class MinMaxSum
{
    
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the the Size of the Array");
        int iSize = sobj.nextInt();

        int Arr[]= new int[iSize];

        System.out.println("Enter the Elements  of the Array");
        
        for(int i=0;i<iSize;i++)
        {
            Arr[i]=sobj.nextInt();
        }

        Demo obj = new Demo();
        obj.funcMinMaxSum(Arr);
    }
}