public class Task {
    public static void main(String[] args) {

        int age = 25;

        // ----Do not change below lines. needed for testing---
        age = args.length > 0 ? Integer.parseInt(args[0]) : age;
        //--------------------------------

        //Write your solution here
        if (age < 3) {
            System.out.println("ineligible");
        } else if (age >= 3 && age <= 4) {
            System.out.println("preschool");
        } else if (age == 5) {
            System.out.println("kindergarten");
        } else if (age >= 6 && age <= 10) {
            System.out.println("elementary school");
        } else if (age >= 11 && age <= 13) {
            System.out.println("middle school");
        } else if (age >= 14 && age <= 18) {
            System.out.println("high school");
        } else {
            System.out.println("college");
        }
    }
}