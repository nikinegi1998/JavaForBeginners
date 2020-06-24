package user_input;
import java.util.Scanner;

public class User_input {

    public static void main(String[] args) {
        
        //creating object of Scanner class
        Scanner input= new Scanner(System.in);
        
        System.out.println("---------------Your bank details----------------- ");
        
        System.out.println("Enter you name: ");
        String txt=input.nextLine();                    //taking input           
        
        System.out.println("enter the account no.: ");
        long num=input.nextLong();                      //taking input
        
        System.out.println("enter the amount: ");
        long amt=input.nextLong();                   //taking input
                
        System.out.println("\n\nName: "+txt);
        System.out.println("Account no.: "+num);
        System.out.println("Balance: "+amt);
    }
    
}
