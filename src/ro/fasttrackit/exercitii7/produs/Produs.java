package ro.fasttrackit.exercitii7.produs;

public class Produs {
    String name;
    double price;
    int quantity;
    String category;

    Produs(String name, double price, int quantity, String category){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.category=category;
    }
    public String getName(){
        return name;
    }

    public String getCategory(){
       return category;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public boolean hasStock(){
        return quantity > 0;
    }

    public boolean isCategory(String category){
        return this.category.equals(category);
    }

    public void printDetails(){
        System.out.println("Name-- "+name+" --Price-- "+price+" --Quantity-- " + quantity+" --Category-- "+category);
    }
}



