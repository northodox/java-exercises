package org.launchcode.restaurant;

public class MenuItem {

    private	double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
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

    public boolean isNew() {
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
        return "Name: " + singleItem + "; Description: " + singleItem.getDescription() + "; Price: " + singleItem.getPrice();
    }

    public static void main(String[] args) {
        MenuItem naan = new MenuItem(3.99, "Flaky, buttery, delicious bread","Appetizer");
        System.out.print(printItem(naan));
    }
}