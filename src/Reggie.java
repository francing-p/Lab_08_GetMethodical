import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String ssn = "";
    String ucID = "";
    String menu = "";

    ssn = SafeInput.getRegExString(in,"Enter your SSN","^\\d{3}-\\d{2}-\\d{4}$");

    ucID = SafeInput.getRegExString(in,"Enter your M#" ,"^(M|m)\\d{5}$");

    menu = SafeInput.getRegExString(in,"Enter your menu choice [O/S/V/Q]","^[OoSsVvQq]$");

    System.out.println("SSN: " + ssn + " UCID: " + ucID + " menu choice: " + menu);

    }
}
