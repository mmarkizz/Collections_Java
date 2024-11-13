import java.util.*;//связанный список алгоритмы

public class linkedList {
    public static void main(String[] args) {
        List<String> wizards = new LinkedList<>();
        wizards.add("Рон");
        wizards.add("Гарри");
        wizards.add("Гермиона");
        wizards.add("Хагрид");

        wizards.add(2, "Малфой");

        System.out.println(wizards);

    }
}
