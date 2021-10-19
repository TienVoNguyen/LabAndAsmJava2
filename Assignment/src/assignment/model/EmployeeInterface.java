
package assignment.model;

import java.util.List;

public interface EmployeeInterface<T> {
    
    public int save(T e);
    
    public int delete(String id);
    
    public int findById(String id);
    
    public List<T> getEmployeeList();
    
    public T getEmployeeByPosition (int index)throws Exception;
    
    List<T> openFile() throws Exception;
    
    public void saveFile() throws Exception;
    
    public int countEmployee();
    
    public void setEmployeeList (List<T> lst);
}
