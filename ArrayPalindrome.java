
import java.util.*;

class arraycls
{

    public void ArrayPallindrome(int arr[])
    {
        int i=0;
        int j=arr.length-1;

        while(i<=j)
        {
            if(arr[i]==arr[j])
            {
                i++;
                j--;
            }
            else
            {
                break;
            }
        }
        if(i>j)
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }
    }
}
class ArrayPallindrome
{
    public static void main(String args[])
    {
        arraycls aobj= new arraycls();

        int arrr[] = {11,252,387783,77,11};
        aobj.ArrayPallindrome(arrr);
    }
}