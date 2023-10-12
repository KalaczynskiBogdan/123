package lesson3;

public class Test2 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(" world!");
        stringBuffer.insert(5," Java");
        stringBuffer.delete(5,10);
        String result = stringBuffer.toString();
        System.out.println(result);

        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.append(" world!");
        stringBuilder.insert(5," Java");
        stringBuilder.delete(5,10);
        String result2 = stringBuilder.toString();
        System.out.println(result2);

    }
}
