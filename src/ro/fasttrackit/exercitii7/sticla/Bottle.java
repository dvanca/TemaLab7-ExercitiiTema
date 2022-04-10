package ro.fasttrackit.exercitii7.sticla;

public class Bottle {
    int totalCapacity;
    int availableLiquid;
    boolean open;

    Bottle(int totalCapacity, int availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;

    }

    public boolean hasLiquid() {
        return availableLiquid > 0;
    }

    public int howMuchLiquid() {
        return availableLiquid;
    }

    public int emptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public boolean isOpen() {
        return open;
    }

    public void closeBottle() {
        if (!this.open) {
            System.out.println("Sticla este inchisa");
            return;
        }
        this.open = false;
        System.out.println("Sticla a fost inchisa");
    }

    public void openBottle() {
        if (this.open) {
            System.out.println("Sticla este deschisa");
        } else {
            this.open = true;
            System.out.println("Sticla a fost deschisa");
        }

    }

    public void drinkLiquid(int quantity) {
        if (isOpen()) {
            availableLiquid = availableLiquid - quantity;
            System.out.println("S-au consumat " + quantity + " ml");
            return;
        } else {
            System.out.println("Sticla este inchisa");
        }

    }
}
