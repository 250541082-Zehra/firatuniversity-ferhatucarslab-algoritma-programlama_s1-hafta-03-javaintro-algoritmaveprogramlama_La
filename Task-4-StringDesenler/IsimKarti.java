public class IsimKarti {

    public static void main(String[] args) {

        String adSoyad = "Zehra ÖZDEMİR";
        String ogrenciNo = "250541082";
        String bolum = "Yazılım Mühendisliği";

        System.out.println("===============================");
        System.out.println("          İSİM KARTI           ");
        System.out.println("===============================");
        System.out.printf("| Ad Soyad:        %-15s |\n", adSoyad);
        System.out.printf("| Öğrenci No:      %-15s |\n", ogrenciNo);
        System.out.printf("| Bölüm:           %-15s |\n", bolum);
        System.out.println("===============================");
    }
}
