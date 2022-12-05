package TKGarageCalisanListesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TeknikKadro {

    static Map<String, String> teknikKadroMap = new HashMap<>();

    public static void teknikKadroEkle() throws InterruptedException {

        teknikKadroMap.put("701", "Dogan,    Cakir,    50, Temizlik Görevlisi");
        teknikKadroMap.put("702", "Ahmet,    Tozo,     38, Temizlik Görevlisi");
        teknikKadroMap.put("703", "Oktay,    Soylu,    42, Temizlik Görevlisii");
        teknikKadroMap.put("704", "Bülent,   Yildirim, 44, Mutfak Sorumlusu ");
        teknikKadroMap.put("705", "Serap,    Koc,      32, Danişma");
        teknikKadroMap.put("706", "Ece,      Dogan,    35, Danişma");
        teknikKadroMap.put("707", "Ozan,     Reis,     32, Guvenlik");
        teknikKadroMap.put("708", "Hazar,    Genc,     29, Guvenliki");


        Set<Map.Entry<String, String>> teknikKadroSeti = teknikKadroMap.entrySet();

        System.out.println("********************** TK GARAGE **********************\n" +
                "***************** Teknik Kadro Listesi *****************\n" +
                "Is yeri No     Isim     Soyisim        Yas      Bolumu ");

        for (Map.Entry<String, String> each : teknikKadroSeti) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");

            System.out.println(eachKey + "            " + eachValueArr[0] + "    " + eachValueArr[1] + "     " +
                    eachValueArr[2] + "     " + eachValueArr[3]);


        }
        Thread.sleep(4000);

    }
}