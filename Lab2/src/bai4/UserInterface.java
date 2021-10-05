
package bai4;

import java.util.ArrayList;

public interface UserInterface {
    
    public void insert(User u);
    
    public void delete(int viTri);
    
    public void update(int viTri, User u);
    
    public void setList(ArrayList<User> lst);
    
    public ArrayList<User> getList();
}
