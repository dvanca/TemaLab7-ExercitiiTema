package ro.fasttrackit.exercitii7.sticla;

public class Main {
    public static void main(String[] args) {
        Bottle a = new Bottle(2000, 1200, true);
        Bottle b = new Bottle(4000, 3200, false);

      /*  System.out.println(a.hasLiquid());
        System.out.println(a.howMuchLiquid());
        System.out.println(a.emptyCapacity());
        System.out.println(a.isOpen());
        a.openBottle();
        System.out.println(a.isOpen());*/
        System.out.println(b.isOpen());
        b.emptyCapacity();
        b.openBottle();
        b.closeBottle();
        b.closeBottle();
        System.out.println(b.hasLiquid());
        System.out.println(b.howMuchLiquid());
        b.drinkLiquid(1000);
        System.out.println(b.howMuchLiquid());

    }
}
