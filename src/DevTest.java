import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        prettyHeader("Welcome!");

    }

    // moved code over to safe input once tested, so most of the methods aren't in here except for the most recently tested ones



    public static String getRegExString(Scanner pipe, String prompt, String regEx){
        String retRegEx = "";
        boolean done = false;
        do{
            System.out.print(prompt + ": ");
                retRegEx = pipe.nextLine();
                if (retRegEx.matches(regEx)) {
                    done = true;
                }
                else{ // runs if given empty body or String that doesn't match regEx
                    System.out.println("No matches.");
                }

        }while(!done);



        return retRegEx;
    }


    public static void prettyHeader(String msg){
        for(int row=1; row<=3; row++){ // creates three rows
            if(row==2){ // if second row, then:
                for (int column = 1; column <= 3; column++){ // first three
                    System.out.print("*");
                }
                int space = (54 - msg.length())/2; // calculate necessary space -- may be very slightly uneven since not all divided values will provide whole number
                System.out.printf("%" + space + "s%s%" + space + "s", "", msg, ""); // center the text
                for (int column = 1; column <=3; column++) { // last three stars
                    System.out.print("*");
                }
                System.out.println(); // move to next line

            }
            else { // for first and third row
                for (int column = 1; column <= 60; column++) {
                    System.out.print("*");
                }
                System.out.println(); // move to next line
            }
        }
    }


    }

