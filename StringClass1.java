import java.util.*;

class Line
{
    public int CountCapital(String str)
    {
        int iCnt = 0;
		char arr[] = str.toCharArray();

		for (int i=0 ; i<arr.length ; i++)
		{
			{
                if((arr[i]>='A')&&(arr[i]<='Z'))
				iCnt++;
			}
		}
        return iCnt;
    }

    public int CountSmall(String str)
    {
        int iCnt=0;
        char arr[]=str.toCharArray();

        for(int i=0;i<arr.length; i++)
        {
            if((arr[i]>='a')&&(arr[i]<='z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }

    public int FreqCapSmall(String str)
    {
        int iEcnt=0;
        int iOcnt=0;

        char arr[]=str.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]>='A')&&(arr[i]<='Z'))
            {
                iEcnt++;
            }
            else if((arr[i]>='a')&&(arr[i]<='z'))
            {
                iOcnt++;
            }
        }
        return iOcnt-iEcnt;
    }

    public void checkvoWel(String str)
    {

        char arr[]=str.toCharArray();
        boolean flag=false;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='a'||arr[i]=='i'||arr[i]=='e'||arr[i]=='o'||arr[i]=='u')
            {
                flag=true;
                break;
            }    
        }
        if(flag==true)
        {
            System.out.println("present");
        }
        else
        {
            System.out.println("present");
        }
    }

    public void DisplayRev(String str)
    {
        char arr[]=str.toCharArray();

        for(int i=arr.length-1; i >=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}

class StringClass1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String value = sobj.nextLine();

		Line lobj = new Line();
		int iRet=0;
        iRet=lobj.CountCapital(value);
        System.out.println("Capital Count is"+iRet);

        iRet=lobj.CountSmall(value);
        System.out.println("Small Count is"+iRet);

        iRet=lobj.FreqCapSmall(value);
        System.out.println("Diff is "+iRet);

        lobj.checkvoWel(value);
        lobj.DisplayRev(value);
        
    }
}