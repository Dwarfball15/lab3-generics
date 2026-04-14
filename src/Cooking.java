public class Cooking {
    public String nameFood;
    public int calories;

    Cooking(){
    }

    public Cooking(String nameFood, int calories){
        this.nameFood = nameFood;
        this.calories = calories;
    }

    public String toString(){
        return "Dinner is " + this.nameFood + ", cals are " + this.calories;
    }
}


