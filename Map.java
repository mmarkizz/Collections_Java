
import java.util.*;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 28);
        map.put("Max", 17);
        map.put("Seva", 20);

        Integer ageAlice = map.get("Alice");

        map.remove("Alice");

        System.out.println(map);

        System.out.println("Содержит ли HashMap ключ 'Alice': " +
                map.containsKey("Alice"));

        System.out.println("Итерация по элементам HashMap:");
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", Возраст: " +
                    entry.getValue());
        }

    }
}
