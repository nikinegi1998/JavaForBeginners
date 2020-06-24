
package access_specifier;

public class Access_specifier {

    public static void main(String[] args) {

        //----------we can't use the private members of the other classes------------
        
        
        Reservation ob = new Reservation();
        
        ob.amt = 562.46;
        ob.name = "Kylie";
        ob.personal_info();
        ob.ticket_bookings();       
        
    }
    
}
