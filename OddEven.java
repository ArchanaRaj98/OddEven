import java.util.*;
import java.io.*;
class EvenOdd 
{
public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
    if(num>0)
    {
        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    else
        System.out.println("Invalid");
}
}
