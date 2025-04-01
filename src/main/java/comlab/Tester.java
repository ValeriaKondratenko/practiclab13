package comlab;

public class Tester {
    protected String name;
    protected String surname;
    protected int expirienceInYears;
    protected String englishLevel;
    protected double salary;

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary){
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(){
        this("Карыч", "Как-Карыч", 45, "B2", 4567.45);
    }

    public Tester(String name, String surname){
        this(name, surname, 56, "Неизвестно", 100.0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void helloPerson(String name, String surname){
        System.out.println("Приветствую тебя - " + name + " " + surname);
    }

    public void helloPerson(String name, String surname, double salary){
        System.out.println("Приветствую тебя человек - " + name + " " + surname + "твоя зарплата состовляет - " + salary);
    }

    public double helloPerson(double salary){
        System.out.println("ТЫ только что получил бонус, твоя зарплата увеличилась на 2");
        return salary * 2;
    }

    public static double getInf(String name, String surname, double salary, String englishLevel){
        System.out.println("Имя - " + name + "Фамилия - " + surname + "Уровень английского - " + englishLevel);
        System.out.println("Ты поймал неудачу, твоя зарплата уменьшилась в два раза ");
        return salary / 2;
    }
}
