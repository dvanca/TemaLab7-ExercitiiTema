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
    String getName(){
        return name;
    }

    String getCategory(){
       return category;
    }

    double getPrice(){
        return price;
    }

    int getQuantity(){
        return quantity;
    }

    boolean hasStock(){
        return quantity > 0;
    }

    boolean isCategory(String category){
        return this.category.equals(category);
    }

    void printDetails(){
        System.out.println("Name-- "+name+" --Price-- "+price+" --Quantity-- " + quantity+" --Category-- "+category);
    }
}



