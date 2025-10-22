public class TabloluKuvvetHesaplayici {

    public static void main(String[] args) {

        // 'a' sayısını sabit olarak 3 alıyoruz
        final int a = 3;

        // Sonucu tutacak değişken
        long kuvvet = 1;

        System.out.println("a = " + a + " sayısının kuvvetleri tablosu (1'den 5'e):");
        System.out.println("==========================================");

        // Tablo Başlıkları
        // %-5s: Sola hizalı, 5 karakter genişliğinde String
        // %-10s: Sola hizalı, 10 karakter genişliğinde String
        System.out.println(String.format("%-5s | %-10s | %-15s", "Üs (i)", "İşlem", "Sonuç (a^i)"));
        System.out.println("------------------------------------------");


        // 1'den 5'e kadar olan kuvvetleri hesaplamak için döngü
        for (int i = 1; i <= 5; i++) {

            // kuvvet = kuvvet * a;
            kuvvet *= a;

            // İşlem sütunu için metin oluşturma (örn: "3^1")
            String islem = a + "^" + i;

            // Sonucu tablo formatında yazdır
            // %-5d: Sola hizalı, 5 karakter genişliğinde tamsayı (için)
            // %-10s: Sola hizalı, 10 karakter genişliğinde String (işlem için)
            // %-15d: Sola hizalı, 15 karakter genişliğinde tamsayı (kuvvet için)
            System.out.println(String.format("%-5d | %-10s | %-15d", i, islem, kuvvet));
        }

        System.out.println("==========================================");
    }
}
