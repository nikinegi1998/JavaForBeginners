
package lexicographical_order;
import java.util.Scanner;

public class Lexicographical_order {

       
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        
        //finds the smallest and the largest substring of length k according 
        // to the lexicographical order...
        
        String string = s.substring(0, k); 
        smallest = string;
        largest = string;
        
        for (int i = k; i < s.length(); i++) { 
            string = string.substring(1, k) + s.charAt(i); 
            if (largest.compareTo(string) < 0)      
                 largest = string; 
            if (smallest.compareTo(string) > 0) 
                 smallest = string;             
        } 
        
        
        //unsucessful trials
        /*
        String[] st = new String[s.length() - k + 1];

        for(int i =0; i<(s.length() -k); i++){
            String string = s.substring(i, i+k);
            st[i] = string;
        }
        
        
        smallest = st[0];
        largest = st[0];
        for(int i = 1; i < st.length-3; i++) {
            String string = st[i];
            if (smallest == null || string.compareTo(smallest) < 0) {
                smallest = string;
            }

            if (largest == null || string.compareTo(largest) > 0){
                largest = string;
            }
        }*/
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    
    }
    
}
