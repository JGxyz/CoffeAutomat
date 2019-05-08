public class StateCoffeePrepared extends State {


    @Override
    public void receiveCoffee(Automate automate) {

        System.out.println("Coffee received");
        automate.setState(new StateCoinNotInserted());
    }



}
