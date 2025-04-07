import java.util.*;
public class tester {
    public static void main (String[] args){
        ArrayList<String> waiters = new ArrayList<String>();
        waiters.add("Sam");
        waiters.add("Don");
        waiters.add("Peter");
        waiters.add("Kiera");
        ArrayList<Boolean> tables = new ArrayList<Boolean>();
        tables.add(false);
        tables.add(false);
        tables.add(false);
        tables.add(true);
        tables.add(true);
        tables.add(false);
        tables.add(false);

        ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();

        Restaurant Bobs = new Restaurant("Bobs", "Cafe", false);
        Restaurant Mimis = new Restaurant("Mimi's Burgers", "Burger Place", false);
        Restaurant Gios = new ItalianRestaurant("Giovannis", "Northern", 1, false);
        Restaurant garden1 = new OliveGarden(200, waiters, tables);
        Restaurant garden2 = new OliveGarden(50, waiters, tables);
        Restaurant Moes = new Restaurant("Moe's Southwest Grill ", "Mexican", true);
        Restaurant Marios = new ItalianRestaurant("Famiglia", "Tuscany", 5, true);
        Restaurant Tosias = new Restaurant("Tosia's Polish Mart", "Polish Cuisine", true);

        Restaurant Bens = Marios;
        Restaurant Chipotle = Moes;

        restaurants.add(Bobs);
        restaurants.add(Mimis);
        restaurants.add(Gios);
        restaurants.add(garden1);
        restaurants.add(garden2);
        restaurants.add(Moes);
        restaurants.add(Marios);
        restaurants.add(Tosias);
        restaurants.add(Bens);
        restaurants.add(Chipotle);





    }
}
