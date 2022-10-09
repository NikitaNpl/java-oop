package com.company;

import authors.*;
import balls.Ball;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Author authorMale = new Author("Ivan Popov", "pivan@exmaple.com", 'M');
        Author authorFemale = new Author("Anna K", "kanna@exmaple.com", 'F');
        System.out.println(authorMale);
        System.out.println(authorFemale);

        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}
