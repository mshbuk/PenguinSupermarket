package pgdp.collections;

public class PenguinCustomer {
    private String name;
    private int money;
    private Stack<FishyProduct> products;


    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public Stack<FishyProduct> getProducts() {
        return products;
    }

    public PenguinCustomer(final String name, int availableMoney, Stack<FishyProduct> productsInTheCart) {
        if (name != null) this.name = name;
        if (availableMoney > 0) this.money = availableMoney;
        this.products = productsInTheCart;
    }

    public void addProductToBasket(FishyProduct item) {
        products.push(item);
    }

    public void placeAllProductsOnBand(Queue<FishyProduct> band) {
        DataStructureLink<FishyProduct> newBand;
        //while(!(productsInTheCart.isEmpty())) {
        //   FishyProduct item = productsInTheCart.pop();
        //   band.enqueue(item);
        //}
    }

    public void takeAllProductsFromBand(Queue<FishyProduct> band) {
        //  while(!band.isEmpty()) {
        //     FishyProduct item = band.dequeue();
       // productsInTheCart.push(item);
    }



    public int pay(int price) {
        if (price > 0 && money > 0)
            money = money - price;
        return money;
    }

    @Override
    public String toString() {
        return "PenguinCustomer " + name + ", " + money + ", " + products;
    }
}
