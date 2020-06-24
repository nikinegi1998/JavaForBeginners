package prog_003;

public class Loops {

    public static void main(String[] args) {
        int i=0, k=1, j=1;                                
        System.out.println("While loop :");
        while(i<7){                             
            System.out.println("day "+i);
            i++;
        }                                       
        
        System.out.println("\nFor loop :");    
        for(j=1; j<5; j++){
            System.out.println("season "+j);    
        }
        
        System.out.println("\nDo while loop :");
        do{
            System.out.println("episode "+k);
            k++;
        }while(k<13);
    }
    
}
