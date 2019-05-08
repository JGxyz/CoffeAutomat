import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Automate automate = new Automate();
        System.out.println("\n 1 - insert coin \n 2 - prepare coffee \n 3 - receive coffee \n 4 -  return coin \n 5 - get coin bank \n");

while(true) {
    Scanner scan = new Scanner(System.in);

    automate.input(scan.nextLine());
}
}
}


