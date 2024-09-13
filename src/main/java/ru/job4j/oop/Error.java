package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() { }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Is active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error errorDefault = new Error();
        errorDefault.printInfo();
        Error errorFalse = new Error(false, 1, "Good work.");
        errorFalse.printInfo();
        Error errorTrue = new Error(true, 2, "Okay, Houston ... we've had a problem here.");
        errorTrue.printInfo();
    }

}
