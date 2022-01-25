/*

Objective: WAP to create a Simple Calculator Application using Switch Case Statements to perform operations of addition, subtraction, multiplication and division.

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
        
        System.out.println("\nSelect Option\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5.Exit\n\nSelection::");
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
                
            case 5: //Exit App
                    System.out.println("App Closed");
                    System.exit(0); // Syntax => System.exit(status);

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
