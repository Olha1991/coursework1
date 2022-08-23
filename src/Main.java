public class Main {

    static Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        employee[0] = new Employee("1Иванов", "1Иван", "1Иванович", 1, 1000);
        employee[1] = new Employee("2Иванов", "2Иван", "2Иванович", 2, 2000);
        employee[2] = new Employee("3Иванов", "3Иван", "3Иванович", 4, 3000);
        employee[3] = new Employee("4Иванов", "4Иван", "4Иванович", 4, 4000);
        employee[4] = new Employee("5Иванов", "5Иван", "5Иванович", 5, 5000);
        employee[5] = new Employee("6Иванов", "6Иван", "6Иванович", 1, 6000);
        employee[6] = new Employee("7Иванов", "7Иван", "7Иванович", 2, 7000);
        employee[7] = new Employee("8Иванов", "8Иван", "8Иванович", 3, 8000);
        employee[8] = new Employee("9Иванов", "9Иван", "9Иванович", 4, 9000);
        employee[9] = new Employee("10Иванов", "10Иван", "10Иванович", 5, 10000);

        System.out.println(employee[0]);
        System.out.println(employee[1]);
        System.out.println(employee[2]);
        System.out.println(employee[3]);
        System.out.println(employee[4]);
        System.out.println(employee[5]);
        System.out.println(employee[6]);
        System.out.println(employee[7]);
        System.out.println(employee[8]);
        System.out.println(employee[9]);

        System.out.println("Сумма затрат на зарплаты в месяц - " + getSumSalary() + " рублей.");

        System.out.println("Сотрудни с минимальной зарплатой: " + getMinSalary());

        System.out.println("Сотрудник с максимальной зарплатой: " + getMaxSalary());

        System.out.println("Среднее значение зарплат: " + getAverageSalary() + " рублей.");

        printAllEmployee();

    }


    public static double getSumSalary() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum = sum + employee[i].getSalary();
            }
        }
        return sum;
    }

    public static Employee getMinSalary(){
        double minSalary;
        Employee minSalaryEmployee = null;
        for (int i = 0; i < employee.length; i++){
            if (employee[i] != null) {
                minSalary = employee[i].getSalary();
                minSalaryEmployee = employee[i];
                break;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee getMaxSalary(){
        double maxSalary =0;
        Employee maxSalaryEmployee = null;
        int x = 0;
        for (int i = 0; i < employee.length; i++){
            if (employee[i] != null){
                maxSalary = employee[i].getSalary();
                maxSalaryEmployee = employee[i];
                x = i;
                break;
            }
        }
        for (int i = x; i < employee.length; i++){
            if (employee[i] != null){
                if (maxSalary < employee[i].getSalary()){
                    maxSalary = employee[i].getSalary();
                    maxSalaryEmployee = employee[i];
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double  getAverageSalary() {
        if (employee.length != 0) {
            return getSumSalary()/employee.length;
        } else {
            return 0;
        }
    }

    public static void printAllEmployee(){
        for (int i = 0; i < employee.length; i++){
            if (employee[i] != null){
                System.out.println(employee[i].getLastName() + " " + employee[i].getFirstName() + " " + employee[i].getMiddleName());
            }
        }
    }
}








