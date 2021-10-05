/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.Serializable;

/**
 *
 * @author Dinh Van
 */
public class Student implements Serializable{
    public String maSV, name, major;
    public double marks;

    public Student() {
    }

    public Student(String maSV, String name, String major, double marks) {
        this.maSV = maSV;
        this.name = name;
        this.major = major;
        this.marks = marks;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    
    public String getGrade(){
        if(this.marks<3){
            return "Kém";
        }else if(this.marks<5){
            return "Yếu";
        }else if(this.marks<6.5){
            return "Trung bình";
        }else if(this.marks<7.5){
            return "Khá";
        }else if(this.marks<9){
            return "Giỏi";
        }else{
            return "Xuất sắc";
        }
    }
    
    public boolean isBonus(){
        return this.marks >=7.5;
    }
}
