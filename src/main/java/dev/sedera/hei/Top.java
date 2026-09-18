package dev.sedera.hei;


public class Top extends Clothing {
    private String sleeves;

    public Top(String name, String size, double unitPrice, String material, String sleeves) {
        super(name, size, unitPrice, material);
        this.sleeves = sleeves;
    }

    public String getSleeves() { return sleeves; }

    @Override
    public String toString() {
        return super.toString() + " | Sleeves: " + sleeves;
    }

}