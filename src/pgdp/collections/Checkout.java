package pgdp.collections;

public class Checkout {
    private final Queue<PenguinCustomer> queue;
    private final Queue<FishyProduct> bandBeforeCashier;
    private final Queue<FishyProduct> bandAfterCashier;


    public Checkout() {
        this.queue = new LinkedQueue<>();
        this.bandBeforeCashier = new LinkedQueue<>();
        this.bandAfterCashier = new LinkedQueue<>();
    }

    public Queue<PenguinCustomer> getQueue() {
        return queue;
    }

    public Queue<FishyProduct> getBandBeforeCashier() {
        return bandBeforeCashier;
    }

    public Queue<FishyProduct> getBandAfterCashier() {
        return bandAfterCashier;
    }

    public int queueLength() {
        return queue.size();
    }

    public void serveNextCustomer() {
        if (!queue.isEmpty()) {
            PenguinCustomer larisa = queue.dequeue();
            larisa.placeAllProductsOnBand(bandBeforeCashier);

            int receipt = 0;
            while (!(bandBeforeCashier.size() == 0)) {
                FishyProduct item = bandBeforeCashier.dequeue();
                int price = item.getPrice();
                receipt = receipt + price;
                larisa.pay(price);
                bandAfterCashier.enqueue(item);

                if (larisa.getMoney() < receipt) {
                    ExceptionUtil.illegalArgument("Not allowed");
                }
            }
            larisa.takeAllProductsFromBand(bandAfterCashier);
        }
    }
}
