
package hackerrank_string;
import java.io.*;
import java.util.*;

public class Hackerrank_string {


    public static void main(String[] args) {

       
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        //calculating the sum of string length
        int sum = A.length()+ B.length();
        System.out.println(sum);

        //comparing the strings and can be used to arrange alphabetically
        if(A.compareTo(B)>0)
            System.out.println("Yes");
        else
            System.out.println("No");

        //capitalizing the 1st letter of the string 
        //substring(start, end);
        String output1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String output2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        //B.substring(0).toUpperCase();
        System.out.println(output1 + " " + output2);
   
    }
    
}
