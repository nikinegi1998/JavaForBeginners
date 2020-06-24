package serialize_deserialize;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Deserialize {
   
    /**
     *
     * @param args
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {

        System.out.println("Deserialization");
        
        try(ObjectInputStream oi = new ObjectInputStream( new FileInputStream("Language.bin"));){
            
            Language ob1= (Language)oi.readObject();
            Language ob2 = (Language)oi.readObject();
            
            System.out.println(ob1);
            System.out.println(ob2);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Deserialize.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
