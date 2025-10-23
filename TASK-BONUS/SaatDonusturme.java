public class SaniyeCevirici {
    public static void main(String[] args) {
        int toplamSaniye = 5468;
        int saat = toplamSaniye / 3600;
        int kalanSaniye = toplamSaniye % 3600;
        int dakika = kalanSaniye / 60;
        int saniye = kalanSaniye % 60;
        String zamanFormatli = String.format("%02d:%02d:%02d", saat, dakika, saniye);

        System.out.println("Toplam saniye: " + toplamSaniye);
        System.out.println("Saat:Dakika:Saniye formatı: " + zamanFormatli);
    }
}
