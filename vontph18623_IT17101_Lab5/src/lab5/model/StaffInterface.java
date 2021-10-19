
package lab5.model;

import java.util.List;

public interface StaffInterface {
    
    public void insert(Staff s);
    
    public void update(int viTri, Staff s);
    
    public void delete(int viTri);
    
    public void setStaffList(List<Staff> list);
    
    public List<Staff> getStaffList();
}
