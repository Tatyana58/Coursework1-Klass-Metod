public class Main {
    static final int N=10;
    public static void main(String[] args) {
        System.out.println("Курсовая работа №1 Классы и методы.");
        Employee[] collegue = new Employee[N];
        collegue[0] = new Employee("Иванов ", "Дмитрий ", "Иванович ", 1, 4000);
        collegue[1] = new Employee("Сидоров ", "Сергей ", "Петрович ", 2, 1000);
        collegue[2] = new Employee("Лаврова ", "Любовь ", "Васильевна ", 4, 7000);
        collegue[3] = new Employee("Макеев ", "Александр ", "Андреевич ", 3, 2000);
        collegue[4] = new Employee("Юдина ", "Ольга ", "Борисовна ", 1, 3000);
        collegue[5] = new Employee("Сергеев ", "Юрий ", "Витальевич ", 5, 5000);
        collegue[6] = new Employee("", "", "", 4, 7000);
        collegue[7] = new Employee("", "", "", 4, 5000);
        collegue[8] = new Employee("", "", "", 4, 5000);
        collegue[9] = new Employee("", "", "", 4, 7000);

        for (int i = 0; i <N ; i++){
            Employee.sumWages(collegue[i].getWages());
        }System.out.println("Сумма зарплат всех сотрудников: "+Employee.sum);


    /*public static double sumWages(){
        double sum = 0;
        sum=+1();
        return sum;
    }


     */}


    public static void printInfo(Employee surname, Employee name, Employee patronymic, Employee department, Employee wages,Employee id) {
        System.out.println("Сотрудники" + surname.getSurname() + "" + name.getName() + "" + patronymic.getPatronymic() + "" + department.getDepartment() + "" + wages.getWages() + "" + id.getId());
    }




}