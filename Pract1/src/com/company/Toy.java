package com.company;

enum Toys { BALL, BONE };

public class Toy {
    private String name;
    private Toys type;

    public Toy(String name, Toys type) {
        this.name = name;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Toys type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Toys getType() {
        return type;
    }

    public String getToyInfo() {
        return String.format("[%s]: %s", type, name);
    }
}
