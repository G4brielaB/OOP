package pack.main;

import pack.classes.Dog;

public class MainDog {
    public static void main(String[] args) {
        Dog A = new Dog("Chappy", "Golden Retriever");
        Dog B = new Dog("Terry", "German Shepperd");

        System.out.println("A before update: " + A);
        System.out.println("B before update: " + B);
        A.setName("Rex");
        B.setBreed("Beagle");
        System.out.println("A after update: " + A);
        System.out.println("B after update: " + B);
    }
}
