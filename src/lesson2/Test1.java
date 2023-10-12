package lesson2;

import java.util.*;

public class Test1 {


    public static void main(String[] args) {
//        for (int i = 1; i <=5; i ++){
//            System.out.println();
//            continue;
//
//        }
//        Random random = new Random();
//        int num;
//        while (true){
//            num = random.nextInt(100);
//            System.out.println("number: " + num);
//            if (num > 90){
//                break;
//            }
//        }
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        }
//        while (i <=5);
//        Scanner scanner = new Scanner(System.in);
//        int num = 1;
//        do{
//            System.out.println("enter");
//            num = scanner.nextInt();
//            System.out.println("you have entered " + num);

//        }
//        while (num != 0);
//        int [] numbers = {1,2,3,4,5};
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("World");
//        for (String word : list) {
//            System.out.println(word);
//        }
//        int [] numsArray = {1,2,3,4,5};
//        int [] copyArray = new int[numsArray.length];
//        for (int i = 0; i < numsArray.length; i++) {
//        }
//        System.out.println(Arrays.toString(copyArray));

//        outer:
////        for (int i = 0; i < 5; i++) {
////            for (int j = 0; j < 5; j++) {
////                if (i == 2 && j ==2 );
////                break outer;
////            }
////        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word1 = scanner.next();
        System.out.println("Your word is " + word1);

        scanner.nextLine();

        System.out.println("Enter new word: ");
        String word2 = scanner.next();
        System.out.println("Your word is " + word2);


    }
}

