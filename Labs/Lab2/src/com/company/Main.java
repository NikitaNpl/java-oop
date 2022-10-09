package com.company;

import Human.*;

public class Main {

    public static void main(String[] args) {
        Head meHead = new Head(15, "black", "green");

        Human me = new Human(meHead, "white", 'M', 21);
        System.out.println(me);
    }
}
