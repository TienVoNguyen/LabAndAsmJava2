/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.qlsp;

import java.util.ArrayList;
import lab1.model.Product;
import lab1.qlinterface.Dao;

public class QLSP implements Dao{
    private ArrayList<Product> lst ;

    public QLSP() {
        lst = new ArrayList<>();
    }
    
        
    @Override
    public void insert(Product n) {
        lst.add(n);
    }

    @Override
    public void update(int viTri, Product n) {
        lst.set(viTri, n);
    }

    @Override
    public void delete(int viTri) {
        lst.remove(viTri);
    }

    @Override
    public ArrayList<Product> getList() {
        return lst;
    }

    @Override
    public void setList(ArrayList<Product> list) {
        lst = list;
    }
    
}
