package com.jefi;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result = result + 1;
        System.out.println("result is: " + result);
        result++;
        System.out.println("result is now: " + result);
        result--;
        System.out.println("result is now: " + result);

        result += 2;
        System.out.println("result is now: " + result);
        result *= 10;
        System.out.println("result is now: " + result);
        result -= 10;
        System.out.println("result is now: " + result);
        result /=10;
        System.out.println("result is now: " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore >= 100)) {
            System.out.println("Greater than secondTopScore and greater then or equal to 100");
        }

        System.out.println("-------------");

        // 4.22. More On Operators and Operator Precedence
        if ((topScore > 90) || (secondTopScore <= 50)) {
            System.out.println("One of these tests is true.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true.");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen!");
        }

        if (isCar) {
            System.out.println("It is a car.");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("It was a car.");
        }
    }
}