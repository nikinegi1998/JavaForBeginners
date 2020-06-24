package serialize_deserialize;

import java.io.Serializable;

public class Language implements Serializable{
    
    /*
    ============================================================
      if you don't want to serialize a particular variable,    
        you should make it as static                           
                                                               
      if you don't want to make it static too then use keyword 
        transient to avoid serializing                         
    ============================================================
    */
    
    private final int id;
    private final String name;
    
    Language(int id, String name){
        //while deserializing the object the constructor is not called
        System.out.println("Constructor of class Language");
        this.id = id;
        this.name = name;
    }
        
    @Override
    public String toString(){
        return "Language id: " + id + " \nLanguage Name: " +name;
    }
    
    //Serialization is conversion of object into byte code
    //It is done to persist the state of an  object
    //Dseserialization is conversion of byte code into object
}
