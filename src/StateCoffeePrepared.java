public class StateCoffeePrepared extends State {


    @Override
    public void receiveCoffee() {
        super.receiveCoffee();
    }

    @Override
    public void receiveCoin() {
        super.receiveCoin();
    }

    @Override
    public void prepareCoffee() {
        super.prepareCoffee();
    }

    public Coin getCoinBack(){
        return new Coin();
    }


}
