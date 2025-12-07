
public class Task {
    public static void main(String[] args) {
        System.out.println(averageTemperature(new double[]{80.0, 88.0, 88.0, 84.0, 82.0, 78.0, 60.0, 68.0}));

    }

    public static double averageTemperature(double[] temps){

        //Write your solution here
        double sum = 0;

        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }

        return sum / temps.length;
    }



}
