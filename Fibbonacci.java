import java.util.Scanner;

class Fibo
{
    public void Display(int Number)
    {
        int First =0;
        int Second =1;
        int Third =0;

        if(Number < 0)
        {
            Number = -Number;
        }

        for(int i=1 ; i<Number;i++)
        {
            System.out.println(First);
            Third=First+Second;
            First=Second;
            Second=Third;
        }
    }
}

class Fibbonacci
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);    
        System.out.println("Enter the Numner");
        int Number = sobj.nextInt();

        Fibo fobj = new Fibo();
        fobj.Display(Number);
    }
}