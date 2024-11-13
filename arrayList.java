import java.util.*;//массив  алгоритмы

public class arrayList {

    public static void main(String[] args) {
        List<String> professor = new ArrayList<>();

        professor.add("Минерва Макгонаглл");
        professor.add("Снейп Северус");
        professor.add("Аластор Грюм");
        professor.add("Гораций Слизнорт");
        professor.add("Долорес Амбридж");
        professor.add("Златопуст Локонс");

        professor.add(3, "Квиринус Квирелл");

        professor.set(2, "Альбус Дамблдор");

        System.out.println(professor.get(4));

        System.out.println(professor);

        String x = professor.remove(2);

        System.out.println(x);

    }
}
