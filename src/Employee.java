import java.util.Objects;

public class Employee {
    private final String  name;
    private final String surname;
    private final String patronymic;
    private int department;
    private int wages;
    private int id;

    //конструктор Employee
    public Employee(String surname, String name, String patronymic, int department, int wages, int id) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.wages = wages;
        this.id = id;
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

    public int getWages() {
        return wages;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    @Override
    public String toString() {
        return surname + "" + name + "" + patronymic + " из отдела №: " + department + " с зп " + wages + " ID " + id;
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
