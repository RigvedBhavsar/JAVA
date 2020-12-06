/*
Acccept String From user and display such character which occuers maximum  no of time 
*/
import java.util.*;

class Hashmapmax
{
    public void max(final String str)
    {
        final char arr[] = str.toCharArray();
        char key;
        char ch='\0';
        int oldvalue , max=0 , value;

        HashMap<Character , Integer> hm = new HashMap<Character,Integer>();

        for(int i=0; i<arr.length;i++)
        {
            if(!Character.isWhitespace(arr[i]))//jar White space nasen trr
            {
                if(hm.containsKey(arr[i])) // jar already asen trr
                {
                    oldvalue= hm.get(arr[i]);
                    hm.put(arr[i], oldvalue+1);
                }
                else
                {
                    hm.put(arr[i], 1);
                }
            }
        }

        for(final Map.Entry<Character, Integer> pair : hm.entrySet())
        {
            key = pair.getKey();
            value = pair.getValue();

            if(value > max)
            {
                max = value;
                ch = key;
            }
        }
        System.out.println("Maximum tme occured chater is" +ch + "->" +max);
    }
}


class HashMap2
{
    public static void main(final String[] args) {
        
        final String str ="marvellous Infosystems";

        final Hashmapmax hm = new Hashmapmax();
        hm.max(str);

    }
}