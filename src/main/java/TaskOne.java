import java.util.ArrayList;
import java.util.Random;

//1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
public class TaskOne {
    public static void main(String[] args) {
        deleteEvenNumbers();
    }

    private static void deleteEvenNumbers() {
        Random random = new Random();
        ArrayList<Integer> arrays = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            arrays.add(random.nextInt(0, 1000));
        }

        System.out.printf("Исходный массив: " + arrays + "\n");

        arrays.removeIf(number -> number % 2 == 0);
        System.out.printf("Массив без четных чисел:" + arrays);
    }
}
