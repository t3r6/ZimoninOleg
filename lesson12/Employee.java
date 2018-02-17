package lesson12;

public class Employee {
    private String fullname;
    private double salary;
    private static Employee[] employees;

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

    public static Employee[] getEmployees() {
        return employees;
    }

    public static void setEmployees(Employee[] employees) {
        Employee.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        return fullname != null ? fullname.equals(employee.fullname) : employee.fullname == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fullname != null ? fullname.hashCode() : 0;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
