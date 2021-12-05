package pgdp.collections;

public class PenguinCustomer {
   private String name;
    private int availableMoney;
    private Stack<FishyProduct> productsInTheCart;

    public String getName() {
        return name;
    }

    public int getAvailableMoney() {
        return availableMoney;
    }

    public Stack<FishyProduct> getStack() {
        return productsInTheCart;
    }

    public PenguinCustomer(final String name, int availableMoney, Stack<FishyProduct> productsInTheCart) {
        if(name != null) this.name = name;
        if(availableMoney > 0) this.availableMoney = availableMoney;
        this.productsInTheCart = productsInTheCart;
    }

    public void addProductToBasket(FishyProduct item) {
        productsInTheCart.push(item);
    }

    public void placeAllProductsOnBand(Queue<FishyProduct> band) {
    while(!(productsInTheCart.isEmpty())) {
        FishyProduct item = productsInTheCart.pop();
         band.enqueue(item);
    }
    }

    public void takeAllProductsFromBand(Queue<FishyProduct> band) {
        while(!band.isEmpty()) {
            FishyProduct item = band.dequeue();
            productsInTheCart.push(item);
        }
    }

    public void pay(int price) {
        if(price > 0 && availableMoney > 0)
    availableMoney = availableMoney - price;
    }

    @Override
    public String toString() {
        return "PenguinCustomer " + name + ", " + availableMoney + ", " + productsInTheCart;
    }
}
