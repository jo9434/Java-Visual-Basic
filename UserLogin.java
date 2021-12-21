/*
This Code is Written by Joel Allan William on 21/12/2021 at 9:32 AM IST.
It can be used for references and understanding my logic, but please do avoid plagarising (copying it, removing my comments and saying that you have written it lol B) ) 
this written code.
And, if you want to understand this code try it yourself and work on it on your own and feel free to explore more on this basic written code...
And, I will be explaining the logic behind the Timers which we use in many programming languages like Java, VB. NET, C#... etc.. and also placing the screenshot for the
respective outputs.

VB.NET Code for Timers
in the other file will be writing this complete code to do and explain the same approach in .vb and .cs programs
so that you can know it is all the same but the way certain methods are generated are different..

Public Class UserLogin // UserLogin.vb or UserLogin.cs
  Private Sub CmdLogin_Load(sender As Object, e As EventArgs) Handles CmdLogin.Click
    Timer1.Start() // in the Java Code below we will explain what a Timer can do without using events and Timer in java
    back-end(computing calculations) and front-end(UI/UX Design in simple terms what the end user sees), 
  End Sub
End Class
*/

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
