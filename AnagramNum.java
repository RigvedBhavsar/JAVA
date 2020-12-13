import java.util.Scanner;
//Accept Number two numbers from user and check that numbers are Anagram or Not.
//Anagram numbers are such numbers which contains same digit with same frequency an any order.
class Demo4
{
    public boolean checkAnagram(int Number1 , int Number2)
    {
        int arr[]={0,0,0,0,0,0,0,0,0,0};
        int iDgit =0;
        if((Number1 < 0) || ( Number2 < 0))
        {
            return false;
        }

        while ((Number1 !=0) && (Number2 !=0))
        {
            arr[Number1 % 10]++;
            arr[Number2 % 10]--;

            Number1 = Number1 / 10;
            Number2 = Number2 / 10;
        }

        if((Number1 != 0) || (Number2 !=0))
        {
            return false;
        }
        int i=0;
        for(i=0;i<arr.length ; i++)
        {
            if(arr[i]!= 0)
            {
                break;
            }
        }

        if(i==arr.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class AnagramNum
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int Number1 = sobj.nextInt();

        System.out.println("Ente the Second Numbner");
        int Number2 = sobj.nextInt();

        Demo4 dobj = new Demo4();
        boolean bret=dobj.checkAnagram(Number1, Number2);
        
        if(bret==true)
        {
            System.out.println("Number is Anagram");
        }
        else
        {
            System.out.println("Number is Not Anagram");
        }
    }
}
