import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int minutes = 0;

        year = SafeInput.getRangedInt(in, "Enter the year you were born [1950-2015]", 1950, 2015);
        in.nextLine(); // clear Scanner in between entries

        month = SafeInput.getRangedInt(in, "Enter the month you were born [1-12]",1,12);
        in.nextLine(); // clear Scanner in between entries

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                day = SafeInput.getRangedInt(in,"Enter the day you were born [1-31]",1,31);
                break;
            case 2:
                day = SafeInput.getRangedInt(in,"Enter the day you were born [1-29]",1,29);
                break;
            case 4, 6, 9, 11:
                day = SafeInput.getRangedInt(in,"Enter the day you were born [1-30]",1,30);
                break;
        }
        in.nextLine();

        hours = SafeInput.getRangedInt(in,"What hour were you born at? [1-24]",1,24);
        in.nextLine();

        minutes= SafeInput.getRangedInt(in,"What minute were you born at? [1-59]",1,59);
        in.nextLine();

        System.out.println("You were born on " + month + "/" + day + "/" + year + " at " + hours + " hours and " + minutes + " minutes.");


    }
}
