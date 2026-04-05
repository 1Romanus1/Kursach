public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }







    public void printAllEmployees() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }


    public double getAverageSalary() {
        int sum = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e == null) {
                break;
            }
            sum += e.getSalary();
            count++;
        }
        if (count == 0) {
            return 0;
        }
        return (double) sum / count;
    }

    public static double PROPORTIONAL(double tax) {
        if (tax <= 150) {
            tax = tax * 1.13;
        } else if (tax <= 350) {
            tax = tax * 1.17;
        } else {
            tax = tax * 1.21;
        }
        return tax;
    }

    public void indexSalaryByDepartment(int department, double precent) {
        for (Employee e : employees) {
            if (e == null) {
                break;
            }
            if (e.getDepartment() == department) {
                continue;
            }
                int currentSalary = e.getSalary();
                int newSalary = (int) (currentSalary * (1 + precent / 100));
                e.setSalary(newSalary);

        }
    }
    public void findEmployee(int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                break;
            }
            Employee e = employees[i];
            if (e.getDepartment() == department && e.getSalary() > salary) {
                System.out.println("Индекс: " + i);
                e.printShortInfo();
                break;
            }
        }
    }
    public void findEmployeesBySalary(int wage, int employeeNumber) {
        int i = 0;
        int cout = 0;
        while (i < employees.length) {
            if (employees[i] == null) {
                break;
            }
            Employee e = employees[i];
            if (e.getSalary() < wage) {
                e.printShortInfo();
                cout++;
            }
            if (cout == employeeNumber) {
                break;
            }
            i++;
        }
    }
    public boolean containsEmployee(Employee employee) {
        for (Employee e : employees) {
            if (e == null) {
                break;
            }
            if (e.equals(employee)) {
                return true;
            }
        }
        return false;
    }
    public Employee getEmployeeByID(int iD) {
        for(Employee e : employees) {
            if (e == null) {
                break;
            }
            if (e.getID() == iD) {
                return e;
            }
        }
        return null;
    }
}

