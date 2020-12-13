//Check Whether the Number is Lucky Number or not.
//Lucky number is such number which contains every unique didigt in it .
import java.util.*;
class Demo1
{
    public boolean checkLucky(int No)
    {
        int arr[]={0,0,0,0,0,0,0,0,0,0};
        int iDigit =0;

        if (No < 0)
        {
            No = -No;
        }
        
        while(No != 0)
        {
            iDigit = No % 10;
            arr[iDigit]++;

            if(arr[iDigit] > 1)
            {
                break;
            }
            No = No / 10;
        }
        if(No == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class LuckyNumber
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int Number = sobj.nextInt();

        Demo1 dobj = new Demo1();
        boolean bret = false;
        
        bret = dobj.checkLucky(Number);

        if(bret==true)
        {
            System.out.println("Number is Lucky");
        }
        else
        {
            System.out.println("Number is NOT Lucky");
        }
    }   
}