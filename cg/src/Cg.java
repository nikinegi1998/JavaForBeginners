

import java.io.*;
import java.util.*;
public class Cg {
    public static void main(String args[] ) throws Exception {

        
        //.................code gladiators questionnare...................//
    	int n, i, j, count= 0, er=0;
        int need[], avail[];

        Scanner s = new Scanner(System.in);
        n =s.nextInt();
        need = new int[n];
        avail = new int[n];

        for(i=0; i<n; i++){
            need[i]= s.nextInt();
        }

        for(i=0; i<n; i++){
            avail[i]= s.nextInt();
        }

        while (er==0){
            for(i=0; i<n; i++){
                avail[i] = avail[i] - need[i];            
            }
            count++;
            for(j=0; j<n; j++){
                if (avail[j] >= need[j])
                    continue;
                
                else 
                    er++;            
            }       
        }

        System.out.println(count);
        
   }
}