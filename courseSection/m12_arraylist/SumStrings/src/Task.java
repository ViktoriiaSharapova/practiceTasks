import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        System.out.println("getSum([\"123\", \"34\", \"513\"]) -> " + getSum(new ArrayList<>(Arrays.asList("123", "34", "513"))));
        System.out.println("getSum([\"4913\", \"1248\"]) -> " + getSum(new ArrayList<>(Arrays.asList("4913", "1248"))));
        System.out.println("getSum([\"00110101\", \"12452\", \"3111\"]) -> " + getSum(new ArrayList<>(Arrays.asList("00110101", "12452", "3111"))));

    }

    public static ArrayList<Integer> getSum(ArrayList<String> digits) {

        //Write your solution here
        ArrayList<Integer> result = new ArrayList<>();

        for (String str : digits) {
            int sum = 0;

            for (char ch : str.toCharArray()) {
                sum += ch - '0';   // convert digit character to int
            }
            result.add(sum);
        }
        return result;
    }

}