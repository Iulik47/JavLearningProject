package org.Iulik.operationsandciclicfunctions;

public class AritmeticOperationsExample {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        //  Sum
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // substraction
        int sub = a - b;
        System.out.println("Substraction result is: " + sub);

        //Multiplication
        int multipl = a * b;
        System.out.println("Multiplication result is: " + multipl);

        //Devision
        double devis = multipl / a;
        System.out.println("Devision result is: " + devis);

        // The rest of devision
        double restDevis = a % b;
        System.out.println("The rest of devision is: " + restDevis);

        // Sum a word with a number
        int numb1 = 500;
        String carMake = "Fiat";
        String italCar = carMake + numb1;
        System.out.println("The model of the car is: " + italCar);
    }
}
