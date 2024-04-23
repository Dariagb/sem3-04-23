//1. Построить три класса (базовый и 2 потомка),
// описывающих некоторых работников с почасовой оплатой (один из потомков - Freelancer)
// и фиксированной оплатой (второй потомок -Worker).
//а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
// Для «повременщиков» формула для расчета такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
// для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата».

//б) Создать на базе абстрактного класса массив/коллекцию сотрудников и заполнить его.

//в) ** Реализовать интерфейсы для возможности сортировки массива/коллекции
// (обратите ваше внимание на интерфейсы Comparator, Comparable),
// добавьте новое состояние на урове базового типа и создайте свой уникальный компаратор.
//г) ** Создать класс, содержащий массив или коллекцию сотрудников
// (как Worker так и Freelancer), и реализовать возможность вывода данных с использованием foreach
// (подсказка: вам потребуется поработать с интерфейсом Iterable).

import ru.gb.javacor.sem3.ArrayEmployee;
import ru.gb.javacor.sem3.Employees;
import ru.gb.javacor.sem3.Freelancer;
import ru.gb.javacor.sem3.Worker;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Petr", 34, "director");
        Worker worker2 = new Worker("Oleg", 32, "engineer");
        Freelancer freelancer1 = new Freelancer("Elena", 56, "designer");
        Freelancer freelancer2 = new Freelancer("Vera", 43, "designer");
        worker1.salaryCalculation();
        freelancer1.salaryCalculation();
        Employees[] array = new Employees[10];
        array[0] = worker1;
        array[1] = worker2;
        array[2] = freelancer1;
        array[3] = freelancer2;
        Arrays.sort(array);

        ArrayEmployee employees1 = new ArrayEmployee();

        for (Employees employees : employees1) {
            System.out.println("Name: " + employees.getName() + ", Age: " + employees.getAge());
            if (employees instanceof Worker) {
                System.out.println("Position: " + ((Worker) employees).getPlace());
            } else if (employees instanceof Freelancer) {
                System.out.println("Specialty: " + ((Freelancer) employees).getSpecialty());
            }
            System.out.println();

        }
    }

}