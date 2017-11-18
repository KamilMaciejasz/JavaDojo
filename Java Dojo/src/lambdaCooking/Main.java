package lambdaCooking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Recipe> list = new LinkedList<>();

        list.add(new Recipe(List.of(new Ingredient("Stek", false)), 2));
        list.add(new Recipe(List.of(new Ingredient("Stek", false),
                 new Ingredient("Mayo", true)), 3));
        list.add(new Recipe(List.of(new Ingredient("Potatoes", true),
                new Ingredient("Cheese", true)), 5));
        list.add(new Recipe(List.of(new Ingredient("Potatoes", true),
                new Ingredient("Cheese", true),
                new Ingredient("Onion", true)),8));
        list.add(new Recipe(List.of(new Ingredient("Potatoes", true),
                new Ingredient("Chicken", false),
                new Ingredient("Onion", true)), 10));

        /* Getting average cooking time of vegetarian recipes. Could be done better by creating an averager class
        so that you can store total number of additions. */

        int vegetarianCookingTime = list.stream().filter((recipe) -> recipe.isVegetarian(recipe.getIngredients()))
                     .map((recipe) -> recipe.getPreperationTime())
                     .reduce(0, Integer::sum);
        System.out.println( (double) vegetarianCookingTime /
                list.stream().filter((recipe) -> recipe.isVegetarian(recipe.getIngredients()))
                        .count());

    }
}
