//////////////////////////ИНКАПСУЛЯЦИЯ
public class trena {
    private String name;
    private int age;
    private boolean uniqueSpells;
    private boolean broomSkilled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

////////////// НАСЛЕДОВАНИЕ
class Questionnaire {
    String name;

    public String getName() {
        return name;
    }

    public void getInfo() {
        System.out.println("Имя: " + name);
    }
}

class TriwizardTournamentQuestionnaire extends Questionnaire {
    int age;
    boolean uniqueSpells;
    boolean broomSkilled;

}

////////////////////// ОБЪЕКТЫ И КЛАССЫ
public class Dragon {

    String name;
    int age;
    String color;
    boolean isFireBreathing;

    public Dragon(String name, int age, String color, boolean isFireBreathing) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isFireBreathing = isFireBreathing;
    }

    public String getName() {
        return name;
    }

    public void roar() {
        System.out.println("Roooaaarrr!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dragon redDragon = new Dragon("Flame", 150, "red", true);

        System.out.println("Name: " + redDragon.getName());

        redDragon.roar();
    }
}

///////////////////////////////// ИСКЛЮЧЕНИЯ
public static void learnSpell() {
    try {
        goToLibrary();
    } catch (BookNotFoundException e) {
        System.out.println("Придется поискать другую книгу");
        goToLibrary();
    } catch (NotSkilledEnoughException e) {
        System.out.println("Не хватает знаний, чтобы изучить заклинание");
    } finally {
        System.out.println("Мы попытались");
    }
}

public static void goToLibrary() throws IOException {
    if (bookNotFound) {
        throw new BookNotFoundException("Книга не найдена!");
    }
    if (notSkilledEnough) {
        throw new NotSkilledEnoughException("Нужно еще поучиться!");
    }
}

////////////////////////////// АБСТРАКТНЫЕ КЛАССЫ
public abstract class Elf {

    private String name;

    public abstract void work();

    public void disappear() {
        System.out.println("Эльф невидим!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class SchoolElf extends Elf {

    private boolean isPaid;

    @Override
    public void work() {
        if (isPaid) {
            System.out.println(super.getName() + " получит зарплату");
        } else {
            System.out.println(super.getName() + " хочет работать бесплатно");
        }
        cleanTheKitchen();
        cookFood();
        System.out.println("Работа выполнена");
    }

    private void cleanTheKitchen() {
        System.out.println(super.getName() + " убирается на кухне");
    }

    private void cookFood() {
        System.out.println(super.getName() + " готовит еду");
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}