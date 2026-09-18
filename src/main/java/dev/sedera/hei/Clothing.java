package dev.sedera.hei;
public abstract class Clothing
{
    private String name;
    private String size;
    private double unitPrice;
    private String material;

    public Clothing(String name, String size, double unitPrice, String material) {
        this.name = name;
        this.size = size;
        this.unitPrice = unitPrice;
        this.material = material;
    }
    public String getName() { return name; }
    public String getSize() { return size; }
    public double getUnitPrice() { return unitPrice; }
    public String getMaterial() { return material; }

    @Override
    public String toString() {
        return name + " (" + size + ", " + material + ") - $" + unitPrice;
    }

}
