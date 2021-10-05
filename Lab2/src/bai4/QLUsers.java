
package bai4;

import java.util.ArrayList;

public class QLUsers implements UserInterface{
    private ArrayList<User> lst;
    public QLUsers(){
        lst = new ArrayList<>();
    }
    @Override
    public void insert(User u) {
        lst.add(u);
    }

    @Override
    public void delete(int viTri) {
       lst.remove(viTri);
    }

    @Override
    public void update(int viTri, User u) {
        lst.set(viTri, u);
    }

    @Override
    public void setList(ArrayList<User> lst) {
        this.lst = lst;
    }

    @Override
    public ArrayList<User> getList() {
       return lst;
    }
    
}
