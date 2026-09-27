package org.Vishnu;


import jakarta.persistence.*;

@Entity
@Table(name = "EmployeDetails")
public class Employ6ee {


    @Id
    private int EmpID;
    @Column(name = "EmployeeName")
    private String EmpName;
    @Column(name = "EmployeeJobName")
    private String EmpJobRole;
    @Embedded
    private Laptop laptop; // Embeddle object..

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpJobRole() {
        return EmpJobRole;
    }

    public void setEmpJobRole(String empJobRole) {
        EmpJobRole = empJobRole;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Employ6ee{" +
                "EmpID=" + EmpID +
                ", EmpName='" + EmpName + '\'' +
                ", EmpJobRole='" + EmpJobRole + '\'' +
                ", laptop=" + laptop +
                '}';
    }


}

