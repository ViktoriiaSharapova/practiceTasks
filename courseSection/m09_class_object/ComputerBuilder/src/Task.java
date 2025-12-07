import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double totalPrice = 0;

        System.out.println("Select the screen size");
        double screenSize = input.nextDouble();

        //Add cost to totalPrice based on screenSize
        if (screenSize == 13.3) {
            totalPrice += 200;
        } else if (screenSize == 15.0) {
            totalPrice += 300;
        } else if (screenSize == 17.3) {
            totalPrice += 400;
        }

        System.out.println("Select CPU type");
        String cpu = input.next();

        //Add cost to totalPrice based on cpu
        switch (cpu) {
            case "i5":
                totalPrice += 250;
                break;
            case "i7":
                totalPrice += 350;
                break;
            case "i3":
                totalPrice += 150;
                break;
        }

        System.out.println("Select RAM size");
        int ram = input.nextInt();

        //Add cost to totalPrice based on ram
        totalPrice += (ram / 4) * 50;

        System.out.println("Select storage type");
        String storageType = input.next();

        System.out.println("Select storage amount");
        int storageAmount = input.nextInt();

        //Add cost to totalPrice based on storageType and storageAmount
        if (storageType.equals("HDD")) {
            totalPrice += (storageAmount / 500) * 50;
        } else if (storageType.equals("SSD")) {
            totalPrice += (storageAmount / 500) * 100;
        }
        System.out.println("Select screen resolution:");
        String resolution = input.next();

        //Add to totalPrice based on resolution
        switch (resolution) {
            case "FULLHD":
                totalPrice += 100;
                break;
            case "4K":
                totalPrice += 200;
                break;
        }

        System.out.println("Final price is: $" + totalPrice);


    }
}