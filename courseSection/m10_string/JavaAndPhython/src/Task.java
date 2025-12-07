
public class Task {
    public static void main(String[] args) {
        System.out.println(sameCount("We study java not python"));
        System.out.println(sameCount("What's the difference between java, javascript and python?"));
        System.out.println(sameCount("java python hello python world python"));

    }

    public static boolean sameCount(String str) { // We study java not python

        int java = 0;
        int python = 0;
        int length = str.length();
        //Write your solution here
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - 4 && str.substring(i, i + 4).equals("java")) {
                java++;
            }
            if (i <= str.length() - 6 && str.substring(i, i + 6).equals("python")) {
                python++;
            }
        }
                return java == python;
    }
}