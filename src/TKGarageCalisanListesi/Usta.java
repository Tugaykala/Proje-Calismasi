package TKGarageCalisanListesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Usta {

    static Scanner scan = new Scanner(System.in);

    static Map<String,String> ustalarMap = new HashMap<>();

    public static void ustaEkle() throws InterruptedException {
        String tercih ="";

            ustalarMap.put("301", "Mahmut,   Kaya,     45, Motor Ustasi");
            ustalarMap.put("302", "Hasan,    Can,      40, Kaporta Ustasi");
            ustalarMap.put("303", "Alper,    Kul,      38, Mekanik Ustasi");
            ustalarMap.put("304", "Ali,      Buyuk,    50, Bas Usta");
            ustalarMap.put("305", "Mustafa,  Cengiz,   42, Motor Ustasi");
            ustalarMap.put("306", "Faruk,    Kahyalar, 47, Elektrik Ustasi");

            Set<Map.Entry<String, String>> ustalarSeti = ustalarMap.entrySet();
            System.out.println("********************** TK GARAGE **********************\n" +
                    "***************** Usta Listesi *****************\n" +
                    "Is yeri No     Isim     Soyisim        Yas      Bolumu ");

            for (Map.Entry<String, String> each : ustalarSeti) {

                String eachKey = each.getKey();
                String eachValue = each.getValue();
                String[] eachValueArr = eachValue.split(", ");

                System.out.println(eachKey + "            " + eachValueArr[0] + "    " + eachValueArr[1] + "     " +
                        eachValueArr[2] + "     " + eachValueArr[3]);

            }
            Thread.sleep(4000);

    }

}
