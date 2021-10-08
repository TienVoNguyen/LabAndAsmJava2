package lab3;

import java.util.List;

public interface StudentInterface<E>{

    public void insert(E t);

    public void delete(int viTri);

    public void update(int viTri, Student s);

    public List<Student> getList();

    public void setList(List<E> list);

    public List<Student> sortList(String chon);
}
