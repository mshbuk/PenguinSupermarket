package pgdp.collections;

public class PenguinSupermarket {
    private final Checkout[] checkout;

    public Checkout[] getCheckout() {
        return checkout;
    }

    public PenguinSupermarket(int freeRegisters) {
        if(freeRegisters <= 0) {
            ExceptionUtil.illegalArgument("Not allowed");
        }
        this.checkout = new Checkout[freeRegisters];
    }

    public Checkout getCheckoutWithSmallestQueue() {
        int smallestQueueLength = checkout[0].queueLength();

        for (int i = 0; i < checkout.length; i++) {
            if(smallestQueueLength > checkout[i].queueLength()) {
                smallestQueueLength = checkout[i].queueLength();
            }
        }

        int j = 0;
        while(checkout[j].queueLength() != smallestQueueLength) {
            j++;
        }

        return checkout[j];
    }


    public void closeCheckout(int index) {
    }

    public void serveCustomers() {
    }

}
