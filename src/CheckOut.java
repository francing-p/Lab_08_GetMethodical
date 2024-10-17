import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean cont = false;
        double cost  = 0.0;
        double total = 0.0;

        do {
            cost = SafeInput.getRangedDouble(in, "Enter the cost of your item [0.50-10.00]",.5,10);
            total = cost + total;
            in.nextLine();

            cont = SafeInput.getYNConfirm(in,"Do you have more items? [Y/N]");

        }while (cont);

        System.out.printf("Your total cost is $%.2f", total);
    }
}
