public class ParaBozma369 {

    public static void main(String[] args) {
        int miktar = 369; // Bozulacak toplam miktar (TL)
        System.out.println("--- " + miktar + " TL İçin Para Bozmaları ---");

        // Kullanılacak para birimleri (azalan sırada)
        int[] paraBirimleri = {100, 50, 20, 10, 5, 2, 1};

        // Sonuçları formatlamak için StringBuilder kullanıyoruz
        StringBuilder sonuc = new StringBuilder();

        int kalanMiktar = miktar; // Başlangıçta 369

        // Her para birimi için döngü
        for (int birim : paraBirimleri) {

            // Kaç adet bu para biriminden gerekli?
            int adet = kalanMiktar / birim;

            // Eğer en az bir tane kullanılıyorsa
            if (adet > 0) {
                // Sonuca ekle (Örn: "3x100, ")
                sonuc.append(adet).append("x").append(birim).append(", ");

                // Kalan miktarı güncelle (Modül işlemi kalan parayı verir)
                kalanMiktar = kalanMiktar % birim;
            }
        }

        // Sonuç dizisinin sonundaki fazla ", " ifadesini temizle
        String temizSonuc = sonuc.toString();
        if (temizSonuc.endsWith(", ")) {
            temizSonuc = temizSonuc.substring(0, temizSonuc.length() - 2);
        }

        // Final Çıktı
        System.out.println(miktar + " TL = " + temizSonuc);
    }
}
