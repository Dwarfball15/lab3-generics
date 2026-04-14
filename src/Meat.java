public class Meat extends Cooking {
    public String type;
    public int protein;

    Meat(){}


    public Meat(String nameFood, int calories, String type, int protein ){
        super (nameFood, calories);
        this.type = type;
        this.protein = protein;

    }
    public String toString(){
        return "Name: " + nameFood + " cals: " + calories + " Type: " + type + " Protein: " + protein;
    }

}
