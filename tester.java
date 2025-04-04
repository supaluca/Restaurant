import java.util.*;
public class tester {
    public static void main (String[] args){
        ArrayList<String> waiters = {"Sam", "Don", "Peter", "Kiera"};
        ArrayList<Boolean> tables = {false, false, false, false, true, false, true, false};
        
        Restaurant Bobs = new Restaurant("Bobs", "Cafe", false);
        Restaurant Mimis = new Restaurant("Mimi's Burgers", "Burger Place", false);
        Restaurant Luigis = new ItalianRestaurant("Luigis", "Rome", 3, true);
        Restaurant Gios = new ItalianRestaurant("Giovannis", "Northern", 1, false);
        Restaurant garden1 = new OliveGarden(200, waiters, tables);
        Restaurant garden2 = new OliveGarden(50, waiters, tables);
        Restaurant Moes = new Restaurant("Moe's Southwest Grill ", "Mexican", true);
        Restaurant Panera = new Restaurant("Panera Bread", "Deli", true);
        Restaurant Marios = new ItalianRestaurant("Famiglia", "Tuscany", 5, true);
    }
}
