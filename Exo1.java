public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private double salary;

    public Employee(int id, String lastName, String firstName, double salary) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raise(int percent) {
        double raiseAmount = salary * percent / 100;
        salary += raiseAmount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        // Création d'un employé
        Employee employee = new Employee(1, "Doe", "John", 50000.0);

        // Affichage des informations de l'employé
        System.out.println(employee.toString());

        // Augmentation du salaire de l'employé de 10%
        employee.raise(10);

        // Affichage des informations de l'employé après augmentation de salaire
        System.out.println(employee.toString());
    }
}
