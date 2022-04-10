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

    boolean hasLiquid() {
        return availableLiquid > 0;
    }

    int howMuchLiquid() {
        return availableLiquid;
    }

    int emptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    boolean isOpen() {
        return open;
    }

    void closeBottle() {
        if (!this.open) {
            System.out.println("Sticla este inchisa");
            return;
        }
        this.open = false;
        System.out.println("Sticla a fost inchisa");
    }

    void openBottle() {
        if (this.open) {
            System.out.println("Sticla este deschisa");
        } else {
            this.open = true;
            System.out.println("Sticla a fost deschisa");
        }

    }

    void drinkLiquid(int quantity) {
        if (isOpen()) {
            availableLiquid = availableLiquid - quantity;
            System.out.println("S-au consumat " + quantity + " ml");
        } else {
            System.out.println("Sticla este inchisa");
        }

    }
}
