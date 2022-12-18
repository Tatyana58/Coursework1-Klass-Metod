public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая работа №1 Классы и методы.");
        Employee[] collegue = new Employee[10];
        collegue[0]= new Employee("Иванов ","Дмитрий ","Иванович ",1,4000,1 );
        collegue[1] = new Employee("Сидоров ", "Сергей ", "Петрович ", 2, 1000, 2);
        collegue[2] = new Employee("Лаврова ", "Любовь ", "Васильевна ", 4, 7000, 4);
        collegue[3] = new Employee("Макеев ", "Александр ", "Андреевич ", 3, 2000, 4);
        collegue[4] = new Employee("Юдина ", "Ольга ", "Борисовна ", 1, 3000, 4);
        collegue[5] = new Employee("Сергеев ", "Юрий ", "Витальевич ", 5, 5000, 4);
        collegue[6] = new Employee("", "", "", 4, 5000, 4);
        collegue[7] = new Employee("", "", "", 4, 5000, 4);
        collegue[8] = new Employee("", "", "", 4, 5000, 4);
        collegue[9] = new Employee("", "", "", 4, 5000, 4);

        //Вывод всех сотрудников
        for (int x=0;x< collegue.length-1;x++) {
            System.out.println(collegue[x]);
        }

    }
}