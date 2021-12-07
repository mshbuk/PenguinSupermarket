package pgdp.collections;

public class PenguinSupermarket {
    private final Checkout[] checkouts;

    public Checkout[] getCheckouts() {
        return checkouts;
    }

    public PenguinSupermarket(int freeRegisters) {
        if(freeRegisters <= 0) {
            ExceptionUtil.illegalArgument("Not allowed");
        }
        this.checkouts = new Checkout[freeRegisters];
    }

    public Checkout getCheckoutWithSmallestQueue() {
        int smallestQueueLength = checkouts[0].queueLength();

        for (int i = 0; i < checkouts.length; i++) {
            if(smallestQueueLength > checkouts[i].queueLength()) {
                smallestQueueLength = checkouts[i].queueLength();
            }
        }

        int j = 0;
        while(checkouts[j].queueLength() != smallestQueueLength) {
            j++;
        }

        return checkouts[j];
    }


    public void closeCheckout(int index) {
    }

    public void serveCustomers() {
    }

}
