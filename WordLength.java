/*
Accept String from user and display each word with its length
*/

class WordCount
{
    public void countLength(String str)
    {
        String arr[] =str.split("\\s");

        for(String s :arr)
        {
            System.out.println(s+"->"+s.length());
        }
    }
}

class WordLength
{
    public static void main(String[] args) {
        String str="Rigved janak Kshitija shravani amaira";
        WordCount wobj = new WordCount();
        wobj.countLength(str);
    }
}