
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
//import java.util.List;

public class autoveloxJava {

    public static void main(String[] args) {
        //definsco gli oggetti
        //scrive un oggetto in formato XML
        try {
            XMLEncoder e = new XMLEncoder(
                 new BufferedOutputStream(
                     new FileOutputStream("TestOne.xml")
                 )
            );
             e.writeObject(al);
             e.close();
        }
        catch (Exception e) {
            System.out.println("Errore");
        }
        //lettura da XML in oggetto
        try {
            XMLDecoder d = new XMLDecoder(
                new BufferedInputStream(
                    new FileInputStream("TestOne.xml")
                )
            );
             alr =(ArrayList<ModelOne>) d.readObject();
            d.close();
        }
        catch (Exception e) {
            System.out.println("errore");
        }
        //stampa Arraylist
        for(ModelOne str:alr)  
            System.out.println(str);  
         
        
        }
}
