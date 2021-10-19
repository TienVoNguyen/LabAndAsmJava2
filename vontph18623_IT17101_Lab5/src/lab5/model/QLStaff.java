/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dinh Van
 */
public class QLStaff implements StaffInterface{
    List<Staff> list;

    public QLStaff() {
        list = new ArrayList<>();
    }

    @Override
    public void insert(Staff s) {
        list.add(s);
    }

    @Override
    public void update(int viTri, Staff s) {
        list.set(viTri, s);
    }

    @Override
    public void delete(int viTri) {
        list.remove(viTri);
    }

    @Override
    public void setStaffList(List<Staff> list) {
        this.list = list;
    }

    @Override
    public List<Staff> getStaffList() {
        return list;
    }
    
}
