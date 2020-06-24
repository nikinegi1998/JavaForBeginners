
package access_specifier;


public class Reservation {

    /*
    * public: accessible anywhere in the program
    * private: accessible inside the class only
    * protected: accessible anywhere in the same package and the same class
    */
        
    public String name, from ="Coimbatore", to = "Switzerland";
    private int ticket_no;
    protected double amt;
    
    Reservation(){
        this.name = "Joey";
        ticket_no = 189;
        amt = 562.89;
    }
    
    protected void personal_info(){
        System.out.println("passenger: "+name+  "\nfrom: "+from+"\nto: "+to);
    }
    
    public void ticket_bookings(){
        System.out.println("\nticket no.: "+ticket_no);
    
        System.out.println("Payment: "+amt);
    }
}
