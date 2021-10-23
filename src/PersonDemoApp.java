public class PersonDemoApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.firstname = "Sabrina";
        person1.lastname = "Kaschowitz";
        person1.age = 27;
        person1.height = 162;

        person2.firstname = "Dominik";
        person2.lastname = "Rucker";
        person2.age = 29;
        person2.height = 188;

        System.out.println(person1.firstname + " " + person1.lastname +", " + person1.age + " Jahre");
        System.out.println(person2.firstname + " " + person2.lastname +", " + person2.age + " Jahre");
        printPerson(person1);
        printPerson(person2);
        person1.print();
        person2.print();
    }

public static void printPerson(Person p) {
    System.out.println(p.firstname + " " + p.lastname + ", " + p.age + " Jahre");
}

}
