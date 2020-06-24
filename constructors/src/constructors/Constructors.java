package constructors;

class Courses{
    String C_name, tutor;
    int lectures, stud;
    
    Courses(){                                      //default constructor
       
        C_name= "java";
        lectures= 53;   
        System.out.println("Default Constructor called");
        System.out.println("course name "+C_name+ ", no. of lectures "+lectures);
    }
    
    Courses(String tutor, int student){            //parameterized constructor
        this.stud= student;
        this.tutor= tutor;
        System.out.println("Parameterized Constructor called");
        System.out.println("no. of students "+stud);
        System.out.println("name of tutor "+tutor);
    }
}
public class Constructors {

    public static void main(String[] args) {
        //constructor called as soon as the object is defined
        Courses java= new Courses();    
                
        //Parameterized constructor called
        Courses python= new Courses("Sneha",2595); 
        
        //atutomatic constructor called without making the object
        new Courses();                   
        
    }
       
}