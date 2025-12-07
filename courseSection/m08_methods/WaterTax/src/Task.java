public class Task {
    public static void main(String[] args) {

        System.out.println(waterTax(55));

    }

    public static double waterTax(int units){

        //Write your solution here
        double bill;

        if (units <= 50) {
            bill = units * 0.60;
        } else {
            bill = units * 0.90;

            if (units > 150) {
                bill += 100;
            } else if (units > 100) {
                bill += 50;
            }
        }

        return bill;


    }


}