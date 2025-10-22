import java.util.Locale;

public class MilKilometreDonusumTablosu {

    public static void main(String[] args) {

        // Dönüşüm katsayısı (1 mil kaç kilometredir?)
        final double DONUSUM_KATSAYISI = 1.609;

        // Dönüştürülecek mil değerlerini içeren dizi
        int[] milDegerleri = {1, 5, 10, 20, 50};

        System.out.println("5.2 - Dönüşüm Tablosu: Mil -> Kilometre");
        System.out.println("------------------------------------------");
        System.out.println("Dönüşüm Oranı: 1 mil = " + DONUSUM_KATSAYISI + " km");
        System.out.println("------------------------------------------");

        // Tablo Başlıkları
        // %-10s: Sola hizalı, 10 karakter genişliğinde String
        // %-15s: Sola hizalı, 15 karakter genişliğinde String
        System.out.println(String.format("%-10s | %-15s", "Mil", "Kilometre"));
        System.out.println("------------------------------------------");

        // Hesaplamaları ve tabloyu oluşturmak için döngü
        for (int mil : milDegerleri) {

            // Dönüşüm hesaplaması
            double kilometre = mil * DONUSUM_KATSAYISI;

            // Sonucu tablo formatında yazdır
            // Locale.US kullanmak, ondalık ayırıcı olarak her zaman nokta (.) kullanılmasını sağlar.
            // %.3f: Virgülden sonra 3 basamak göstermek için
            System.out.println(String.format(Locale.US, "%-10d | %-15.3f", mil, kilometre));
        }

        System.out.println("------------------------------------------");
    }
}
