package DepoUygulamasi;

import java.util.Scanner;

public class DepoIslemleri {

    static Scanner scanner = new Scanner(System.in);

    //  Ürün Tanımlama
    public static void urunTanimla() {
        System.out.print("Ürün İsmi: ");
        String isim = scanner.nextLine();

        System.out.print("Üretici: ");
        String uretici = scanner.nextLine();

        System.out.print("Birim: ");
        String birim = scanner.nextLine();

        // Yeni ürün ID'si otomatik alınır
        int id = VeriTabani.idSayac++;

        // Ürün nesnesi oluşturulup mape eklenir
        Urun urun = new Urun(id, isim, uretici, birim);
        VeriTabani.urunler.put(id, urun);

        System.out.println("Ürün başarıyla tanımlandı. ID: " + id);
    }

    //  Ürün Listeleme
    public static void urunListele() {
        System.out.printf("%-6s %-10s %-12s %-8s %-10s %-6s%n",
                "ID", "İsim", "Üretici", "Miktar", "Birim", "Raf");
        System.out.println("--------------------------------------------------------");

        // Tüm ürünleri yazdır
        for (Urun u : VeriTabani.urunler.values()) {
            System.out.println(u);
        }
    }

    //  Ürün Girişi
    public static void urunGirisi() {
        System.out.print("Ürün ID: ");
        int id = scanner.nextInt();

        System.out.print("Giriş miktarı: ");
        int miktar = scanner.nextInt();
        scanner.nextLine(); // Dummy newline

        Urun u = VeriTabani.urunler.get(id);
        if (u != null) {
            u.setMiktar(u.getMiktar() + miktar);
            System.out.println("Ürün girişi yapıldı.");
        } else {
            System.out.println("Ürün bulunamadı.");
        }
    }

    //  Ürünü rafa koyma
    public static void urunuRafaKoy() {
        System.out.print("Ürün ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Raf adı: ");
        String raf = scanner.nextLine();

        Urun u = VeriTabani.urunler.get(id);
        if (u != null) {
            u.setRaf(raf);
            System.out.println("Ürün rafa yerleştirildi.");
        } else {
            System.out.println("Ürün bulunamadı.");
        }
    }

    // 5. Ürün Çıkışı
    public static void urunCikisi() {
        System.out.print("Ürün ID: ");
        int id = scanner.nextInt();

        System.out.print("Çıkış miktarı: ");
        int miktar = scanner.nextInt();
        scanner.nextLine();

        Urun u = VeriTabani.urunler.get(id);
        if (u != null) {
            if (u.getMiktar() >= miktar) {
                u.setMiktar(u.getMiktar() - miktar);
                System.out.println("Ürün çıkışı yapıldı.");
            } else {
                System.out.println("Yetersiz stok! Mevcut miktar: " + u.getMiktar());
            }
        } else {
            System.out.println("Ürün bulunamadı.");
        }
    }
}
