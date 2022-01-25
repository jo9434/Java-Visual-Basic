/*
Objective: WAP to create a Simple Calculator Application using Switch Case Statements.
*/
import java.util.*;

public class simple_cal
{
    static  Scanner read = new Scanner(System.in);
    static int result=0;
    
    public static void main(String[] args)
    {
        int a = read.nextInt();
        int b = read.nextInt();
        
        System.out.println("Select Option\n 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n\nSelection::");
        int choice = read.nextInt();
        switch(choice)
        {
            case 1: // Addition
                    addNum(a,b);
                    System.out.println(result);
                    break;

            case 2: // Subtraction
                    subNum(a, b);
                    System.out.println(result);
                    break;

            case 3: // Multiplication
                    mulNum(a,b);
                    System.out.println(result);
                    break;

            case 4: // Division
                    divNum(a,b);
                    System.out.println(result);
                    break;

            default:
                    // Invalid
                    System.out.println("Invalid Choice!");
                    break;
        }
    }

    public static int addNum(int a, int b)
    {
        result = a+b;
        return result;
    }

    public static int subNum(int a, int b)
    {
        result = a-b;
        return result;
    }

    public static int mulNum(int a, int b)
    {
        result = a*b;
        return result;
    }

    public static double divNum(int a, int b)
    {
        try {
            if(a == 0 || b == 0)
            {
                result = a/b;
            }
        }
        catch(Exception e)
        {
            System.out.println("Cannot Divide by Zero");
        }
        return result;
    }
}
