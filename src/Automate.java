import java.util.Scanner;

public class Automate {

    private Integer amountOfCoffee=0;

    private State state;

    public Automate()
    {
        this.state=new StateCoinNotInserted();
    }

    public void run(){
        if(amountOfCoffee.equals(0))
        {
            state.refillCoffee(this);

        }

        Scanner scan = new Scanner(System.in);

        this.state = new StateCoinInserted();






    }

    public State getState() {
        return state;
    }

    public Integer getAmountOfCoffee() {
        return amountOfCoffee;
    }

    public void setAmountOfCoffee(Integer amountOfCoffee) {
        this.amountOfCoffee = amountOfCoffee;
    }
}
