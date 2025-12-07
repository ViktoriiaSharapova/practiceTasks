
public class Task {
    public static void main(String[] args) {
        System.out.println(wordCount("one two three"));
        System.out.println(wordCount("foo bar"));
    }

    public static int wordCount(String words) {

        //Write your solution here
        if (words == null || words.trim().isEmpty()) {
            return 0;
        }
        String[] splitWords = words.trim().split("\\s+");
        return splitWords.length;
    }

}