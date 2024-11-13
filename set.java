import java.util.*;//список с уникальными ключами

public class set {
    public static void main(String[] args) {
        Set<String> students = new HashSet<>();

        students.add("Малфой");
        students.add("Крэбб");
        students.add("Гойл");

        System.out.println(students);
    }
}
