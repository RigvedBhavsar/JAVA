import java.util.*;
class arr
{

    public void ArrPattern(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i];j++)
            {
                System.err.print("*\t");
            }
            System.out.println();
        }
    }

}

class Pattern1
{
    public static void main(String args[])
    {
      
        int brr[]={5,7,8,5,3,7,4};
        arr obj =new arr();
        obj.ArrPattern(brr);
    }
}