
package luyentap2;

import java.util.List;

public interface SPInterface<T> {
    public void them(T t);
    
    public void sua(int index, T t);
    
    public void xoa(int index);
    
    public void ghiFile() throws Exception;
    
    public List<T> docFile() throws Exception;
    
    public List<T> getList();
    
    public void setList(List<T> lst);
}
