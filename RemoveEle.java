import java.util.Scanner;
/*Accept Array and one element form the user and remove that element from that array
*/
class ArrayEle
{
    public void Remove(int Arr[] , int ele)
    {
        int iCount =0;
        for(int i=0 ; i<Arr.length ; i++)
        {
            if(Arr[i]==ele)
            {
                for(int j=i ; j<Arr.length-1 ; j++)
                {
                    Arr[j]=Arr[j+1];
                }
                iCount++;
            }
        }
        if(iCount==0)
        {
            System.out.println("NO SUCH ELEMENT FOUND");
        }
        else 
        {
            System.out.println("New Arrray is");
            for(int i=0;i<Arr.length-1;i++)
            {
                System.out.print(Arr[i]+"\t");
            }
        }
   }
}

class RemoveEle
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of the Array");
        int iSize = sobj.nextInt();

        int Arr[]= new int[iSize];

        System.out.println("Enter the element of the Array");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }

        System.out.println("Enter the element to be remove");
        int ele = sobj.nextInt();

        ArrayEle aobj = new ArrayEle();
        aobj.Remove(Arr, ele);
    }
}
