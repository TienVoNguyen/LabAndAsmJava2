
package bai12;

import java.util.ArrayList;


public interface StaffInterface {
    public void insert(Staff s);
    
    public void update(int viTri, Staff s);
    
    public void delete(int viTri);
    
    public ArrayList<Staff> getList();
    
    public void setList( ArrayList<Staff> lst);
}
