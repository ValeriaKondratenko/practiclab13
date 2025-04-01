package comlab;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Валерия!");

        Tester one = new Tester();
        Tester two = new Tester("Валера", "Кондрат");
        Tester three = new Tester("Кондатус", "Крапиватус", 17, "B1", 5553.50);

        System.out.println(two.getName());
        one.setName("Куська");
        System.out.println( one.helloPerson(567.23));
        one.helloPerson("Янта", "Собачка", 789.99);
        one.helloPerson("Зина", "Игоринва");
        System.out.println(Tester.getInf("Сафирка", "Кшечка", 1500.35, "C2"));

    } 
}
