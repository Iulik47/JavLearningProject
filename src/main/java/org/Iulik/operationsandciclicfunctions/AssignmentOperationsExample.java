package org.Iulik.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int x = 8;
        int y = 5;

        // Simple assignment
        int result = x;
        System.out.println("Simple assignment: " + result);

        // Assignment with increment
        result += y;
        System.out.println("Assignment with increment : " + result);

        // Assignment with substraction
        result -= y;
        System.out.println("Assignment with substraction : " + result);

        // Assignment with multiplication
        result *= x;
        System.out.println("Assignment with multiplication: " + result);

        // Assignment with devision
        result /= 2;
        System.out.println("Assignment with devision: " + result);

        // Assignment with rest of devision
        result %= 7;
        System.out.println("Assignment with rest of devision: " + result);
    }
}
