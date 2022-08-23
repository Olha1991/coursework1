public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private int department;
    private double salary;
    private int id;
    private static int counter;


    public Employee (String lastName, String firstName, String middleName, int department,double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public String toString(){
        return "ФИО сотрудника: " + this.lastName + " " + this.firstName + " " + this.middleName +". " + "Отдел - " + this.department + ". " + "Зарплата: " + this.salary + ". " + "id - " + id + ".";
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getMiddleName(){
        return this.middleName;
    }


    public int getDepartment(){
        return this.department;
    }

    public double getSalary(){
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }
}

