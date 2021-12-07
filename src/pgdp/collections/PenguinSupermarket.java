package pgdp.collections;

public class PenguinSupermarket {
    private final Checkout[] openRegisters;

    public Checkout[] getCheckout() {
        return openRegisters;
    }

    public PenguinSupermarket(int freeRegisters) {
        if(freeRegisters <= 0) {
            ExceptionUtil.illegalArgument("Not allowed");
        }
        this.openRegisters = new Checkout[freeRegisters];
    }

    public Checkout getCheckoutWithSmallestQueue() {
        int smallestQueueLength = openRegisters[0].queueLength(); //5 (5,4,3)
        for (int i = 0; i < openRegisters.length; i++) { //2<3
            if(smallestQueueLength > openRegisters[i].queueLength() || smallestQueueLength == 0) { //true
                smallestQueueLength = openRegisters[i].queueLength(); //=3
            }
        }
        int j = 0;
        while(openRegisters[j].queueLength() != smallestQueueLength) { //3 != 3
            j++;
        }
        Checkout smallestQueue = openRegisters[j];
        return smallestQueue;
    }


    public void closeCheckout(int index) {
    }

    public void serveCustomers() {
    }

}
