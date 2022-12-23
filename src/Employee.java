import java.util.Objects;

public class Employee {
    private final String  name;
    private final String surname;
    private final String patronymic;
    private int department;
    private double wages;
    private int id;
    static int count=0;
    static double sum=0;

    //конструктор Employee
    public Employee(String surname, String name, String patronymic, int department, double wages) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.wages = wages;
        this.id =count;
        count++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public double getWages() {
        return wages;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    //Сумму затрат на зарплаты
    public static double sumWages(double wages) {
        sum+=wages;
        return sum;
    }
    //Считаем среднее значение зарплат:
    public static double averageWages(double averageSum) {
        averageSum=sum/count;
        return averageSum;
    }
    public static double maxWages(double[] arr) {
        double max= arr[0];
        for (int j =1; j < arr.length-1; j++) {
            if (arr[j] > max) {
                max=arr[j];
            }
        }
        return max;
    }
    @Override
    public String toString() {
        return surname + "" + name + "" + patronymic + " из отдела №: " + department + " зп " + wages + " ID " + id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && wages == employee.wages && id == employee.id && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(patronymic, employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, department, wages, id);
    }
}
