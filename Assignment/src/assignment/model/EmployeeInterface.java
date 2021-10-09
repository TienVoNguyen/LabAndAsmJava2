
package assignment.model;

import java.util.List;

public interface EmployeeInterface<E> {
    
    public int save(E e);
    
    public int delete(String id);
    
    public int findById(String id);
    
    public List<E> getEmployeeList();
    
    public E getEmployeeByPosition (int index)throws Exception;
    
    List<E> openFile() throws Exception;
    
    public void saveFile() throws Exception;
    
    public int countEmployee();
}
