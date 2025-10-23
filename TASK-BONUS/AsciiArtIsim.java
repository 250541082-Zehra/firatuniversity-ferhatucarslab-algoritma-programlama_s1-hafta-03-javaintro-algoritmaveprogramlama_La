import java.util.HashMap;
import java.util.Map;

public class AsciiArtIsim {

    public static void main(String[] args) {
        String isim = "ZEHRA";
        String asciiArt = olusturAsciiArt(isim.toUpperCase());

        System.out.println("--- " + isim + " Adının ASCII Art Görünümü ---");
        System.out.println(asciiArt);
        System.out.println("----------------------------------------------");
    }

    // Her harfin ASCII Art temsilini saklayan metot
    private static Map<Character, String[]> harfMapDoldur() {
        Map<Character, String[]> harfMap = new HashMap<>();

        // Örnek: Her harfi 5 satır yüksekliğinde tanımlıyoruz
        harfMap.put('Z', new String[]{
                "ZZZZZ",
                "   Z ",
                "  Z  ",
                " Z   ",
                "ZZZZZ"
        });

        harfMap.put('E', new String[]{
                "EEEEE",
                "E    ",
                "EEEEE",
                "E    ",
                "EEEEE"
        });

        harfMap.put('H', new String[]{
                "H   H",
                "H   H",
                "HHHHH",
                "H   H",
                "H   H"
        });

        harfMap.put('R', new String[]{
                "RRRR ",
                "R   R",
                "RRRR ",
                "R R  ",
                "R  RR"
        });

        harfMap.put('A', new String[]{
                "  A  ",
                " A A ",
                "AAAAA",
                "A   A",
                "A   A"
        });

        return harfMap;
    }

    // İsmi ASCII Art'a dönüştüren ana metot
    private static String olusturAsciiArt(String kelime) {
        Map<Character, String[]> harfMap = harfMapDoldur();
        StringBuilder sonuc = new StringBuilder();

        // Harflerin yüksekliği (Örneğimizde 5)
        final int YUKSEKLIK = 5;
        for (int i = 0; i < YUKSEKLIK; i++) {
            for (char harf : kelime.toCharArray()) {
                String[] artLines = harfMap.get(harf);
                if (artLines != null) {
                    sonuc.append(artLines[i]).append("  "); // Her harf arasına boşluk ekle
                }
            }
            sonuc.append("\n"); // Satır sonu
        }

        return sonuc.toString();
    }
}
