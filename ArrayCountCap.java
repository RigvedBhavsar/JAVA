import java.util.*;
class arr
{
    public void CountCapArr(char arr[])
    {
        int iCnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]>='A') && (arr[i]<='Z'))
            {
                iCnt++;
            }
        }
        System.out.println("Capital element is "+iCnt);
    }

}

class ArrayCountCap
{
    public static void main(String args[])
    {
       
        char crr[]={'A','b','C','d','E','f'};
     
        arr obj =new arr();

        obj.CountCapArr(crr);
        System.out.println();
        
    }
}