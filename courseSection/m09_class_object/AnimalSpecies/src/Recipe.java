public class Recipe {

    //Write your solution here
    String name;
    String ingredients;
    int servingSize;
    double cost;

    public double costPerPerson() {
        return cost / servingSize;
    }

    public String toString() {
        return "Recipe for " + name + " will require these ingredients:\n" +
                ingredients + "\n" +
                "This dish will serve " + servingSize + " and cost a total of $ " + cost;
    }
}



