package dev.sedera.hei;

public class Bottom extends Clothing {
    private int waistSize;

    public Bottom(String name, String size, double unitPrice, String material, int waistSize) {
        super(name, size, unitPrice, material);
        this.waistSize = waistSize;
    }

    public int getWaistSize() { return waistSize; }

    @Override
    public String toString() {
        return super.toString() + " | Waist: " + waistSize;
    }
}
