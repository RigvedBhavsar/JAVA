import java.util.*;

class Digit
{
    public int DiffSumEO(int Number)
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

class DigitSumDiffEveOdd
{
    public static void main(String args[])
    {
        Scanner sobj =new Scanner(System.in);
        
        System.out.println("Enter the Number");
        int iNumber=sobj.nextInt();
        
        Digit dobj=new Digit();
        int iRet=dobj.DiffSumEO(iNumber);
        System.out.println(iRet);
    }
}
