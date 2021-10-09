/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.List;
import poly.io.XFile;

/**
 *
 * @author Dinh Van
 */
public class XFileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        byte[] data = XFile.read("c:/temp/a.gif");
//        XFile.write("c:/temp/b.gif",data);
        List<Student> list = new ArrayList<>();
        
        list.add(new Student("Tuan", 5, "CNTT"));
        list.add(new Student("Cuong", 7.5, "TKTW"));
        list.add(new Student("Hanh", 8.5, "CNTT"));
        
        XFile.writeObject("c:/temp/students.dat", list);
        
        List<Student> list2 = (List<Student>) XFile.readObject("c:/temp/students.dat");
        for (Student sv : list) {
            System.out.println(">Ho va ten: "+sv.getName());
        }
    }
    
}
