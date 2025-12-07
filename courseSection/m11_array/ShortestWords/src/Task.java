import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestWords("olive, fish, pursuit, old, warning, python, java, coffee, cat, ray")));
        System.out.println(Arrays.toString(shortestWords("spare, decrease, morning, article, chaos, orbit, acceptance, lodge, tournament, trade")));
    }

    public static String[] shortestWords(String str){

        //Write your solution here
        String[] words = str.split(", ");

        int minLength = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < minLength) {
                minLength = words[i].length();
            }
        }

        int count = 0;
        for (String w : words) {
            if (w.length() == minLength) {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;
        for (String w : words) {
            if (w.length() == minLength) {
                result[index++] = w;
            }
        }
        return result;
    }

}