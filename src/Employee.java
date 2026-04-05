import java.util.Objects;

public class Employee {
    private String fIO;
    private int department;
    private int salary;
    private int iD;

    private static int counter = 1;

    public Employee(String fIO, int department, int salary) {
        this.fIO = fIO;
        this.department = department;
        this.salary = salary;
        this.iD = counter++;
    }

    public String getFIO() {
        return fIO;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public int getID() {
        return iD;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }






    public void printShortInfo() {
        System.out.println("FIO: " + fIO + ", salary: " + salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return iD == employee.iD;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(iD);
    }

    // Полная информация
    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fIO + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + iD +
                '}';
    }
}
