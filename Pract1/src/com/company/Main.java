package com.company;

public class Main {

    public static void main(String[] args) {
        Person My = new Person("Nikita", "Totmyanin", 21);
        Toy dogToy = new Toy("Glittery", Toys.BALL);

	    Dog myDog = new Dog("Mike", 2, My, dogToy);

        System.out.println(myDog);
        myDog.outputHumanAge();
    }
}