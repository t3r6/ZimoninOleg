package lesson13.emloy2;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class Employee {
    private String fullname;
    private double salary;
    private Date salaryDate;

    public Employee(String fullname, double salary, Date salaryDate) {
        this.fullname = fullname;
        this.salary = salary;
        this.salaryDate = salaryDate;

    }

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        if (fullname != null ? !fullname.equals(employee.fullname) : employee.fullname != null) return false;
        return salaryDate != null ? salaryDate.equals(employee.salaryDate) : employee.salaryDate == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fullname != null ? fullname.hashCode() : 0;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (salaryDate != null ? salaryDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        Formatter f = new Formatter();
        Locale loc = Locale.getDefault();
        return f.format("Employee %s " + NumberFormat.getInstance(loc).format(salary), fullname).toString();
    }
}
