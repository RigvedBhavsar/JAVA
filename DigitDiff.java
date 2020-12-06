import java.util.*;

class Digit
{
   
    public int Range(int number)
    {
        int iCnt=0;
        int iDigit=0;

        while(number != 0)
        {
            iDigit=number%10;
            if((iDigit>='3')&&(iDigit<='7'))
            {
                iCnt++;
            } 
        }
        return iCnt;
    }
}

class DigitDiff
{
    public static void main(String args[])
    {
        Scanner sobj =new Scanner(System.in);
        
        System.out.println("Enter the Number");
        int iNumber=sobj.nextInt();
        
        Digit dobj=new Digit();
        int iRet=dobj.Range(iNumber);
        System.out.println(iRet);
    }
}
