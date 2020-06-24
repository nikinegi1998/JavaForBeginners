package control_statements;
import java.util.Scanner;

public class Control_statements {

    public static void main(String[] args) {
        
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.println("i love you");
        System.out.println("your favorite ice cream flavor: ");
        String fla= input.nextLine();
        
        switch(fla){
            case "vanilla":
                System.out.println("you are sweet");
                    break;
            case "strawberry": 
                System.out.println("yukkk "); 
                    break;
            case "chocolate":
                System.out.println("love cutiee");
                    break;
            case "butterscotch":
                System.out.println("i love you");
                    break;
          
            default: 
                System.out.println("are u an alien?");
                    break;
            
        }

        System.out.println("enter your age: ");
        int age= input.nextInt();     
        if(age<18){
            System.out.println("not eligible for voting ");
        }
        else{
            System.out.println("Welcome! you are eligible for voting ");
        }     
        
        
                
       
        
        
    }
    
}
