package homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {     // 1 завдання для for
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        char letter; // 2 завдання для for
        for (letter = 'a'; letter <= 'z'; ++letter) {
            System.out.println(String.valueOf(letter).toUpperCase());
        }

        for (int i = 1; i <= 10; i++) { // 3 завдання для for
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }

        for (int i = 1; i <= 10; i++) {     // 4 завдання для for
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        Scanner scanner = new Scanner(System.in);
        while (true) { // 1 завдання для while
            System.out.println("If you want to exit, enter '0'");
            System.out.println("Enter your number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            System.out.println("Your number is " + number);
        }

        while (true) { // 2 завдання для while
            System.out.println("If you want to exit, enter 'exit'");
            System.out.println("Enter your name: ");
            String name = scanner.next();
            if (name.equals("exit")) {
                break;
            }
            System.out.println(name + ", hello!");
        }

        Random random = new Random();  // 1 завдання для do/while
        do {
            int a = random.nextInt(100);
            System.out.println(a);
            if (a == 50) {
                break;
            }
        }
        while (true);

        System.out.println("Create a password: "); // 2 завдання для do/while
        String yourPassword = scanner.next();
        System.out.println("Repeat your password: ");
        do {
            String password = scanner.next();
            if (!password.equals(yourPassword)) {
                System.out.println("You entered a wrong password, please try again");
            } else {
                System.out.println("Thank you");
                break;
            }
        } while (true);

        String[] arrayOfColors = {"Black", "Yellow", "White", "Green", "Blue", "Pink", "Violet", "Red", "Beige"};//1 завдання для форич
        for (String color : arrayOfColors) {
            System.out.println(color);
        }

        System.out.println("How many numbers do you want in your array?"); // 1 завдання для масивів
        int count = scanner.nextInt();
        int[] array = new int[count];
        int sequence = 1;
        for (int i = 0; i < count; i++) {
            System.out.println("Enter " + sequence + " number");
            int number = scanner.nextInt();
            array[i] = number;
            sequence++;
        }
        System.out.println("Your array: " + Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max " + max + ", min: " + min);

        int[] array2 = {4, 1, 6, 9, 7}; // 2 завдання для масивів
        System.out.println(array2.length);
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i] + " ");
        }
    }
}
