import java.util.*;

class Digit
{
    public int MultDigit(int number)
    {
        int iMult=0;
        int iDigit=0;

        while(number != 0)
        {
            iDigit=number/10;
            if(iDigit==0)
            {
                iDigit=1;
            }
            iMult=iMult*iDigit;
            number=number/10;
        }
        return iMult;
    }

}

class DigitMult
{
    public static void main(String args[])
    {
        Scanner sobj =new Scanner(System.in);
        
        System.out.println("Enter the Number");
        int iNumber=sobj.nextInt();
        
        Digit dobj=new Digit();
        int iRet=dobj.MultDigit(iNumber);
        System.out.println(iRet);
    }
}
