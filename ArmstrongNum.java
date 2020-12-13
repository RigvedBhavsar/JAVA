import java.util.Scanner;
//check whether the NUmber is Armstrong Number or Not
//Armstrong Number is Such Number whose summation of digit with power is same as
// number of the digit with power is same as number
//Where the power is number of digits in that number 

class Demo3
{
    public boolean checkArm(int iNumber)
    {
        int iSum=0, iLength=0 , temp=0 , i=0 , iMult=0 , iDigit=0;
     
        if(iNumber==0)
        {
            return false;
        }

        temp = iNumber;
        while(iNumber != 0)
        {
            iLength++;
            iNumber = iNumber / 10 ;
        }
        
        iNumber=temp;
        while(iNumber != 0)
        {
            iDigit= iNumber % 10;
            for(i=1 ,iMult=1 ; i<=iLength ; i++)
            {
                iMult = iMult * iDigit;
            }
            iSum= iSum+iMult;
            if(iSum > temp)
            {
                break;
            }
            iNumber = iNumber / 10;
        }

        if(iSum == temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class ArmstrongNum
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        Demo3 dobj = new Demo3();

        System.out.println("Entet the NUmnber");
        int iNum = sobj.nextInt();

        boolean bret = dobj.checkArm(iNum);
        if(bret==true)
        {
            System.out.println("ArmStrong NUmber");
        }
        else
        {
            System.out.println("Not ArmStrong Number");
        }
    }
}