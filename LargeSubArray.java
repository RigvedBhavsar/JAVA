/*Accept N numbers from user and find out the largest sun array which is sorted(increasing).
we have to display starting index of the sub array , ending index of the sub array , elements of the sub Array,
size of the SUb array.
*/

import java.util.*;

class ArrSub
{
    public void MaxSubArray(int Arr[])
    {
        int iStart=0;
        int iEnd=0;
        int iMax=0;
        int iMin =0;
        int i=0;

        for(i=0;i<Arr.length-1;i++)
        {
            //For the First Time we Will Enter here
            if(Arr[i]<=Arr[i+1])
            {
                if(iStart==0 && iEnd==0)
                {
                    iStart=i;
                }
                iEnd=i+1;
            }
            else
            {
                if((iMax-iMin)<(iEnd-iStart))   //Comapring the length
                {
                    iMin = iStart;              //Assigning the Start
                    iMax = iEnd;                //Assigning the End
                }
                iStart=0;
                iEnd=0;
            }
        }

        if((iMin==0) && (iMax==0))
        {
            System.out.println("There is No such range");
            return;
        }

        System.out.println("Lengthof the Maximum SubArray is"+ ((iMax-iMin+1)));

        System.out.println("Array is:\n");
        for(i=iMin ; i<=iMax ; i++)
        {
            System.out.print(Arr[i]+"\t");
        }
    }
}
class LargeSubArray
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Size of the Array");
        int iSize = sobj.nextInt();

        int Arr[] = new int [iSize];

        System.out.println("Enter the Elements of the Array");
        for(int i=0;i<Arr.length; i++)
        {
            Arr[i]=sobj.nextInt();
        }

        System.out.println("Array is:");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+"  ");
        }
        System.out.println();

        ArrSub aobj = new ArrSub();
        aobj.MaxSubArray(Arr);
    }
}