package lambdaCooking;

import java.util.List;

public class Recipe {

    Recipe(List<Ingredient> list, int time){
        this.ingredients = list;
        preperationTime = time;
    }

    private List<Ingredient> ingredients;
    private int preperationTime;

    public int getPreperationTime() {
        return preperationTime;
    }

    public void setPreperationTime(int preperationTime) {
        this.preperationTime = preperationTime;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Boolean isVegetarian(List<Ingredient> list){ // my masterpiece to check if recipe is vegetarian
        return list.stream().filter((ingredient) -> ingredient.getVegetarian())
                .count() == list.size();
    }

}
