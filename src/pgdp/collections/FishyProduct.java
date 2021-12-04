package pgdp.collections;

public class FishyProduct {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public FishyProduct(final String name, final int price) {
        if(name != null) this.name = name;
        if(price > 0) this.price = price;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("new FishyProduct (" + '"');
        builder.append(getName()).append(", ");
        builder.append(getPrice()).append('"' + ")");
        return super.toString();
    }
}
