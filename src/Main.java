public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();

        for (int i = 0; i < 11; i++ ) {

            Employee emp = new Employee(" Сотрудник " + i, i % 5 + 1, 200 + i * 10);
            boolean result = book.addEmployee(emp);
            if (result) {
                System.out.println("Сотрудник " + emp.getFIO() + " добавлен");
            } else {
                System.out.println("Нет свободных мест для " + emp.getFIO());
            }
        }
        System.out.println("\nВсе сотрудники: ");
        book.printAllEmployees();
        System.out.println("\nСредняя зарплата: " + book.getAverageSalary());

        book.indexSalaryByDepartment(1, 10);
        System.out.println("\nПосле индексации зарплаты отдела 1 на 10%: ");
        book.printAllEmployees();

        System.out.println("\nПоиск отдела 2 с зарплатой > 220: ");
        book.findEmployee(2, 220);

        System.out.println("\nПервые 2 сотрудника с зарплатой < 250: ");
        book.findEmployeesBySalary(250, 2);

        Employee testEmp = new Employee("Сотрудник 3 ", 3, 230);
        boolean exists = book.containsEmployee(testEmp);
        System.out.println("\nСотрудник " + testEmp.getFIO() + " есть в списке? " + exists);

        Employee byID = book.getEmployeeByID(5);
        System.out.println("Сотрудник с id 5:");
        if (byID != null) {
            byID.printShortInfo();
        } else {
            System.out.println("Не найден");


        }
    }
}