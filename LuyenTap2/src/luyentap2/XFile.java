
package luyentap2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Dinh Van
 */
public class XFile {
    public static void ghiFile(String path, Object object) throws Exception{
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(object);
        oos.close();
        fos.close();
    }
    
    public static Object docFile(String path) throws Exception{
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Object object = ois.readObject();
        fis.close();
        ois.close();
        return object;
    }
}
