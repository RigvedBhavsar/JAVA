import java.util.*;
class arr
{
    public void Marks(float arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<35)
            {
                System.out.println(arr[i]+"-\t FAIL");
            }
            else if((arr[i]>=35) && (arr[i]<50))
            {
                System.out.println(arr[i]+"-\t PASS CLASS");
            }
            else if((arr[i]>=50)&&(arr[i]<60))
            {
                System.err.println(arr[i]+"-\t SECOND CLASS");
            }
            else if ((arr[i]>=60) && (arr[i]<70))
            {
                System.err.println(arr[i]+"-\t FIRST CLASS");
            }
            else if(arr[i]>=70 && (arr[i]<=100))
            {
                System.err.println(arr[i]+"-\t DISTICTION");
            }
            else
            {
                System.err.println(arr[i]+"-\t ULTRA LEGEND");
            }
        }
    }
}

class ArrayMarks
{
    public static void main(String args[])
    {
       
        float frr[]={67.3f,45.8f,88.9f,77.5f,55.2f,101f};
        
        arr obj =new arr();
      
        System.out.println();
        obj.Marks(frr);
     
    }
}