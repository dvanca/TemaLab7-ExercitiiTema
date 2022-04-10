package ro.fasttrackit.exercitii7.persoana;

public class Main {
    public static void main(String[] args) {
        Persoana a = new Persoana("Marcela", 34, true);
        Persoana b = new Persoana("Ion", 24, false);
        Persoana c = new Persoana("Cucu", 44, false);
        a.printDetails();
        b.printDetails();
        c.printDetails();

        a.setAge(24);
        a.printDetails();
        a.setName("Joiana");
        System.out.println(a.getName());
        a.printDetails();
    }
}
