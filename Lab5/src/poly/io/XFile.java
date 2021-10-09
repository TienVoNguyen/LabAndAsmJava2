
package poly.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class XFile {
    public static byte[] read(String path){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            int n = fis.available();
            byte[] data = new byte[n];
            fis.read(data);
            fis.close();
            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally{
            try {
                
                if (fis != null){
                    fis.close();
                }
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
    }
    
    public static void write(String path, byte[] data){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(path);
            
            fos.write(data);
            fos.close();
        }catch(FileNotFoundException e){
            
            e.printStackTrace();
            
        } catch (Exception e) {
            throw new RuntimeException();
        } finally{
            try {
                
                if (fos != null) {
                fos.close();
                }
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
    }
    
    public static Object readObject(String path){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Object object = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            object = ois.readObject();
            return object;        
        }catch(FileNotFoundException e){
            
            e.printStackTrace();
            
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(ois != null) { 
                    ois.close();
                }
                if (fis != null){
                    fis.close();
                }
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
        return object;
    }
    
    public static void writeObject(String path, Object object){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(object);
                      
        }catch (Exception e) {
            
            e.printStackTrace();
        }finally{
            try {
                if (oos != null){
                oos.close();
                }
                if (fos != null) {
                fos.close();
                }
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
        
        
    }
}
