
package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        
        Company ob= new Company();
        ob.round1();
        ob.round2();
        ob.round3();
        System.out.println("");
        
        
        Google applicant1= new Google();            //child class of class Company
        applicant1.round3();                    
        System.out.println("");
        
        
        Microsoft applicant2= new Microsoft();      //child class of class Google
        applicant2.round3();
        System.out.println("");
    }
    
}
