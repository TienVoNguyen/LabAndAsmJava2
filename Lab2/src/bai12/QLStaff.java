
package bai12;

import java.util.ArrayList;

public class QLStaff implements StaffInterface{
    private ArrayList<Staff> lst;

    public QLStaff() {
        lst = new ArrayList<>();
    }

    @Override
    public void insert(Staff s) {
        lst.add(s); 
    }

    @Override
    public void update(int viTri, Staff s) {
        lst.set(viTri, s); 
    }

    @Override
    public void delete(int viTri) {
        lst.remove(viTri); 
    }

    @Override
    public ArrayList<Staff> getList() {
        return lst;
    }

    @Override
    public void setList(ArrayList<Staff> lst) {
        this.lst = lst; 
                }
    
}
