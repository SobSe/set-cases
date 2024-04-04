import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        reverseString();
        rearrangingNumbers();
        rearrangingNumbersUseThird();
        countWords("java java c++ python");
    }

    public static void reverseString() {
        String string = "попо";
        System.out.println(string);
        char[] chars = string.toCharArray();
        chars = reversChars(chars);
        System.out.println(String.valueOf(chars));
    }

    public static char[] reversChars(char[] chars) {
        for (int i = 0; i < chars.length / 2; i++) {
            char buff = chars[i];
            chars[i] = chars[chars.length - (i + 1)];
            chars[chars.length - (i + 1)] = buff;
        }
        return chars;
    }

    public static void rearrangingNumbers() {
        int a = 5;
        int b = 7;
        System.out.printf("a = %d b = %d\n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("a = %d b = %d\n", a, b);
    }

    public static void rearrangingNumbersUseThird() {
        int a = 5;
        int b = 7;
        System.out.printf("a = %d b = %d\n", a, b);
        int c = a;
        a = b;
        b = c;
        System.out.printf("a = %d b = %d\n", a, b);
    }

    public static void countWords(String string) {
        Map<String, Integer> solution = new HashMap<>();
        String[] words = string.split(" ");
        for (String word : words) {
            solution.put(word, solution.getOrDefault(word, 0) + 1);
        }
        System.out.println(solution);
    }
}
