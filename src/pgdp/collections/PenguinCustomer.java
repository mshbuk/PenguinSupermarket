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
        QueueConnector<FishyProduct> queueBand = new QueueConnector<>(band);
        StackConnector<FishyProduct> stackCart = new StackConnector<>(products);
        DataStructureLink<FishyProduct> newBand = new DataStructureLink<>(stackCart,queueBand);
        newBand.moveAllFromAToB();

    }

    public void takeAllProductsFromBand(Queue<FishyProduct> band) {
        QueueConnector<FishyProduct> queueBand = new QueueConnector<>(band);
        StackConnector<FishyProduct> stackCart = new StackConnector<>(products);
        DataStructureLink<FishyProduct> newBand = new DataStructureLink<>(queueBand, stackCart);
        newBand.moveAllFromAToB();
    }

    public void pay(int price) {
        if (price > 0 && money > 0)
            money = money - price;
    }

    @Override
    public String toString() {
        return "new PenguinCustomer (" + '"' + name + '"' + ", " + money + ", " + products + ")";
    }
}
