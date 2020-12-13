//Accept number from user and check whether that number is Strong Number or Not.
//Strong Number is such number whose summation of factorial of each digit is
//same as that number.

import java.util.*;

class CheckStrong
{
    public boolean isStrongNum(int iNumber)
    {
        int iSum=0 , temp=0 , i=0  , iDigit=0 , iFact=0;
     
        if(iNumber < 0)
        {
            iNumber = -iNumber;
        }
        if(iNumber==0)
        {
            return false;
        }

        temp = iNumber;
        
        while(iNumber != 0)
        {
            iDigit= iNumber % 10;

            for(i=iDigit , iFact=1 ;i>0;i--)
            {
                iFact=iFact*i;
            }
            iSum=iSum+iFact;

            if(iSum > iNumber)
            {
                break;
            }

            iNumber = iNumber / 10;
        }
        
        if(iSum==temp)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}

class StrongNumber
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        CheckStrong dobj = new CheckStrong();

        System.out.println("Entet the NUmnber");
        int iNum = sobj.nextInt();

        boolean bret = dobj.isStrongNum(iNum);
        if(bret==true)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not Strong Number");
        }
    }
}