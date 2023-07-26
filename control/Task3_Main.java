package control;


import java.util.*;
import java.util.stream.Collectors;

public class Task3_Main {
    public static void main(String[] args) {
        List<Task3_Box> boxes = generateBoxes(10);
        printBoxes(boxes);

        Map<String, Long> typeCountMap = countBoxesByType(boxes);
        System.out.println("Количество коробок каждого типа:");
        typeCountMap.forEach((type, count) -> System.out.println(type + ": " + count));
    }

    public static List<Task3_Box> generateBoxes(int numBoxes) {
        List<Task3_Box> boxes = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numBoxes; i++) {
            int x = random.nextInt(10) + 1; // Генерируем случайные значения от 1 до 10
            int y = random.nextInt(10) + 1;
            int z = random.nextInt(10) + 1;
            String[] types = {"BOX", "ENVELOP", "CUBE"};
            String type = types[random.nextInt(types.length)];
            int weight = random.nextInt(100) + 1; // Генерируем случайные значения от 1 до 100

            Task3_Box box = new Task3_Box(x, y, z, type, weight);
            boxes.add(box);
        }

        return boxes;
    }

    public static void printBoxes(List<Task3_Box> boxes) {
        System.out.println("Сгенерированные коробки:");
        boxes.forEach(System.out::println);
    }

    public static Map<String, Long> countBoxesByType(List<Task3_Box> boxes) {
        return boxes.stream()
                .collect(Collectors.groupingBy(Task3_Box::getType, Collectors.counting()));
    }
}
