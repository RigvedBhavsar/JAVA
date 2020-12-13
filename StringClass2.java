//Assignment 60
import java.util.*;


class stringOperation
{
    public String Concat(String start, String dest , int size)
    {
        char arr[]=start.toCharArray();
        char brr[]=dest.toCharArray();
        char crr[]=new char[arr.length + brr.length];
        int ipos=0;
        for( int i=0;i<arr.length;i++)
        {
            crr[ipos]=arr[i];
            ipos++;
        }
        for(int i=0 ;i<brr.length && (size!=0);i++, size--)
        {
            crr[ipos]=brr[i];
            ipos++;
        }
        System.out.println(crr);
        arr=crr;                //array is not extending 
        System.out.println(arr);
        return arr.toString();
    }

    public void StrCmp(String str1, String str2)
    {
        char arr[]=str1.toCharArray();
        char brr[]=str2.toCharArray();

        if(arr.length != brr.length)
        {
            return;
        }
        int i=0;
        for( i=0;i<arr.length;i++)
        {
            if(arr[i] != brr[i])
            {
                break;
            }
        }
        if(i==arr.length)
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are not same");
        }
    }
    
    public boolean Strcmp2(String str1, String str2 ,int number)
    {
        char arr[]=str1.toCharArray();
        char brr[]=str2.toCharArray();
        int i=0;
        for(i=0;i<number;i++)
        {
            if(arr[i] != brr[i])
            {
                break;
            }
        }
        if(i==number)
        {
            return true;
        }
        else    
        {
            return false;
        }
    }  
    public void RevToggle(String str)
    {
        char arr[]=str.toCharArray();
        char brr[]= new char[arr.length];

        for(int i=arr.length-1 ; i>=0 ; i--)
        {
            if((arr[i]>='A')&&(arr[i]<='Z'))
            {
                brr[i]=(char)(arr[i]+32);
            }
            else if ((arr[i]>='a')&&(arr[i]<='z'))
            {
                brr[i]=(char)(arr[i]-32);
            }
        }
        System.out.println(brr);
        
    }
    public void pallindrome(String Str)
    {
        char arr[]=Str.toCharArray();
        int i=0;
        int j=arr.length-1;
        
        while(i<=j)
        {
            if((arr[i] == arr[j]) || (arr[i] == arr[j]+32) ||(arr[i] == arr[j]-32))
            {
                i++;
                j--;
            }
            else
            {
                break;
            }
        }
        
        if(j < i)
        {
            System.out.println("Plllindrome");
        }
        else
        {
            System.out.println(" Not pallindrome");
        }
    }

    public void StringReverse( String str)
    {
        char arr[]=str.toCharArray();
        int iStart=0;
        int iEnd = arr.length-1;
        char temp;

        while(iStart < iEnd)
        {
            temp = arr[iStart];
            arr[iStart]=arr[iEnd];
            arr[iEnd]=temp;

            iStart++;
            iEnd--;
        }
        String rev = arr.toString();
        System.out.println(rev);
    }
}

class StringClass2
{
    public static void main(String args[])
    {
       
/*        Scanner sobj= new Scanner(System.in);
        System.out.println("Enter the First String");
        String str1=sobj.nextLine();

        System.out.println("Enter the Second String");
        String str2=sobj.nextLine();
        
        System.out.println("Enter the size of concatination");
        int iSize=sobj.nextInt();

        
        String result = strobj.Concat(str1, str2, iSize);
*/
    stringOperation strobj = new stringOperation();
    //  strobj.RevToggle("Rigved");
    strobj.pallindrome("1abcacBA1");    
    }
}