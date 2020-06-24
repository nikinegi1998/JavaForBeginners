
package arrays;

import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {
            
        Scanner ob= new Scanner(System.in);
        
        int[] num;
        int n,i,j;
        System.out.println("enter the no. of students: ");            
        n= ob.nextInt();
        num = new int[n];
          
        /*System.out.println("before assigning value ");            
        for(i=0; i<n; i++){
            System.out.println(num[i]);            
        } */    
        
        //1 dimensional array
        System.out.println("enter the roll no.: ");            
        for(i=0; i<n; i++){
            num[i]= ob.nextInt();
        }                    
        
        //array of strings
        String[] stud;
        stud = new String[n];
        System.out.println("enter the name: ");            
        for(i=0; i<n; i++){
            stud[i]= ob.nextLine();
        } 
        
        System.out.println("details of students: "); 
        System.out.println("Name \t Roll no."); 
        for(i=0; i<n; i++){
            System.out.println(stud[i]+ " \t " +num[i]);               
        }
        
        
        //multi-dimensional array
        int[][] matrix;
        int r, c;
        System.out.println("Enter the no. of rows: ");
        r= ob.nextInt();
        System.out.println("Enter the no. of columns: ");
        c= ob.nextInt();
        matrix= new int[r][c];
        
        System.out.println("Enter the elements of a matrix: ");
        for(i=0; i<r; i++){
            for(j=0; j<c; j++)
                matrix[i][j]= ob.nextInt();
        }
        
        System.out.println("Your matrix: ");
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();            
                    
        }
        
    }
    
}
