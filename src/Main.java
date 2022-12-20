import java.util.Arrays;

public class Main {
    static final int N=10;
    public int id=0;
    public static void main(String[] args) {
        System.out.println("Курсовая работа №1 Классы и методы.");
        Employee[] collegue = new Employee[N];
        collegue[0]= new Employee("Иванов ","Дмитрий ","Иванович ",1,4000,1 );
        collegue[1] = new Employee("Сидоров ", "Сергей ", "Петрович ", 2, 1000, 2);
        collegue[2] = new Employee("Лаврова ", "Любовь ", "Васильевна ", 4, 7000, 4);
        collegue[3] = new Employee("Макеев ", "Александр ", "Андреевич ", 3, 2000, 4);
        collegue[4] = new Employee("Юдина ", "Ольга ", "Борисовна ", 1, 3000, 4);
        collegue[5] = new Employee("Сергеев ", "Юрий ", "Витальевич ", 5, 5000, 4);
        collegue[6] = new Employee("", "", "", 4, 7000, 4);
        collegue[7] = new Employee("", "", "", 4, 5000, 4);
        collegue[8] = new Employee("", "", "", 4, 5000, 4);
        collegue[9] = new Employee("", "", "", 4, 7000, 4);

        //Вывод всех сотрудников
        for (int x=0;x< collegue.length;x++) {
            System.out.println(collegue[x]);
        }
        //находим сумму всех зарплат
        int sumZP=0;
        int sredSumZP=0;
        for (int i = 0; i < collegue.length; i++) {
            sumZP+=collegue[i].getWages();
        }
        System.out.println("Сумма всех зарплат - "+sumZP);
        //находим среднюю зарплату
        sredSumZP=sumZP/ collegue.length;
        System.out.println("Средняя зарплата - "+sredSumZP);


    }

    int K=0;

    public void totalWages(Employee surname,Employee name, Employee patronymic, int department, double wages, int id)
    {
        wages++;
        id++;
        return;
    }
}