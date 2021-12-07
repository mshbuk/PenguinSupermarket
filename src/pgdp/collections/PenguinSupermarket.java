package pgdp.collections;

public class PenguinSupermarket {
    private Checkout[] checkouts;

    public Checkout[] getCheckouts() {
        return checkouts;
    }

    public PenguinSupermarket(int freeRegisters) {
        if(freeRegisters <= 0) {
            ExceptionUtil.illegalArgument("Not allowed");
        }
        int i = 0;
        this.checkouts = new Checkout[freeRegisters];
        while(i < freeRegisters) {
            checkouts[i] = new Checkout();
            i = i + 1;
        }
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
            j = j + 1;
        }

        return checkouts[j];
    }


    public void closeCheckout(int index) {
        Checkout closedRegister = checkouts[index];
        int newLengthOfRegisters = checkouts.length - 1;
        Checkout[] openRegisters = new Checkout[newLengthOfRegisters];

        if (checkouts.length == 0 || checkouts.length == 1) {
            ExceptionUtil.illegalArgument("Not allowed");

        } else if (index < 0 || index >= checkouts.length) {
            ExceptionUtil.illegalArgument("Not allowed");
        }

        for (int i = 0; i < checkouts.length; i++) {
            if (i < index) {
                openRegisters[i] = checkouts[i];
            } else if (i > index) {
                openRegisters[i - 1] = checkouts[i];
            }
        }
        checkouts = openRegisters;
        if (!closedRegister.getQueue().isEmpty()) {
            DataStructureConnector<PenguinCustomer> getPenguinsOut = new QueueConnector<>(closedRegister.getQueue());
            DataStructureConnector<PenguinCustomer> reverseOrder = new StackConnector<>(new LinkedStack<>());
            DataStructureLink<PenguinCustomer> movePenguins = new DataStructureLink<>(getPenguinsOut, reverseOrder);

            while (getPenguinsOut.hasNextElement()) {
                movePenguins.moveNextFromAToB();
            }

            while (reverseOrder.hasNextElement()) {
                reverseOrder.removeNextElement().goToCheckout(this);
            }
        }
    }

    public void serveCustomers() {
    }

}
