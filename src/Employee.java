public class Employee {
    String name;
    String surname;
    String patronymic;
    int department;
    int wages;
    int id;

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
}
