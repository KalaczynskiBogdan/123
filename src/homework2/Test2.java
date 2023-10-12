package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Enter your text"); // 1 завдання з зірочкою для foreach
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] array = text.toCharArray();
        int count = 0;
        for (char c : array) {
            System.out.println(c);
            count++;
        }
        System.out.println("Загальна кількість символів в рядку '" + text + "' - " + count);

        int [] array1 = {1,2,3,4,5}; //2 завдання з зірочкою для arrays
        int [] array2 = {4,2,5,7,9};
        int lengthOfArray = array1.length + array2.length;
        int [] newArray = new int[lengthOfArray];
        for (int i = 0; i < array1.length; i++){
            newArray[i] = array1[i];
        }
        for(int i = 0; i < array2.length; i++){
            newArray[array1.length + i] = array2[i];
        }
        System.out.println("New array: "+ Arrays.toString(newArray));
        for (int i = 0; i < newArray.length; i++){
            for (int j = i +1 ; j < newArray.length; j++){
                int x;
                if (newArray[j] < newArray[i]){
                    x = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = x;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));

        int[] array3 = {1, 2, 3, 2, 1, 5, 3, 5, 7 ,8, 9}; //3 завдання з зірочкою для arrays
        for (int i = 0; i < array3.length; i++) {
            for (int j = i + 1; j < array3.length; j++) {
                if (array3[i] == array3[j]) {
                    System.out.println("Це число повторюється: " + array3[j]);
                }
            }
        }
    }

}
