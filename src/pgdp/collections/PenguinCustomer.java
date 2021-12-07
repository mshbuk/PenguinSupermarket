package pgdp.collections;

public class PenguinCustomer {
    private final String name;
    private int money;
    private final Stack<FishyProduct> products = new LinkedStack<>();

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public Stack<FishyProduct> getProducts() {
        return products;
    }

    public PenguinCustomer(String name, int money) {
        if (name == null || money < 0) {
            ExceptionUtil.illegalArgument("Not allowed");
        }
        this.name = name;
        this.money = money;
    }

    public void addProductToBasket(FishyProduct item) {
        products.push(item);
    }

    public void placeAllProductsOnBand(Queue<FishyProduct> band) {
        DataStructureConnector<FishyProduct> queueBand = new QueueConnector<>(band);
        DataStructureConnector<FishyProduct> stackCart = new StackConnector<>(products);
        DataStructureLink<FishyProduct> newBand = new DataStructureLink<>(stackCart, queueBand);
        newBand.moveAllFromAToB();
    }

    public void takeAllProductsFromBand(Queue<FishyProduct> band) {
        DataStructureConnector<FishyProduct> queueBand = new QueueConnector<>(band);
        DataStructureConnector<FishyProduct> stackCart = new StackConnector<>(products);
        DataStructureLink<FishyProduct> newBand = new DataStructureLink<>(queueBand, stackCart);
        newBand.moveAllFromAToB();
    }

    public void pay(int price) {
        if (price < 0 || money < price) {
            ExceptionUtil.illegalArgument("Not allowed");
        }
        money = money - price;
    }

    @Override
    public String toString() {
        return "new PenguinCustomer (" + '"' + getName() + '"' + ", " + getMoney() + ")";
    }
}
