import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int k;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        int toplam = 0;
        int adet = 0;
        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }
        double ortalama = (double)toplam / adet;

        System.out.println("0'dan " + k + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);

    }
}
