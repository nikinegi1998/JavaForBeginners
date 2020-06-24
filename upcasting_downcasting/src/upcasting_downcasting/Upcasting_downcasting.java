
package upcasting_downcasting;

class Animals{
    Animals(){
        System.out.println("Animal Species");
    }
    public void examples(){
        System.out.println("E.g:    Rabbit, Dear, Lion, Elephant");
    }
}

class Aquatic extends Animals{
    Aquatic(){
        System.out.println("Aquatic species");
    }
    public void examples(){
        System.out.println("E.g:   Dolphins, Sharks, Snakes, Octupus");
    }
    public void info(){
        System.out.println("Lives in sea, ocean");
    }
    
}
public class Upcasting_downcasting {

    public static void main(String[] args) {
        
        Animals an = new Animals();
        an.examples();
        Aquatic aq = new Aquatic();
        aq.info();
        
        //upcasting
        Animals an2 = aq;
        an2.examples();                     //only inherited methods can be upcasted
       
        //downcasting
        Animals an3 = new Aquatic();
        Aquatic aq2 = (Aquatic) an3;
        aq2.examples();
        aq2.info();
    }
    
}
