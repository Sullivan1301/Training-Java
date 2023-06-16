public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private double salary;


    //get maka, set manova
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Ici on va creer l'objet qui cree des employées

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void raise(int percent){
        this.salary += (salary * percent) / 100;
    }

    public String toString(){
        return this.lastName + " " + this.firstName;
    }

}
