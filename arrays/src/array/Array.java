
package array;

import java.util.Scanner;

/**
 *
 * @author shubham
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[];
        int n;
        int i;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        n=input.nextInt();
        arr =new int[n];
        System.out.println("Enter the elements of array: ");
        for(i=0; i<arr.length; i++){
           
            arr[i]=input.nextInt();
        }
        System.out.println("The elements are: ");
        for(i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    
         
        
        String str[];
        System.out.println("Enter the number of words in array: ");
        n=input.nextInt();
        str =new String[n];
        System.out.println("Enter the elements of array: ");
        for(i=0; i<str.length; i++){
           
            str[i]=input.nextLine();
        }
        for(i=0; i<str.length; i++){
        System.out.println("The elements are: "+str[i]);
        }
        //System.out.println(str[0]);
        
    }
    
}
