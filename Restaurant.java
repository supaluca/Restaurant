import java.util.*;
public class Restaurant{
    private String name; 
    private String type;
    private boolean operational;
    private ArrayList<String> waiters;
    private boolean chain;
    public Restaurant(){

    }

    public Restaurant (String n, String t, boolean c){
        name = n;
        type = t;
        chain = c;
        
    }

   
    public String getName(){
        return name;
    }


    public void close(){
        operational = false;
    }

    public void open(){
        operational = true;
    }

    public String waiterOn(int i){
        return waiters.get(i);
    }

    public String toString(){
        return "The name of the restuarant is " + name + ".";
    }

    public boolean equals(Restaurant r){
        return name.equals(r.getName());

    }

    
}