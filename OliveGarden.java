import java.util.*;
public class OliveGarden extends ItalianRestaurant{
    private int numBreadsticks;
    private String soupOfDay;
    private ArrayList<String> waiters;
    private ArrayList<Boolean> table;

    public OliveGarden(){
        
    }
    public OliveGarden(int b, ArrayList<String> w, ArrayList<Boolean> t){
        super("Olive Garden", "South", 950, true);
        numBreadsticks = b;
        soupOfDay = "Minestrone";
        waiters = w;
        table = t;
    }

    public int getBreadsticks(){
        return numBreadsticks;
    }

    public void changeBread(int n){
        numBreadsticks = n;
    }

    public String soup(){
        return soupOfDay;
    }


    public ArrayList<String> getWaiters(){
        return waiters;
    }

    public void tableTaken(int n){
        table.set(n, true);
    }

    public String toString(){
        return super.toString() + ". We have " + numBreadsticks +" homemade and buttery unlimited breadsticks.";
    }

    public boolean equals(OliveGarden o){
        return super.equals(o);
    }

    public boolean seated(int n){
        return table.get(n);
    }

    public void changeSoup(){
        if (soupOfDay.equals("Minestrone")){
            soupOfDay = "Zuppa Toscana";
        }
        else if (soupOfDay.equals("Zuppa Toscana")){
            soupOfDay = "Minestrone";
        }
    }







    
}
