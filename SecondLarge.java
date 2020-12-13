//Accept N Numbers from user and return the second largestb number from that Array of numbers
import java.util.*;

class ArrClass
{
    public int Largesec(int Arr[])
    {
        int iMax1=Arr[0];
        int iMax2= Arr[0];
        int i=0;
        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]>iMax1)
            {
                iMax2= iMax1;
                iMax1=Arr[i];
            }
            else if((Arr[i]>iMax2)&&(Arr[i]!=iMax1))
            {
                iMax2= Arr[i];   
            }
            else if(iMax1==iMax2)
            {
                iMax2=Arr[i];
            }
        }
        return iMax2;
    }
}
class SecondLarge
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of the Array");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements of the Array");
        for(int i=0; i<Arr.length; i++)
        {
            Arr[i]=sobj.nextInt();
        }

        System.out.println("Array is ");

        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+"_");
        }

        ArrClass aobj= new ArrClass();
        int iResult = aobj.Largesec(Arr);
        System.out.println("Second Largest Number"+iResult);
    }
}