public class StateCoinInserted extends State {

    public StateCoinInserted()
    {
        System.out.println("Coin inserted");
    }
    @Override
    public void prepareCoffee() {
        super.prepareCoffee();
    }

    @Override
    public void receiveCoin() {
        super.receiveCoin();
    }

    public Coin getCoinBack(){
        return new Coin();
    }
}
