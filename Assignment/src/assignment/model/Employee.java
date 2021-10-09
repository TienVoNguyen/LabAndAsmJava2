
package assignment.model;

import java.io.Serializable;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Serializable{
    private String id, name, email, date;   
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, String date, String email, double salary) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.email = email;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ParsePosition position = new ParsePosition(0);
        Date now = new Date();
        sdf.setLenient(false);
        Date dd = (sdf.parse(date, position));        
        int age = now.getYear() - dd.getYear();        
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
