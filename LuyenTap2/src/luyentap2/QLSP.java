
package luyentap2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dinh Van
 */
public class QLSP implements SPInterface<SanPham>{
    List<SanPham> lst;
    String path;
    public QLSP() {
        this.lst = new ArrayList<>();
        path = "sanpham.dat";
    }
    
    @Override
    public void them(SanPham t) {
        this.lst.add(t);
    }

    @Override
    public void sua(int index, SanPham t) {
       this.lst.set(index, t);
    }

    @Override
    public void xoa(int index) {
        this.lst.remove(index);
    }

    @Override
    public void ghiFile() throws Exception {
        XFile.ghiFile(path, lst);
    }

    @Override
    public List<SanPham> docFile() throws Exception {
        lst = (List<SanPham>) XFile.docFile(path);
        return lst;
    }

    @Override
    public List<SanPham> getList() {
        return lst;
    }

    @Override
    public void setList(List<SanPham> lst) {
        this.lst = lst;
    }

  
    
}
