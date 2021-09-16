package Section_6.Exercises.Ex30_Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(15);
        System.out.printf("The age is %d %n", person.getAge());
        System.out.printf("Person is teen - %b", person.isTeen());
    }
}
