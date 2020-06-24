
package inheritance;

/**
 *
 * @author nikita
 */
public class Microsoft extends Google{
    
    @Override
    public void round3(){
        System.out.println(" Conducting interview in Microsoft.");
    }
    
    Microsoft(){
        System.out.println(" Microsoft Constructor running!!!!");
    }   
}
