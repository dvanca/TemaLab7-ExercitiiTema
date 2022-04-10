package ro.fasttrackit.exercitii7.produs;

public class Main {
    public static void main(String[] args) {
        Produs a = new Produs("Coca Cola", 2.73, 200, "Bauturi Carbogazoase");
        Produs b = new Produs("Paine pe Vatra", 1.99, 38, "Panificatie");
        Produs c = new Produs("Jeleu", 1.7, 20, "Dulciuri");
        Produs d = new Produs("Ciocolata", 3, 0, "Dulciuri");
        Produs e = new Produs("Corn", 5.7, 12, "Panificatie");
        Produs f = new Produs("Fanta", 2.75, 200, "Bauturi Carbogazoase");
        a.printDetails();
        f.printDetails();
        System.out.println(a.getName());
        System.out.println(a.getPrice());
        System.out.println(a.getCategory());
        System.out.println(a.getQuantity());
        System.out.println(d.hasStock());
        System.out.println(a.isCategory("Bauturi Carbogazoase"));

    }
}
