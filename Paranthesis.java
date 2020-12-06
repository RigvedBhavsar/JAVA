//Accept the String from user and check the paranthesis are balanced are not
import java.util.*;


class strcls
{
    public void expression(String str)
    {
        char arr[]= str.toCharArray();
        int count=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='(')
            {
                count++;
            }
            else if (arr[i]==')')
            {
                count--;
            }
        }
        if(count==-1)
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("Not valid");
        }
    }
}
class Paranthesis
{
    public static void main(String[] args)
    {
        Scanner sobj= new Scanner(System.in);
        System.out.println("Enter the Expression");
        String str=sobj.nextLine();

        
        strcls strobj = new strcls();
        strobj.expression(str);

    }
}