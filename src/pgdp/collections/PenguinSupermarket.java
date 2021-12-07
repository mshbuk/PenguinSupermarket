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
        int smallestQueueLength = openRegisters[0].queueLength();
        for (int i = 0; i < openRegisters.length; i++) {
            if(openRegisters[i].queueLength() == 0){
                smallestQueueLength = openRegisters[i].queueLength();
                break;
            }
            if(smallestQueueLength > openRegisters[i].queueLength()) {
                smallestQueueLength = openRegisters[i].queueLength();
            }
        }
        int j = 0;
        while(openRegisters[j].queueLength() <= smallestQueueLength) {
            j++;
        }
        return openRegisters[j];
    }


    public void closeCheckout(int index) {
    }

    public void serveCustomers() {
    }

}
