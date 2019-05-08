public class StateCoinNotInserted extends State {


    @Override
    public void receiveCoin(Automate automate) {

        System.out.println("Coin inserted");
        automate.increaseCoinBank();
        automate.setState(new StateCoinInserted());

    }

    @Override
    public void getCoinBank(Automate automate) {
        System.out.println("You get " + automate.getCoinBank() + " $");
        automate.emptyCoinBank();
    }
}
