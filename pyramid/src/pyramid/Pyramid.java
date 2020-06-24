package pyramid;

public class Pyramid {

    public static void main(String[] args) {
        
        int i, j, n=6;
        
        System.out.println("* pyramid :");
        for(i=1; i<n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print("  "); 
            }
            for(j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println(" \n");
        }              
        
        for(i=1; i<n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print("  "); 
            }
            for(j=1; j<=2*i-1; j++){
                if(j%2==0)
                    System.out.print("  ");
                else      
                    System.out.print("*  ");
            }
            System.out.println(" \n");
        }      

        
        char al='A';
        System.out.println("character pyramid :");
            for(i=1; i<n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print("  "); 
            }
            for(j=1; j<=2*i-1; j++){
                System.out.print(" "+al+" ");
            }
            System.out.println(" \n");
            ++al;
        }     
            
        al='A';
        for(i=1; i<n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print("  "); 
            }
            for(j=1; j<=2*i-1; j++){
                System.out.print(" "+al+" ");
                ++al;
            }
            System.out.println(" \n");
            
        }  
        
        
        for(i=1; i<n; i++){
            al='A';
            for(j=1; j<=n-i; j++){
                System.out.print("  "); 
            }
            for(j=1; j<=2*i-1; j++){
                if(j%2==0)
                    System.out.print(" ");
                else      
                    System.out.print(" "+al+" ");
                ++al;
            }
            System.out.println(" \n");
        }               
        
        for(i=1; i<n; i++){
            al='A';  
        for(j=1; j<=n-i; j++){
            System.out.print("  "); 
        }
            for(j=1; j<=i ;j++){
                System.out.print(al+" ");
                ++al;
            }                   
            System.out.print(" \n");
        }
                            
    }
    
}
