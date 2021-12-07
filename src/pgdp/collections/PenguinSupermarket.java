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
        int smallestQueueLength = openRegisters[0].queueLength(); //2 (2,5,1)
        for (int i = 0; i < openRegisters.length; i++) { //2<3
            if(openRegisters[i].queueLength() == 0){
                break;
            }
            if(smallestQueueLength > openRegisters[i].queueLength()) { //true
                smallestQueueLength = openRegisters[i].queueLength(); //=1
            }
        }
        int j = 0;
        while(openRegisters[j].queueLength() <= smallestQueueLength) { //3 != 3
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
