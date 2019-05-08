import java.util.Scanner;

public class Automate {

    private Integer amountOfCoffee=0;

    private State state;

    private int coinBank =0;
    public Automate()
    {
        this.state=new StateCoinNotInserted();
    }


    public void input(String command)
    {
        if(amountOfCoffee.equals(0))
        {
            refillCoffee();

        }
        try {
            switch (command) {
                case "1":
                    this.state.receiveCoin(this);
                    break;
                case "2":
                    this.state.prepareCoffee(this);
                    break;
                case "3":
                    this.state.receiveCoffee(this);
                    break;
                case "4":
                    this.state.getCoinBack(this);
                    break;
                case "5":
                    this.state.getCoinBank(this);
                    break;

                default:
                    System.out.println("Wrong Command");
                    break;
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }

    }

   public void setState(State state) {
        this.state = state;
    }

    public void refillCoffee() {
        amountOfCoffee= 10;
        System.out.println("Automate refilled");

    }
    public void increaseCoinBank()
    {
        this.coinBank++;
    }

    public int getCoinBank() {
        return coinBank;
    }
    public void emptyCoinBank()
    {
        this.coinBank=0;
    }
}
