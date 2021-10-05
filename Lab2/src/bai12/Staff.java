
package bai12;

public class Staff {
    private String staffId, name, gender, status, country, notes;

    public Staff() {
    }

    public Staff(String staffId, String name, String country , String gender, String status) {
        this.staffId = staffId;
        this.name = name;
        this.gender = gender;
        this.status = status;
        this.country = country;
    }

    public Staff(String staffId, String name, String country, String gender, String status, String notes) {
        this.staffId = staffId;
        this.name = name;
        this.gender = gender;
        this.status = status;
        this.country = country;
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
    
    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
