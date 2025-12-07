
public class Task {
    public static void main(String[] args) {
        System.out.println(countLetters("aaabbcccc"));
        System.out.println(countLetters("appleeess"));
    }

    public static String countLetters(String str) {

        String result = "";
        //Write your solution here
        boolean[] counted = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (!counted[i]) {
                char current = str.charAt(i);
                int count = 1;
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == current) {
                        count++;
                        counted[j] = true;
                    }
                }
                result += count + "" + current;
            }
        }

        return result;
    }
}