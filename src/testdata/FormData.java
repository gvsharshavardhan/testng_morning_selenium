package testdata;

public class FormData {

    String name;
    int rollnum;
    String clgname;
    double salary;

    public FormData(String name, int rollnum, String clgname, double salary) {
        this.name = name;
        this.rollnum = rollnum;
        this.clgname = clgname;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
    }

    public void setClgname(String clgname) {
        this.clgname = clgname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getRollnum() {
        return rollnum;
    }

    public String getClgname() {
        return clgname;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}