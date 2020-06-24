
package palindrome;
import java.io.*;
import java.util.*;

public class Palindrome {


    public static void main(String[] args) {

                
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        int k= A.length();
        int n, count =0;
        
        //evaluating the length of the word............
        if(A.length()%2 ==0){
            n = A.length()/2;
        }
        else
            n= (A.length()/2)+1;
        
        
        //checking the condition for the palindrome............
        for(int i=0; i<n; i++){
            if(A.charAt(i)!=A.charAt(k-1)){
                count=1;
                break;
            }           
            k--;
        }
        
        //printing the result calculated.........
        if(count ==1){
            System.out.print("No");
        }
        else
            System.out.print("Yes");
        
        
    }
    
}
