
package assignment.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XFile {
    public static void write (String path, Object object){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(object);
            
        } catch(FileNotFoundException e){
            
            e.printStackTrace();
            
        }catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            
            e.printStackTrace();
        } finally {
            try {
                if(fos != null){
                    fos.close();
                }
                if(oos != null){
                    oos.close();
                }
            }catch (IOException ex) {
                    ex.printStackTrace();                           
                }
        }
    }
    
    public static Object read(String path){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Object object = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);            
            object = ois.readObject();
            return object;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           try {
               if (fis != null){
                    fis.close();
               }
               if (ois != null) {
                    ois.close();
               }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return object;
    }
}
