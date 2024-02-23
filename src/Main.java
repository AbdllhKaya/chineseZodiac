import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Scanner has been defined.
        Scanner ak= new Scanner(System.in);

        //Variables have been initialized.
        int x;
        final int y=12;

        //Get values from the user.
        System.out.print("Please enter your birth date = ");
        x= ak.nextInt();

        //Calculated and result printed.
        int z= x%y;
        switch (z) {
            case 0:
                System.out.print("Your Chinese Zodiac Horoscope= Monkey");
                break;
            case 1:
                System.out.print("Your Chinese Zodiac Horoscope= Rooster");
                break;
            case 2:
                System.out.print("Your Chinese Zodiac Horoscope= Dog");
                break;
            case 3:
                System.out.print("Your Chinese Zodiac Horoscope= Pig");
                break;
            case 4:
                System.out.print("Your Chinese Zodiac Horoscope= Mouse");
                break;
            case 5:
                System.out.print("Your Chinese Zodiac Horoscope= Bull");
                break;
            case 6:
                System.out.print("Your Chinese Zodiac Horoscope= Tiger");
                break;
            case 7:
                System.out.print("Your Chinese Zodiac Horoscope= Rabbit");
                break;
            case 8:
                System.out.print("Your Chinese Zodiac Horoscope= Dragon");
                break;
            case 9:
                System.out.print("Your Chinese Zodiac Horoscope= Snake");
                break;
            case 10:
                System.out.print("Your Chinese Zodiac Horoscope= Horse");
                break;
            case 11:
                System.out.print("Your Chinese Zodiac Horoscope= Sheep");
                break;
        }
    }
}