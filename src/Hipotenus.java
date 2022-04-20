import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        double aSide, bSide, hipotenus;

        Scanner input = new Scanner(System.in);
        System.out.print("A Kenarinin Uzunlugunu Giriniz: ");
        aSide = input.nextDouble();

        System.out.print("B Kenarinin Uzunlugunu Giriniz: ");
        bSide = input.nextDouble();

        hipotenus = (aSide * aSide) + (bSide * bSide);
        System.out.println("Hipotenus degeri = " + Math.sqrt(hipotenus));
    }
}
