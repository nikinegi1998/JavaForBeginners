
package new_class;

class Fruits{
    int num;
    String color="Red";
    
    void count(){
        System.out.println("no. of fruits in a basket "+num+"\n");
    }
    
    String getColor(){
        return color; 
    }
}

class College{
    int roll_no, age;
    long phn;
    void calcMarks(int marks, String name){
        
        System.out.println("Name: \t" +name+"\nMarks: \t"+marks+"\n");
        
    }
    
    void personal_Details(int age, long phn){
        System.out.println("age: "+age+" \nphone no.: "+phn);
    }
}

public class New_class {

    public static void main(String[] args) {
        Fruits apple = new Fruits();
        apple.num=5;
        apple.count();
        System.out.println("color of the apple is "+apple.getColor());
        
        Fruits mango = new Fruits();
        mango.num=8;
        mango.count();
        
              
        
        College st1=new College();
        st1.personal_Details(19, 834545444);
        st1.calcMarks(81, "Neha");
        College st2=new College();
        st1.personal_Details(21, 884586885);
        st2.calcMarks(95, "Sam");
        
    }
    
}
