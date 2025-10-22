public class BasitTablo {

    public static void main(String[] args) {

        // 1. Veri Tanımlama (Ürün, Ağırlık ve Toplam Fiyatlar)
        String[] urunAdlari = {"Çay", "Şeker", "Yağ"};
        double[] agirliklar = {5.0, 5.0, 5.0};
        double[] toplamFiyatlar = {350.0, 400.0, 400.0};

        double genelToplam = 0.0;

        // 2. Tablo Başlığını Yazdırma
        System.out.println("==========================================================");
        System.out.println("| BASİT ALIŞVERİŞ ÖZETİ                                  |");
        System.out.println("==========================================================");
        System.out.println("| Ürün Adı | Ağırlık (kg) | Toplam Fiyat (TL) | Birim Fiyat (TL/kg) |");
        System.out.println("==========================================================");

        // 3. Hesaplama ve Tablo Satırlarını Yazdırma
        for (int i = 0; i < urunAdlari.length; i++) {

            String ad = urunAdlari[i];
            double agirlik = agirliklar[i];
            double toplamFiyat = toplamFiyatlar[i];

            double birimFiyat = toplamFiyat / agirlik;
            genelToplam += toplamFiyat;

            // Satırı tablo formatında yazdırma (Hizalama için String.format kullanılır)
            System.out.printf("| %-8s | %12.2f | %17.2f | %19.2f |\n",
                    ad,
                    agirlik,
                    toplamFiyat,
                    birimFiyat);
        }

        // 4. Genel Toplamı Yazdırma
        System.out.println("==========================================================");
        System.out.printf("| GENEL TOPLAM TUTAR:                               %.2f TL |\n", genelToplam);
        System.out.println("==========================================================");
    }
}
