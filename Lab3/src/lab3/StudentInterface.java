package lab3;

import java.util.List;

public interface StudentInterface {

    public void insert(Student s);

    public void delete(int viTri);

    public void update(int viTri, Student s);

    public List<Student> getList();

    public void setList(List<Student> list);

    public List<Student> sortList(String chon);
}
