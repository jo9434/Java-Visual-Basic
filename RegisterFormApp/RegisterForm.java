/*
Objective: WAP to make Register Form App to take inputs from user and store it in appropriate files
logindetails.txt and registerform.txt using appropriate methods with try with resources or normal try and catch block.
*/

package RegisterFormApp;

import java.util.*;
import java.io.*;

public class RegisterForm
{
    static Scanner read = new Scanner(System.in);
    static String fullname;
    static int age;
    static String email;
    static String phoneNo;
    static String gender;
    static String OTP;
    static String username;
    static String password;

    public static void main(String[] args) throws FileNotFoundException
    {
        RegisterForm.registerForm();
    }

    public static void registerForm() throws FileNotFoundException
    {
        System.out.println("\nEnter your Full Name:");
        fullname = read.nextLine();

        System.out.println("\nEnter your Age:");
        age = read.nextInt();

        if(age>=18)
        {
            System.out.println("\n"+fullname+" is eligible to Register!\n");

            System.out.println("Enter your Username:");
            username = read.next();

            System.out.println("\nEnter your Password:");
            password = read.next();

            System.out.println("\nEnter your Gender:");
            gender = read.next();

            System.out.println("\nEnter your Email ID:");
            email = read.next();

            System.out.println("\nEnter your Phone No:"); // 10 digit Mobile No
            phoneNo = read.next();

            System.out.println();
            String value = generateOTP();
            System.out.println("Here is Your OTP: "+value+"\n\n");

            System.out.println("Enter the OTP:");
            OTP = read.next();

            if(OTP.equals(value))
            {
                RegisterForm.writeFile(); // if the otp matches, the values are stored else the app is closed... 
            }
            else if(!OTP.equals(value))
            {
                System.out.println("App Closed.");
                System.exit(0);
            }
        }
        else if(age<18)
        {
            System.out.println(fullname+" is not eligible to Register!\nPlease Try Again Later!\n\n");
            System.out.println("App Closed.");
            System.exit(0);
        }
    }

    public static String generateOTP()
    {
        int m=10;
        String result = "";

        String otp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "123456789";
        StringBuilder genOTP = new StringBuilder(m);

        for(int i=0; i<m; i++)
        {
            int index = (int)(otp.length() * Math.random());
	        genOTP.append(otp.charAt(index));
	        result = genOTP.toString();
        }
        return result;
    }

    public static void writeFile() throws FileNotFoundException
    {
        String filename1 = "RegisterFormApp/registerform.txt";
        String filename2 = "RegisterFormApp/logindetails.txt";
        // Try with Resources doesn't need a close() method for bufferedwriter or bufferedreader;
        try(BufferedWriter bw1 = new BufferedWriter(new FileWriter(filename1)))
        {
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(filename2));
            BufferedReader br1 = new BufferedReader(new FileReader(filename1));
            BufferedReader br2 = new BufferedReader(new FileReader(filename2));
            
            if(br1.readLine() == null && br2.readLine() == null)
            {
                bw1.write(fullname+",");
                bw1.write(age+",");
                bw1.write(gender+",");
                bw1.write(email+",");
                bw1.write(phoneNo);
                bw2.write(username+",");
                bw2.write(password);
            }
            bw2.close();
            br1.close();
            br2.close();
        }
        catch(IOException e)
        {
            //@TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
