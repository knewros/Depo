package DepoUygulamasi;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;

        while (devam) {
            // Menü göster
            System.out.println("\n==== DEPO YÖNETİM SİSTEMİ ====");
            System.out.println("1 - Ürün Tanımla");
            System.out.println("2 - Ürün Listele");
            System.out.println("3 - Ürün Girişi");
            System.out.println("4 - Ürünü Rafa Koy");
            System.out.println("5 - Ürün Çıkışı");
            System.out.println("0 - Çıkış");
            System.out.print("Seçim: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            // Seçime göre işlem yap
            switch (secim) {
                case 1: DepoIslemleri.urunTanimla();
                break;
                case 2: DepoIslemleri.urunListele();
                break;
                case 3: DepoIslemleri.urunGirisi();
                break;
                case 4 : DepoIslemleri.urunuRafaKoy();
                break;
                case 5 : DepoIslemleri.urunCikisi();
                break;
                case 0 : {
                    devam = false;
                    System.out.println("Çıkış yapılıyor...");
                    break;
                }
                default:

                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}
