package lesson3;

import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
        String t1 = "1234";
        String t2 = new String("3.13");

        char charFromText = t1.charAt(1);
        System.out.println(charFromText);

        String t3 = t1 + t2;
        String t4 = t1.concat(t2);
        String t5 = t1.concat("").concat(t3);
        System.out.println(t3);

        boolean isEqual = t1.equals(t2);
        System.out.println(isEqual);

        int number1 = Integer.parseInt(t1);
        double number2 = Double.parseDouble(t2);
        System.out.println(number1 + number2);

        String text1 = "Hello, how are you?";
        StringTokenizer tokenizer = new StringTokenizer(text1);

        while (tokenizer.hasMoreTokens()){
            String test = tokenizer.nextToken();
            System.out.println(test);
        }
    }
}
