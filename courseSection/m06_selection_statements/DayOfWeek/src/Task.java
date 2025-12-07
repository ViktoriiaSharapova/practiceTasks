public class Task {
    public static void main(String[] args) {

        int day = 1;

        // ----Do not change below lines. needed for testing---
        day = args.length > 0 ? Integer.parseInt(args[0]) : day;
        //--------------------------------

        //Write your solution here
        String dayName;

        switch (day) {
            case 1:  dayName = "Monday"; break;
            case 2:  dayName = "Tuesday"; break;
            case 3:  dayName = "Wednesday"; break;
            case 4:  dayName = "Thursday"; break;
            case 5:  dayName = "Friday"; break;
            case 6:  dayName = "Saturday"; break;
            case 7:  dayName = "Sunday"; break;
            default: dayName = "Invalid day";
        }

        System.out.println(dayName);
    }String dayName;
}