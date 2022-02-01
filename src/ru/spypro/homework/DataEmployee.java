package ru.spypro.homework;

public class DataEmployee {
    public static void main(String[] args) {
        Employee[] dataOfWEmployee = new Employee[10];
        dataOfWEmployee[0]=new Employee(1, "Nikolaeva", 01, 100_000);
        dataOfWEmployee[1]=new Employee(1, "Ivanova", 05, 200_000);
        dataOfWEmployee[2]=new Employee(1, "Popov", 03, 150_000);
        dataOfWEmployee[3]=new Employee(1, "Petrova", 04, 123_000);
        dataOfWEmployee[4]=new Employee(1, "Vasilev", 03, 110_000);
        dataOfWEmployee[5]=new Employee(1, "Morozova", 05, 150_000);
        dataOfWEmployee[6]=new Employee(1, "Pavlov", 02, 200_000);
        dataOfWEmployee[7]=new Employee(1, "Sidorov", 04, 160_000);
        dataOfWEmployee[8]=new Employee(1, "Orlov", 02, 210_000);
        dataOfWEmployee[9]=new Employee(1, "Romanova", 01, 300_000);


    }

    public static void allEmployee(Employee[] dataOfWEmployee) { //вывести всех сотрудников
        for (int i = 0; i < dataOfWEmployee.length; i++) {
            System.out.println(dataOfWEmployee[i]);
        }
    }

    public static void sumOfSalary(Employee getSalary, Employee[] dataOfWEmployee) { //сумма зарплат
        int generalSalary = 0;
        for (int i = 0; i < dataOfWEmployee.length; i++) {
            generalSalary = generalSalary+ getSalary.salary ;
        }
        System.out.println(generalSalary);


    }
    public static void minSalary(Employee[] getSalary, Employee[] dataOfWEmployee) { //минимальная зарплата
        Employee min = dataOfWEmployee[0];
        int max = dataOfWEmployee.length;
        for (int i = 0; i < dataOfWEmployee.length; i++) {
            if (getSalary[i] < min) {
                min = getSalary[i];
            }
        }
        System.out.println(min);
    }
    public static void maxSalary(Employee getSalary, Employee[] dataOfWEmployee){ //максимальная зарплата
        Employee min = dataOfWEmployee[0];
        int max = dataOfWEmployee.length;
        for (int i = 0; i < dataOfWEmployee.length; i++) {
            if (getSalary[i] > min) {
                min = getSalary[i];
            }
        }
        System.out.println(max);
    }
    public static void midSalary(int[] getSalary, Employee[] dataOfWEmployee) { //средняя зарплата
        int everyoneSalary = sumOfSalary();
        double midSalarySum = everyoneSalary / dataOfWEmployee.length;
        System.out.println(midSalarySum);
    }

    public static void onlyNamesEmployee(Employee getNames, Employee dataOfWEmployee) { //ФИО сотрудников
        System.out.println(dataOfWEmployee.getFamilyName());
    }
}
