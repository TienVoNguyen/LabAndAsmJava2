
package lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapDemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Student> map = new HashMap<String, Student>();
        Student sv1 = new Student();
        sv1.name="Tuan";
        sv1.major="CNTT";
        sv1.marks=9.8;
        map.put(sv1.name, sv1);
        Set<String> keys = map.keySet();
        for (String name : keys) {
            Student sv = map.get(name);
            System.out.println(">Họ và tên:"+sv.getName());
            System.out.println(">Học lực:"+sv.getGrade());
        }
        
        
    }
    
}
