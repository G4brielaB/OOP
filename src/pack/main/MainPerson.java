package pack.main;

import pack.classes.Person;

public class MainPerson {
    public static void main(String[] args) {
        Person A = new Person("Mary", 25);
        Person B = new Person("Jack", 27);

        System.out.println(A);
        System.out.println(B);
    }
}
