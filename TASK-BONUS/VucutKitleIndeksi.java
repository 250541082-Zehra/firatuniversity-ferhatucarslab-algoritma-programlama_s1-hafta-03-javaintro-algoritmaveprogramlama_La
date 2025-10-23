public class VkiHesaplama {
    public static void main(String[] args) {
        double boy = 1.63;
        double kilo = 70.0;
        double vki = kilo / (boy * boy);
        System.out.println("--- Vücut Kitle İndeksi (VKİ) Hesaplama ---");
        System.out.printf("Boy: %.2f m\n", boy);s
        System.out.printf("Kilo: %.1f kg\n", kilo);
        System.out.printf("Hesaplanan VKİ: %.2f\n", vki);
        System.out.println("------------------------------------------");
        System.out.print("VKİ Durumu: ");
        if (vki < 18.5) {
            System.out.println("Zayıf (Düşük Kilolu)");
        } else if (vki >= 18.5 && vki < 25) {
            System.out.println("Normal Kilolu");
        } else if (vki >= 25 && vki < 30) {
            System.out.println("Fazla Kilolu");
        } else if (vki >= 30 && vki < 35) {
            System.out.println("Obez (I. Sınıf)");
        } else if (vki >= 35 && vki < 40) {
            System.out.println("Ciddi Obez (II. Sınıf)");
        } else {
            System.out.println("Morbid Obez (III. Sınıf)");
        }
    }
}
