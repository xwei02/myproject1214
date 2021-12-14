package com.sylvie;

public class Runner {
    public static void main(String[] args) {
        float h = 1.7f;
        float w = 71.5f;
        System.out.println(w/(h*h));

        Person p = new Person(71.5f,1.7f);
        System.out.println("Your bmi is"+p.bmi());
    }
}
