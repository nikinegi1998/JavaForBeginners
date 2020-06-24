package half_pyramid;

public class Half_pyramid {

    public static void main(String[] args) {
        int i, j, k, n=6;
        
        for(i=1; i<n; i++){
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" \n");
        }
        
                     
        
        for(i=1; i<n; i++){
                
        for(j=1; j<=n-i; j++){
            System.out.print("  "); 
        }
            for(k=1; k<=i ;k++){
                System.out.print("* ");
            }                   
            System.out.print(" \n");
        }
                      
    }
    
}
