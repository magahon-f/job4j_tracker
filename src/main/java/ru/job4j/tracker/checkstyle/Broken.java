package ru.job4j.tracker.checkstyle;

public class Broken {
    public static final String NEWVALUE = "";
    private int sizeOfEmpty = 10;
    private String name;
    private String surname;

    Broken() { }

    void echo() { }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c, int d, int e, int f, int g) { }
}