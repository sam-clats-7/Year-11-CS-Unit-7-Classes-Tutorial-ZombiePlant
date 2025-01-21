public class ZombiePlant {

    private int maxPotency;
    private int treatmentsNeeded;
    public ZombiePlant(int maxPotency, int treatmentsNeeded) {
        this.maxPotency = maxPotency;
        this.treatmentsNeeded = treatmentsNeeded;
    }

    public int getPotency() {
        return maxPotency;
    }

    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }

    public boolean isDangerous() {
        return treatmentsNeeded > 0;
    }

    public void treat(int potency) {
        if (potency <= 0) {
            // Treatments with potency <= 0 should have no effect
            return;
        }
        if (treatmentsNeeded > 0) {
            if (potency <= maxPotency) {
                // Successful treatment reduces treatmentsNeeded count
                treatmentsNeeded--;
            } else {
                // Failed treatment increases treatmentsNeeded count
                treatmentsNeeded++;
            }
        } else if (potency > maxPotency) {
            treatmentsNeeded = 1;
        }
    }

}