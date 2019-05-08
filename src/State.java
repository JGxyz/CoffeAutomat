public abstract class State {

    public void  receiveCoin(){
        System.out.println("Error , Can't receive coin");
    }
    public void receiveCoffee() {
        System.out.println("Error , Can't receive coffee");
    }
    public void prepareCoffee(){
        System.out.println("Error , Can't prepare coffee");
    }
    public void getCoinBank(){
        System.out.println("Error , Can't return coin");
    }
    public void refillCoffee(Automate automate){

        automate.setAmountOfCoffee(10);
        System.out.println("Automate refilled");
    }
    public Integer getAmountOfCoffee()
    {
        System.out.println("Error , Can't get amount of coffee");
        return null;
    }
}
