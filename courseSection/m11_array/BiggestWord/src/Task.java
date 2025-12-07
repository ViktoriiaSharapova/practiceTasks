
public class Task {
    public static void main(String[] args) {
        System.out.println(longestWord(new String[]{"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"}));
        System.out.println(longestWord(new String[]{"five5", "six666", "one1111111111111", "2two", "four4444"}));
    }

    public static String longestWord(String[] words){

        //Write your solution here
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        return longest;
    }
}
