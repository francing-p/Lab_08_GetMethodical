public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.printf("%4s%7s%5s", "C", " ", "F\n"); // header that says "C" and "F" over the appropriate column
        System.out.printf("--------------------%n"); // line between header and table
        for (int cel = -100; cel <=100; cel++){
            System.out.printf("%5s%5s %.2f", cel, " ",CtoF(cel)); // "" adds space in between, prints Celsius, space, then Fahrenheit
            System.out.println();
        }

    }
    public static double CtoF(double Celsius){
        return (Celsius * 9/5) + 32;
    }
}


