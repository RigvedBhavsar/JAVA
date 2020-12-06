import java.util.*;

class Digit
{
    public int CountEvenDigit(int number)
    {
        int iCnt=0;
        int iDigit=0;
        while(number !=0)
        {
            iDigit=number%10;
            if((iDigit%2)==0)
            {
                iCnt++;
            }
            number=number/10;
        }
        return iCnt;
    }

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

    public int DiffSUmmEO(int Number)
    {
        int iEsum=0;
        int iOsum=0;
        int iDigit=0;

        while(Number !=0 )
        {
            iDigit= Number % 10;
            if(iDigit%2==0)
            {
                iEsum=iEsum+iDigit;
            }
            else
            {
                iOsum=iOsum+iDigit;
            }
            Number=Number/10;
        }
        return iEsum-iOsum;
    }
}

class DigitCntEve
{
    public static void main(String args[])
    {
        Scanner sobj =new Scanner(System.in);
        
        System.out.println("Enter the Number");
        int iNumber=sobj.nextInt();
        
        Digit dobj=new Digit();
        int iRet=dobj.CountEvenDigit(iNumber);
        System.out.println(iRet);
    }
}
