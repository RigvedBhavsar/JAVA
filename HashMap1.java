/*Accept the String frm user and calculate the frquency of each character from htat string.

We convert String into charater array and after that we form a hashmap which conatins key
as character and frequency as a value
*/

import java.util.*;
import java.io.*;

class HashMapDemo
{
    public void charFreq(String str)
    {
        char arr[]=str.toCharArray();

        Map<Character,Integer> hm = new HashMap<Character,Integer>();

        for(Character ch : arr)
        {
            if(! Character.isWhitespace(ch))    //jar white space nasen tar
            {
                if(hm.containsKey(ch))      //jar aadhdi pasun entry asen trr
                {
                    int oldvalue=hm.get(ch);    //juni value retrive krun ghteli
                    hm.put(ch, oldvalue+1);     // juni value ekane increment keli
                }
                else    //new entry asen trr
                {
                    hm.put(ch,1);   //frsh key->value add kela
                }
            }
        }

        Set<Character>keys =hm.keySet();    //Hasmap la Set madhe convert kela
        
        for(Character ch  : keys)       //keys hya set madhun ek ek charater travel
        {
            System.out.println(ch+"->"+hm.get(ch));
        }
    }
}

class HashMap1
{
    public static void main(String[] args) {
        
        String str = "Rigved";
        HashMapDemo hm =  new HashMapDemo();

        hm.charFreq(str);
    }
}