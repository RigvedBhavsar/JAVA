import java.util.*;

class number
{
    boolean numberCheck(int arr[], int number)
    {
        boolean flag=false;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==number)
            {
                flag=true;
                break;
            }
        }
        return flag;
    }

    int NumberIndex(int arr[], int number)
    {
        int i=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==number)
            {
                break;
            }
        }
        if(i==arr.length)
        {
            return -1;
        }
        else
        {
            return i;
        }
    }

    int NumberLast(int arr[], int number)
    {
        int i=0;
        for(i=arr.length-1;i>=0 ;i--)
        {
            if(arr[i]==number)
            {
                break;
            }
        }
        if(i==0)
        {
            return -1;
        }
        else
        {
            return i;
        }
    }

    void DisplayRange(int arr[], int start, int end)
    {
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]>=start) && (arr[i]<=end))
            {
                System.out.print(arr[i]);
            }
        }
    }

    int ProductOddElement(int arr[])
    {
        int iProd=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2 != 0)
            {
                if(iProd==0)
                {
                    iProd=1;
                }
                iProd=iProd*arr[i];
            }
        }
        return iProd;
    }
}

class NumberOpe2
{
    public static void main(String args[])
    {
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("Enter the Size of Array");
        int iSize=sobj.nextInt();

        int arr[]= new int [iSize];
        
        System.out.println("Enter the Elemnents of The Array");
        for(int i=0;i<iSize;i++)
        {
            arr[i]=sobj.nextInt();
        }

        System.out.println("Enter the element to be Searched");
        int iSearch=sobj.nextInt();

        number nobj= new number();
        
        boolean flag=nobj.numberCheck(arr,iSearch);
        System.out.println(flag);
    }
}