import java.util.Objects;

public class Employee {
    private String fio;
    private int department;
    private int salary;
    private int id;

    private static int counter = 1;

    public Employee(String fIO, int department, int salary) {
        this.fio = fIO;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFIO() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getID() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printShortInfo() {
        System.out.println("ФИО: " + fio + ", зарплата: " + salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "ФИО =" + fio + '\'' +
                ", отдел =" + department +
                ", зарплата =" + salary +
                ", id=" + id +
                '}';
    }
}
