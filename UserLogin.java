import java.util.*;

public class UserLogin
{
    public static String userName;
    public static String userPassword;
    public static String msgLoginSuccess = "Login Successful...!"; // this works as a message box in .vb and .cs
    public static String msgLoginFail = "Login Failed..! Please Try Again..!"; // this works as a message box in .vb and .cs
    public static String msgInvalidInput = "Invalid Input..!"; // if it is empty or null
    public static Scanner readInput = new Scanner(System.in); // to avoid writing multiple scanner statements and avoid the error as scanner not closed in your IDE...

    public static void main(String[] userlogin)
    {
        System.out.println("Welcome, User\n\n");
        System.out.println("----------\nMain Menu\n1. Login\n2. Exit App\n----------\n\nSelection:\n");
        
        int userReply = readInput.nextInt();
        if(userReply==1)
        {
            loginCheck();
        }
        else if(userReply==2)
        {
            closeApp();
        }
        else
        {
            System.out.println(msgInvalidInput);
            System.out.println("----------\nApp Closed.\n----------");
            System.exit(0);
        }
    }

    public static void loginCheck()
    {
        System.out.println("Enter Your Username:\n");
        userName = readInput.next(); // scans the user input without spaces...
    
        System.out.println("Enter Your Password:\n");
        userPassword = readInput.next(); 
        
        /* we can add a regex or regular expressions to validate the password 
        -> whether the first letter is Capital
        -> whether they have 15-20 characters
        -> whether they have numbers and special characters used
        But, I'm keeping it plain and simple, you can explore regex and implement the same with this code as practice 
        */
        
        if((userName.equals("User1")) && (userPassword.equals("User1895#")))
        {
            System.out.println(msgLoginSuccess);
        }
        else if(!(userName.equals("User1") && userPassword.equals("User1895#")))
        {
            System.out.println(msgLoginFail);
        }
        else if(userName.equals("") && userPassword.equals(""))
        {
            System.out.println(msgInvalidInput+"\n");
            System.out.println("----------\nApp Closed.\n----------");
            System.exit(0); // Closes the App Explicitly
        }
    }
  
    public static void closeApp()
    {
        // Explaining the approach of Timer1.Start(), Timer1.Enabled = True in .vb or .cs here
        // Back-End Process what the computer reads, compiles and executes the final output and Front-End Process what the user experiences with the final output displayed
        // on the his/her computer screen.
        
        int timeCount; // Back-End Process
        
        System.out.println("\nApp Closing...\n\n"); // Front-End Process
        for(timeCount=5; timeCount<=5; timeCount--) // Back-End Process
        {
            if(timeCount==5) // Back-end Process
            {
                System.out.println("Closing App in "+timeCount+" Seconds.....\n"); // Front-End Process
            }

            if(timeCount==4) // Back-End Process
            {
                System.out.println("Closing App in "+timeCount+" Seconds....\n"); // Front-End Process
            }

            if(timeCount==3) // Back-End Process
            {
                System.out.println("Closing App in "+timeCount+" Seconds...\n"); // Front-End Process
            }

            if(timeCount==2) // Back-End Process
            {
                System.out.println("Closing App in "+timeCount+" Seconds..\n"); // Front-End Process
            }

            if(timeCount>0 && timeCount==1) // Back-End Process
            {
                System.out.println("Closing App in "+timeCount+" Seconds.\n"); // Front-End Process
            }

            if(timeCount==0) // Back-End Process
            {
                // Start of Front-End Process
                System.out.println("-----------");
                System.out.println("App Closed.");
                System.out.println("-----------");
                // End of Front-End Process
                System.exit(0); // Back-End Process
            }
        }
    }
}
