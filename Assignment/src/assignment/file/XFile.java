package assignment.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class XFile {

    public static void write(String path, Object object) throws Exception {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(object);
        fos.close();
        oos.close();
    }

    public static Object read(String path) throws Exception {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object object = ois.readObject();
        fis.close();
        ois.close();
        return object;

    }
}
