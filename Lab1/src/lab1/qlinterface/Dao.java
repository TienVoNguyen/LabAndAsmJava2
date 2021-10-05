/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.qlinterface;

import java.util.ArrayList;
import lab1.model.Product;


/**
 *
 * @author Dinh Van
 */
public interface Dao {
    void insert(Product n);
    void update(int viTri, Product n);
    void delete(int viTri);   
    public ArrayList<Product> getList();
    public void setList(ArrayList<Product> list);
}
