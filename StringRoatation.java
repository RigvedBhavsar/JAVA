//accept two string from user nad check the first string is the rotation of second string
import java.util.*;
class string1
{
    public boolean CheckRotation(String str1, String str2)
    {
        boolean flag=false;
        if(str1.length() != str2.length())
        {
            System.out.println("Lenght of both String should be same");
            return false;
        }
        String cat=str1+ str1;
        flag=cat.contains(str2);
        return flag;
    }
}
class StringRoatation
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Fisrt String");
        String str1 = sobj.nextLine();

        System.out.println("Enter the Second String");
        String str2= sobj.nextLine();

        string1 strobj= new string1();

        boolean value= strobj.CheckRotation(str1, str2);
        if(value == true)
        {
            System.out.println("String 2 Roatation of String 1");
        }
        else
        {
            System.out.println("String 2 is not Roatation of String 1");
        }
    }
}