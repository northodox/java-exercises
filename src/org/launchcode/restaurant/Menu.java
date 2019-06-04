package org.launchcode.restaurant;

import java.util.ArrayList;
import java.util.Date;
import org.launchcode.restaurant.MenuItem;


public class Menu {

    private ArrayList<MenuItem> fullMenu;
    private Date lastUpdated;

    public Menu() {
        this.fullMenu = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    public ArrayList<MenuItem> getItems() {
        return fullMenu;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    private void setLastUpdated(Date newDate) {
        this.lastUpdated = newDate;
    }

    public boolean addItem(MenuItem m) {
        if (!this.fullMenu.contains(m)){
            this.fullMenu.add(m);
            return true;
        }
        return false;
    }

    public boolean removeItem(MenuItem m) {
        if (!this.fullMenu.contains(m)){
            this.fullMenu.remove(m);
            return true;
        }
        return false;
    }

    public static String isMenuNew(Menu m) {
        if(m.getLastUpdated().before(new Date())) {
            return "Menu is old, like fossils!";
        }
        return "This is a new menu, fresh!";
    }

    public String printMenu(Menu m) {
        for (MenuItem x : fullMenu) {
                System.out.print(MenuItem.printItem(x));
            }
        return("This menu lacks items!");
        }

    public static void main(String[] args) {
        Menu newMenu = new Menu();
        MenuItem borscht = new MenuItem("Borscht", 5.99, "Some sort of tomato soup I think","Side");
        MenuItem naan = new MenuItem("Naan",3.99, "Flaky, buttery, delicious bread","Appetizer");
        newMenu.addItem(naan);
        newMenu.addItem(borscht);
        newMenu.printMenu(newMenu);
        //System.out.print(isMenuNew(newMenu));
    }
}