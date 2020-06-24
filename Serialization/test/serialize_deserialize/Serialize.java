package serialize_deserialize;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Serialize {


    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        
        System.out.println("Serialization");

        
        Language ob1 =  new Language(101,"Sanskrit");
        Language ob2 =  new Language(102,"English");
        
        System.out.println(ob1);
        System.out.println(ob2);
        
        
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Language.bin"));){
        //this is done to avoid closing of the objectoutputstream    
            
            os.writeObject(ob1);
            os.writeObject(ob2);
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        
    }
    
}
