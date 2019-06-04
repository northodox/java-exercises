package org.launchcode.restaurant;

import java.util.ArrayList;
import java.util.Date;


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


    public static void main(String[] args) {
        Menu newMenu = new Menu();
        System.out.print(isMenuNew(newMenu));
    }
}