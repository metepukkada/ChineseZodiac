import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int year;
        String zodiac = null;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        year = input.nextInt();
        switch (year % 12) {
            case 0 -> zodiac = "Maymun";
            case 1 -> zodiac = "Horoz";
            case 2 -> zodiac = "Köpek";
            case 3 -> zodiac = "Domuz";
            case 4 -> zodiac = "Fare";
            case 5 -> zodiac = "Öküz";
            case 6 -> zodiac = "Kaplan";
            case 7 -> zodiac = "Tavşan";
            case 8 -> zodiac = "Ejderha";
            case 9 -> zodiac = "Yılan";
            case 10 -> zodiac = "At";
            case 11 -> zodiac = "Koyun";
            default -> System.out.println("Hatalı Giriş!");

        }if (year >= 0 ){
            System.out.println("Cin Zodyağı Burcunuz: " + zodiac);
        }
    }
}
