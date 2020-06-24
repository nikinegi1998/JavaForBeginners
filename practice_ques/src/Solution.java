import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		// Write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp, even = 0, odd= 0;
        
        while(n%10 ==0){
            
            temp= n%10;
            if(temp%2 ==0){
                even += temp;  
            }
            else{
                odd += temp;
            }
            n/=10;         	            
        }           
        System.out.println(even + " " + odd);   
        sc.close();
	}
}