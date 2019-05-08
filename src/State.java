public abstract class State {

    public void receiveCoin(Automate automate) {
        System.out.println("Error, Can't receive coin");
    }

    public void receiveCoffee(Automate automate) {

        System.out.println("Error, Can't receive coffee");
    }

    public void prepareCoffee(Automate automate) throws InterruptedException {
        System.out.println("Error, Can't prepare coffee");
    }

    public void getCoinBank(Automate automate) {
        System.out.println("Error, Can't return coin");
    }

}
