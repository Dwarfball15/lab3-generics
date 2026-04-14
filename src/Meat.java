public class Meat extends Cooking implements Comparable<Meat> {
    public String type;
    public int protein;

    Meat(){}

    public Meat(String nameFood, int calories, String type, int protein){
        super(nameFood, calories);
        this.type = type;
        this.protein = protein;
    }

    // Compare Meat objects by calories (ascending)
    @Override
    public int compareTo(Meat other) {
        return Integer.compare(this.calories, other.calories);
    }

    @Override
    public String toString(){
        return "Name: " + nameFood + " | Cals: " + calories +
                " | Type: " + type + " | Protein: " + protein + "g";
    }
}