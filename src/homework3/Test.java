package homework3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
        A a = new A(); //завдання 1 для Strings
        a.abc1();

        B b = new B();//2 завдання Strings
        b.abc2();

        C c = new C();// 3 завдання Strings
        c.abc3();

        //      1 завдання для класів
        Book book1 = new Book("Harry Potter and the Philosopher's stone", "J.K.Rowling", 1997, 223);
        System.out.println("First book: " + book1.getName() + ", author: " + book1.getAuthor() + ", year of publication: " + book1.getYear()
                + ", count of pages: " + book1.getCountOfPages());
        Book book2 = new Book("The defining decade", "Meg Jay", 2013, 272);
        System.out.println(book2.getName());

        //      2 завдання для класів
        BankAccount account1 = new BankAccount(1234, 10000, "Bohdan");
        System.out.println("Баланс на рахунку: " + account1.getBalance());
        account1.withdrawing(100.99);
        System.out.println("Після зняття готівки, баланс став: " + account1.getBalance());
        account1.replenishment(1250);
        System.out.println("Після поповнення рахунку, баланс став: " + account1.getBalance());

        //      3 завдання для класів
        Car car1 = new Car();
        System.out.println("Car: " + car1.getCarBrand() + ", engine power: " + car1.getEnginePower()
                + ", fuel tank capacity: " + car1.getFuelTankCapacity());
        car1.start();
        car1.fuelSupply();
        car1.finish();

        //      4 завдання для класів
        Product product1 = new Product("Pen", 2, 100);
        Product product2 = new Product("Pencil", 1, 45);
        product1.totalPrice();
        product2.totalPrice();
        product1.changeCount(99);
        product2.changeCount(40);
    }
}

class A {
    public void abc1() {
        Scanner scanner = new Scanner(System.in); //завдання 1 для Strings
        System.out.println("First sentence: ");
        String text1 = scanner.next();
        System.out.println("Second sentence: ");
        String text2 = scanner.next();
        StringBuilder stringBuilder1 = new StringBuilder(text1);
        StringBuilder stringBuilder2 = new StringBuilder(text2);
        String result = stringBuilder1.append(stringBuilder2).toString();
        System.out.println(result);
    }
}

class B {
    public void abc2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new sentence: "); //2 завдання Strings
        String text = scanner.nextLine();
        StringTokenizer sT = new StringTokenizer(text);

        while (sT.hasMoreTokens()) {
            String test = sT.nextToken();
            System.out.println(test);
        }
    }
}

class C {
    public void abc3() {
        System.out.println("Enter new sentence:"); // 3 завдання Strings
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U' &&
                    c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                buffer.append(c);
            }
        }
        System.out.println(buffer);
    }
}

class Book { //      1 завдання для класів
    private String name;
    private String author;
    private int year;
    private int countOfPages;

    public Book(String name, String author, int year, int countOfPages) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.countOfPages = countOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }
}

class BankAccount { //      2 завдання для класів
    private int accountNumber;
    private double balance;
    private String owner;

    public BankAccount(int accountNumber, double balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public double withdrawing(double cash) {
        balance = balance - cash;
        return balance;
    }

    public double replenishment(double cash) {
        balance = balance + cash;
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}

class Car { //      3 завдання для класів
    private String carBrand = "Toyota Cruiser 200";
    private int enginePower = 309;
    private int fuelTankCapacity = 93;

    public void start() {
        System.out.println("The car started");
    }

    public void finish() {
        System.out.println("The car turned off");
    }

    public void fuelSupply() {
        System.out.println("Fuel was given to the car");
    }

    public String getCarBrand() {
        return carBrand;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }
}

class Product { //      4 завдання для класів
    private String nameOfProduct;
    private double price;
    private int count;

    public Product(String nameOfProduct, double price, int count) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.count = count;
    }

    public double totalPrice() {
        return price * count;
    }

    public void changeCount(int newCount) {
        if (newCount >= 0) {
            count = newCount;
        } else {
            System.out.println("Count can't be a negative");
        }
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}


