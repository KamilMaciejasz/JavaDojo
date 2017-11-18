package lambdaCooking;

public class Ingredient {

    private String name;
    private Boolean isVegetarian;

    Ingredient(String name, Boolean isVegetarian){
        this.name = name;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public Boolean getVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public void setName(String name) {
        this.name = name;
    }


}
