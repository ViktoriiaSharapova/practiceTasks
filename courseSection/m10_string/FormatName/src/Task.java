
public class Task {
    public static void main(String[] args) {
        System.out.println(fixFormat("CADEN ARROYO"));
        System.out.println(fixFormat("jaX wOLF"));
    }

    public static String fixFormat(String name) {

        //Write your solution here
        String[] words = name.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                String first = word.substring(0, 1).toUpperCase();
                String rest = word.substring(1).toLowerCase();
                result.append(first).append(rest).append(" ");
            }
        }

        return result.toString().trim();



    }

}