import java.util.Scanner;

public class SwitchCasePractice {
    public static void main(String[] args) {
        double n1, n2;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Gir : ");
        n1 = input.nextDouble();
        System.out.print("İkinci Sayıyı Gir : ");
        n2 = input.nextDouble();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.println("işlemlerden birini seç");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkan : " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpım : " + (n1*n2));
                break;
            case 4:
                int sorun;
                sorun = (n2==0) ? 1 : 0;
                switch (sorun) {
                    case 0:
                        System.out.println("Bölüm : " + (n1/n2));
                        break;
                    case 1:
                        System.out.println("bir sayı sıfıra bölünemez!");
                        break;
                }

                break;
            default:
                System.out.println("Hatalı Bir Seçim Yaptınız!");
                break;
        }
    }
}
