package com.company;

public class Dog {
    private String name;
    private int age;
    private Person owner;
    private Toy likeToy;

    public Dog(String name, int age, Person owner, Toy likeToy) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.likeToy = likeToy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner.getPersonInfo() +
                ", likeToy=" + likeToy.getToyInfo() +
                '}';
    }

    public void outputHumanAge() {
        System.out.println(this.name + "'s age in human years is " + this.age * 7 + "years");
    };
}
