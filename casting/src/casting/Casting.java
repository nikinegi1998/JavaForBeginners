
package casting;

public class Casting {

    public static void main(String[] args) {

        /*
        casting in numericals
        */
        int intno = 64;
        float floatno=53.55f;
        double doubleno = 548.48484;
        byte byteno = 12;
        long longno = 546464;
        short shortno = 4546;
        //casting of string variable is not possible
        String stringval = "n";              
        
        intno = (int)shortno;
        System.out.println("strong casting: "+ intno);
        
        doubleno = intno;
        System.out.println("without casting: "+ doubleno);
        
        intno = (int)floatno;
        System.out.println("float casting: "+ intno);
    }
    
}
