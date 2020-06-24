
package color;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Color {

    public static void main(String[] args) throws FileNotFoundException{
        
        String txtfile = "C:\\Users\\nikita\\OneDrive\\Desktop\\Java_for_beginners\\my_colors.txt";
        //String txtfile = "my_colors.txt";
        File file = new File(txtfile);
        
        Scanner inp = new Scanner(file);
        
        int num = inp.nextInt();
        System.out.println("integer value: "+num);
        
        //For reading the string items.....
        System.out.println("Items in colors file:");
        int count =1;
        while(inp.hasNextLine()){
            String input = inp.nextLine();
            System.out.println(count+" "+input);
            count++;
        }
        
        inp.close();   
        
        
        
        //-----------------------buffered class reader--------------------------
        File f2 = new File("C:\\Users\\nikita\\OneDrive\\Desktop\\Java_for_beginners\\my_colors.txt");
        
                       
        FileReader fr = new FileReader(f2);
        BufferedReader br = new BufferedReader(fr);
        
        /*
            BufferedReader br = new BufferedReader(new FileReader(f2));
        we can use this instead of creating the object of FileReader to
        reduce the memory space.....
        */
        
        String sentence;
        
        count=0;
        try {
            while((sentence= br.readLine())!= null){
                System.out.println(count+ " "+sentence);
                count++;
            }
        } catch (IOException ex) {
            System.out.println("content of File not found" +f2.toString());
        }
        finally{
            System.out.println("This final block will be executed in any case");
        }       
        
        
        
        //------------learn how to write in the file----------------------
        File f3 = new File("C:\\Users\\nikita\\OneDrive\\Desktop\\Java_for_beginners//create.txt");
        try {
            BufferedWriter br2 =new BufferedWriter (new FileWriter(f3));
            br2.write("This is my 1st priority");
            br2.write("This is my 2nd priority");
            br2.newLine();          //enters to the new line 
            br2.write("This is my 3rd priority");
            
            br2.close();
            
        } catch (IOException ex) {
            System.out.println("File not found");
        }
        
        
        
    }
        
}
