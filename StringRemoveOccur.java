//Write a program which accept the string and one character from user and remove  all occurance that from string

import java.util.*;

class stringclass
{
    public void remove(String str , char ch)
    {
        char arr[]= str.toCharArray();  
        char brr[]= new char [arr.length];
        int j=0;
        int i=0;
        while(i<arr.length)
        {
            if(arr[i] != ch)
            {
                brr[j]=arr[i];
                j++;
                i++;
            }
            else
            {
                i++;
            }
        }
        String rev = new String(brr);
        System.out.println(rev);
    }

    public void removeChar(String str , char ch)
    {
        char arr[]= str.toCharArray();  
        int j=0;
        int Count=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] !=ch)
            {
                arr[j++]=arr[i];
            }
            else
            {
                Count++;
            }
        }
        while(Count > 0)
        {
            arr[j++]='\0';
            Count--;
        }
        System.out.println(arr);
    }
}

class StringRemoveOccur
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String");
        String str= sobj.nextLine();

        System.out.println("Entert the Character");
        
        char ch = sobj.next().charAt(0);
       
        stringclass scobj= new stringclass();
        scobj.remove(str, ch);
    }
}   