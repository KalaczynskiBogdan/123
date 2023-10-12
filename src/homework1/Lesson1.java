package homework1;

public class Lesson1 {
    public static void main(String[] args) {
        int numberInt = 20;
        double numberDouble = 3.14;
        String stringText = "голови";
        final String MY_NAME = "Богдан";
        System.out.println(MY_NAME + ", в 20 років нарешті зрозумів, що дві голови краще за 1");

        int a = 22;
        int b = 20;

        int plusResult = a + b;
        int minusResult = a - b;
        int multiplyResult = a * b;
        int divideResult = a / b;

        System.out.println("Сума чисел " + a + " та " + b + " є " + plusResult +
                ", їх різниця: " + minusResult + ", їх добуток: " + multiplyResult +
                ", їх частка: " + divideResult);

        int c = 30;
        int d = 21;
        boolean equality = c == d;
        System.out.println(equality);

        if (c > 20 || c < 10) {
            int num1 = 1;
            System.out.println(num1);
        } else {
            int num2 = 2;
            System.out.println(num2);
        }

        int numberForSwitch = 3;
        switch (numberForSwitch) {
            case 1: {
                System.out.println("один");
                break;
            }
            case 2: {
                System.out.println("два");
                break;
            }
            case 3: {
                System.out.println("три");
                break;
            }
            case 4: {
                System.out.println("чотири");
                break;
            }
            case 5: {
                System.out.println("п'ять");
                break;
            }
            case 6: {
                System.out.println("шість");
                break;
            }
            case 7: {
                System.out.println("сім");
                break;
            }
            case 8: {
                System.out.println("вісім");
                break;
            }
            case 9: {
                System.out.println("дев'ять");
                break;
            }
            case 10: {
                System.out.println("десять");
                break;
            }
        }

        String text = "Я уважно слухав і питав";

        String check = (!text.isEmpty()) ? "Я програміст" : "Я все одно програміст";
        System.out.println(check);

        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println(b1 || b2 || b3 && b4); // Вираз буде завжди true, тому що:

        System.out.println(b3 && b4);//спершу перевіряється цей вираз, тому що він має приорітет.В ньому у нас мають виконатись
        // дві умови, але одна з них вже є false, тому вираз "true && false" виведе "false".

        System.out.println(b1 || b2);//далі йдемо зліва на право. В цьому виразі у нас мають виконатись хочаб одна з умов,
        // і так як одна з умов є true, то вираз "true || false" виведе "true". І в кінці буде аналогічна сітуація з цією
        //де буде перевірка виразу "true || false", і як ми вже знаємо, виведеться "true"
    }
}
