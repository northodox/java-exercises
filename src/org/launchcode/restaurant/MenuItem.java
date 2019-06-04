package org.launchcode.restaurant;

import java.util.Objects;

public class MenuItem {

    private String name;
    private	double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean getIsNew() {
        return isNew;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setNew(boolean aNew) {
        isNew = aNew;
    }

    public static String printItem(MenuItem singleItem) {
        return "Name: " + singleItem.name + "; Description: " + singleItem.getDescription() + "; Price: " + singleItem.getPrice() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static boolean areItemsEqual(MenuItem firstItem, MenuItem secondItem) {
        if (firstItem.equals(secondItem)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MenuItem naan = new MenuItem("Naan",3.99, "Flaky, buttery, delicious bread","Appetizer");
        MenuItem borscht = new MenuItem("Borscht", 5.99, "Some sort of tomato soup I think","Side");
        System.out.print(printItem(naan));
        //System.out.print(areItemsEqual(naan, borscht));
    }
}