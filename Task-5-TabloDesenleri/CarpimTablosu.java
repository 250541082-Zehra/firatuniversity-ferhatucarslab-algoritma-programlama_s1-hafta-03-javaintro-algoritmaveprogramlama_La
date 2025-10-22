public class CarpimTablosu {

    public static void main(String[] args) {

        // Çarpım tablosunu oluşturacağımız sayı
        final int SAYI = 2;

        System.out.println(SAYI + " Sayısının Çarpım Tablosu (1'den 10'a):");
        System.out.println("=================================");

        // Tablo Başlıkları için gerek yok, doğrudan işlemi yazdıracağız.

        // 1'den 10'a kadar olan sayılarla çarpmak için döngü
        for (int i = 1; i <= 10; i++) {

            // Çarpma işlemini gerçekleştir
            int sonuc = SAYI * i;

            // Sonucu konsola yazdır (Örn: 2 x 5 = 10)
            // %-2d: Sola hizalı, 2 karakter genişliğinde tamsayı (SAYI ve i için)
            // %-3s: Sola hizalı, 3 karakter genişliğinde String ("x" ve "=" için)
            // %-3d: Sola hizalı, 3 karakter genişliğinde tamsayı (sonuç için)
            System.out.println(String.format("%-2d %-3s %-2d %-3s %-3d", SAYI, "x", i, "=", sonuc));
        }

        System.out.println("=================================");
    }
}
