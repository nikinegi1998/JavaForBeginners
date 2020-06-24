
package college;

class Professor{
    
    public void lectures(){
        System.out.println("Lectures in progress.....");
    }
    
}

interface Students{
    public void func();

}

public class College {

    public static void main(String[] args) {
                            
        /*
        * .........anonymous class for interfaces and classes..............
        * we can create a new function or can override the existing function
        * in the anonymous class created
        */
        
        Professor p = new Professor(){
            @Override
            public void lectures(){
                System.out.println("Informative and interactive session.....");
            }
        };
        
        Students st = new Students() {
            @Override            
            public void func() {
                System.out.println("Students attending the lectures......");
            }
        };
        st.func();
        
        //here the lectures method from the anonymous class will be implemented 
        //this method is overriden by this class.........
        p.lectures();
    }
    
}
