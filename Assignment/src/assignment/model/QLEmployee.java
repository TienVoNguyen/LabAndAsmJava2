package assignment.model;

import assignment.file.XFile;
import java.util.ArrayList;
import java.util.List;

public class QLEmployee implements EmployeeInterface<Employee> {
    List<Employee> lst;

    public QLEmployee() {
        lst = new ArrayList<>();
    }

    @Override
    public int save(Employee e) {
        int position = findById(e.getId());
        if (position < 0) {
            lst.add(e);
        } else {
            lst.set(position, e);
        }
        return position;
    }

    @Override
    public int delete(String id) {
        int position = -1;
        for (int i = 0; i < lst.size(); i++) {
            Employee e = lst.get(i);
            if (e.getId().equalsIgnoreCase(id)) {
                lst.remove(i);
                position = i;
                break;
            }
        }
        return position;
    }

    @Override
    public int findById(String id) {
        int position = -1;
        for (int i = 0; i < lst.size(); i++) {
            Employee e = lst.get(i);
            if (e.getId().equalsIgnoreCase(id)) {
                position = i;
                break;
            }
        }
        return position;
    }

    @Override
    public List<Employee> getEmployeeList() {
        return lst;
    }

    @Override
    public Employee getEmployeeByPosition(int index) throws Exception {
        if (index < 0) {
            return null;
        }
        return lst.get(index);
    }

    @Override
    public List<Employee> openFile() throws Exception {
        lst = new ArrayList<>((List<Employee>) XFile.read("employee.dat"));        
        return lst;
    }

    @Override
    public void saveFile() throws Exception {
        XFile.write("employee.dat", lst);
    }

    @Override
    public int countEmployee() {
        return lst.size();
    }

}
