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
        if(name == null || price < 0)
            ExceptionUtil.illegalArgument("Not allowed");
            this.name = name;
            this.price = price;

    }

    @Override
    public String toString() {
       return "new FishyProduct (" + '"' + getName() + ", " + getPrice() + '"' + ")";
    }
}
