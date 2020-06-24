
package encapsulation;

class Output{
    
    static final int rno=5;
    String name;
    
    public void setDetails(){
        
        System.out.println("Name "+getName("Dhiren") + "\nRoll No. "+getRollno(57));
                        
    }
    
    private String getName(String n){        
        return n;
    }
    
    private int getRollno(int r){        
        return rno;
    }
    
}

public class Encapsulation {

    public static void main(String[] args) {

        Output ob= new Output();
        ob.setDetails();
    }
    
}
