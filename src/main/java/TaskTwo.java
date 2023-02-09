import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class TaskTwo {
    public static void main(String[] args) {
        // Заполняем список
        Random random = new Random();
        ArrayList<Integer> someList = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            someList.add(random.nextInt(100));
        }

        extremum(someList);
        average(someList);

    }

    private static void extremum(ArrayList<Integer> someList) { // метод который отвечает за вывод наибольшого и наименьшего значения
        System.out.printf("Исходный список: " + someList + "\n");

        // Несколько вариантов решения
        // 1) Вывод при помощи Collections.max/min - это встроенный метод
        System.out.printf("Минимальное значение элементов списка: " + Collections.min(someList) + "\n");
        System.out.printf("Максимальное значение элементов списка: " + Collections.max(someList) + "\n");

        // 2) Отсортировать список и взять соответсвенно для наименьшего значение: element[0] для наибольшего element[array.size() -1]
        Collections.sort(someList); // сортировка от меньшего к большему
        System.out.printf("Отсортированный список: " + someList + "\n");
        System.out.printf("Min = " + someList.get(0) + "\n");
        System.out.printf("Max = " + someList.get(someList.size() - 1) + "\n");

    }
    static void average (ArrayList<Integer> someList) {
        double sum = 0;
        for (Integer integer : someList) {
            sum = sum + integer;
        }
        System.out.print("Среднее значение элементов списка = " + sum/ someList.size() + "\n");
    }
}
