import java.util.ArrayList;

public class ItalianRestaurant extends Restaurant {
    private String region;
    private int locations;
    private boolean chain;
    private ArrayList<String> menu;
    private int meatballs;
    private ArrayList<String> bill;

    public ItalianRestaurant(){
        region = "";
        locations = 0;
        chain = false;
        menu = null;

    }

    public ItalianRestaurant(String n, String r, int l, boolean c){
        super(n, "Italian", c);
        menu.add("Spaghetti and Meatballs");
        menu.add("Baked Ziti");
        menu.add("Lasagna"); 
        menu.add("Salad");
        menu.add("Mozzarella Sticks");
        region = r;
        
        
        locations = l;
        chain = c;

    }

    public String getRegion(){
        return region;
    }

    public int numLocations(){
        return locations;
    }

    public boolean isChain(){
        return chain;
    }

    public void changeLocos(int n){
        locations = n;
    }

    public void changeRegion(String s){
        region = s;
    }

    public void changeMenu(int t){
        menu.remove(t);
    }

    public void open(){
        super.open();
    }

    public String toString(){
        return super.toString() + " They sell " + menu;
    }

    public boolean equals(ItalianRestaurant r){
        return super.equals(r);
    }

    public void makeMeatball(){
        meatballs++;
    }

    public ArrayList<String> getBill(){
        return bill;
    }

    public void addBill(int n){
        bill.add(menu.get(n));
    }
    

    
}
