
package interfaces;

public class Yoga implements Breathing, Meditation {

    Yoga(){
        System.out.println("This is yoga constructor. ");
    }
    @Override
    public void out() {
        System.out.println("A yoga move! "+ inp);
        
    }
    
    @Override
    public void show() {
        System.out.println("A yoga move! "+ input);
        
    }
}
