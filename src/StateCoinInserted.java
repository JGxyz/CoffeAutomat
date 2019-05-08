import static java.lang.Thread.sleep;

public class StateCoinInserted extends State {


    @Override
    public void prepareCoffee(Automate automate) throws InterruptedException {
        System.out.println("Coffee preparing..");
        sleep(10000);
        System.out.println("Coffee done");
        automate.setState(new StateCoffeePrepared());
    }


    public void getCoinBack(Automate automate){
        System.out.println("Coin returned");
        automate.setState(new StateCoinNotInserted());

    }


}
