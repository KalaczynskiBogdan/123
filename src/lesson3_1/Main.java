package lesson3_1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        OneMore oneMore = new OneMore();
        int age = person.getAge(oneMore);
        System.out.println(age);
    }
}
