package com.example.final1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Oyuncular extends Oyun{

    private static final Map<String, List<String>> takimOyunculari = new HashMap<>();
    private static final Map<String, Map<String, String>> oyuncuBilgileri = new HashMap<>();

    static {
        takimOyunculari.put("Fenerbahçe", List.of(
                "Dominik Livaković", "Bright Osayi-Samuel", "Rodrigo Becão",
                "Çağlar Söyüncü", "Jayden Oosterwolde", "Fred", "İsmail Yüksek",
                "Dušan Tadić", "Sebastian Szymański", "Filip Kostić", "Edin Džeko"));
        takimOyunculari.put("Galatasaray", List.of(
                "Fernando Muslera", "Davinson Sánchez", "Victor Nelsson",
                "Abdülkerim Bardakcı", "Ismail Jakobs", "Kerem Demirbay",
                "Berkan Kutlu", "Hakim Ziyech", "Yunus Akgün", "Mauro Icardi", "Wilfried Zaha"));
        takimOyunculari.put("Beşiktaş", List.of("Mert Günok", "Onur Bulut", "Tayyip Talha Sanuç",
                "Daniel Amartey", "Arthur Masuaku", "Salih Uçan", "Gedson Fernandes", "Rachid Ghezzal", "Alex Oxlade-Chamberlain",
                "Vincent Aboubakar", "Cenk Tosun"));
        takimOyunculari.put("Rizespor", List.of("Amir Hadziahmetovic", "Ivo Grbic", "Vaclav Juracka",
                "Kamil Jablonski", "Abdullah Durak", "Hassan Bandé", "Gökhan Alkan",
                "Sami Khedira", "Lamine Gassama", "Deniz Kadah", "Musa Çarkan"));
        takimOyunculari.put("Sivasspor", List.of("Ali Şaşal Vural", "Ziya Erdal", "Caner Osmanpaşa",
                "Murat Paluli", "Samba Camara", "Hakan Arslan",
                "Dia Saba", "Clinton N'Jie", "Charilaos Charisis",
                "Rei Manaj", "Mustapha Yatabare"));
        takimOyunculari.put("Eyüpspor", List.of("Gökhan Değirmenci", "Burak Öksüz", "Mehmet Yiğit Göker", "Murat Uçar",
                "Murat Paluli", "Mehmet Feyzi Yıldırım", "Ömür Atasoy", "Emir Kaan Gültekin", "Murat Yıldırım", "Famoussa Koné", "Lamine Diaby"));
        takimOyunculari.put("Başakşehir", List.of("Volkan Babacan", "Leo Duarte", "Ömer Ali Şahiner",
                "Lucas Biglia", "Deniz Türüç", "Berkay Özcan", "Serdar Gürler", "Danijel Aleksic",
                "Krzysztof Piatek", "Mahmut Tekdemir", "Edgar Ié"));
        takimOyunculari.put("Göztepe", List.of("İrfan Can Eğribayat", "Berkan Emir", "Atınç Nukan", "Adnane Tighadouini",
                "Obinna Nwobodo", "Yalçın Kayan", "Halil Akbunar", "Soner Aydoğdu", "Efe Can Saçıkara", "Yaw Ackah", "João Figueiredo"));
        takimOyunculari.put("Trabzonspor", List.of("Uğurcan Çakır", "Eren Elmalı", "Stefano Denswil", "Marc Bartra",
                "Batista Mendy", "Abdülkadir Ömür", "Anastasios Bakasetas", "Enis Bardhi", "Trezeguet",
                "Paul Onuachu", "Edin Visca"));
        takimOyunculari.put("Konyaspor", List.of("Deniz Mehmet", "Guilherme Sityá", "Adil Demirbağ",
                "Abdülkerim Bardakcı", "Francisco Calvo", "Soner Dikmen", "Amir Hadžiahmetović",
                "Robert Muric", "Sokol Cikalleshi", "Muhammet Demir", "Bruno Paz"));



        Map<String, String> fenerbahceOyuncuBilgileri = new HashMap<>();
        fenerbahceOyuncuBilgileri.put("Dominik Livaković", "Yaş: 29, Kilo: 79kg, Boy: 1.88m");
        fenerbahceOyuncuBilgileri.put("Bright Osayi-Samuel", "Yaş: 27, Kilo: 72kg, Boy: 1.75m");
        fenerbahceOyuncuBilgileri.put("Rodrigo Becão", "Yaş: 29, Kilo: 77kg, Boy: 1.91m");
        fenerbahceOyuncuBilgileri.put("Çağlar Söyüncü", "Yaş: 29, Kilo: 84kg, Boy: 1.87m");
        fenerbahceOyuncuBilgileri.put("Jayden Oosterwolde", "Yaş: 24, Kilo: 74kg, Boy: 1.78m");
        fenerbahceOyuncuBilgileri.put("Fred", "Yaş: 32, Kilo: 64kg, Boy: 1.69m");
        fenerbahceOyuncuBilgileri.put("İsmail Yüksek", "Yaş: 25, Kilo: 75kg, Boy: 1.83m");
        fenerbahceOyuncuBilgileri.put("Dušan Tadić", "Yaş: 36, Kilo: 76kg, Boy: 1.81m");
        fenerbahceOyuncuBilgileri.put("Sebastian Szymański", "Yaş: 26, Kilo: 61kg, Boy: 1.74m");
        fenerbahceOyuncuBilgileri.put("Filip Kostić", "Yaş: 32, Kilo: 82kg, Boy: 1.84m");
        fenerbahceOyuncuBilgileri.put("Edin Džeko", "Yaş: 39, Kilo: 80kg, Boy: 1.93m");

        Map<String, String> galatasarayOyuncuBilgileri = new HashMap<>();
        galatasarayOyuncuBilgileri.put("Fernando Muslera", "Yaş: 38, Kilo: 84kg, Boy: 1.90m");
        galatasarayOyuncuBilgileri.put("Davinson Sánchez", "Yaş: 28, Kilo: 81kg, Boy: 1.87m");
        galatasarayOyuncuBilgileri.put("Victor Nelsson", "Yaş: 26, Kilo: 78kg, Boy: 1.85m");
        galatasarayOyuncuBilgileri.put("Abdülkerim Bardakcı", "Yaş: 29, Kilo: 83kg, Boy: 1.90m");
        galatasarayOyuncuBilgileri.put("Ismail Jakobs", "Yaş: 25, Kilo: 77kg, Boy: 1.84m");
        galatasarayOyuncuBilgileri.put("Kerem Demirbay", "Yaş: 31, Kilo: 76kg, Boy: 1.83m");
        galatasarayOyuncuBilgileri.put("Berkan Kutlu", "Yaş: 26, Kilo: 75kg, Boy: 1.86m");
        galatasarayOyuncuBilgileri.put("Hakim Ziyech", "Yaş: 31, Kilo: 65kg, Boy: 1.81m");
        galatasarayOyuncuBilgileri.put("Yunus Akgün", "Yaş: 24, Kilo: 68kg, Boy: 1.73m");
        galatasarayOyuncuBilgileri.put("Mauro Icardi", "Yaş: 31, Kilo: 75kg, Boy: 1.81m");
        galatasarayOyuncuBilgileri.put("Wilfried Zaha", "Yaş: 32, Kilo: 70kg, Boy: 1.80m");


        Map<String, String> besiktasOyuncuBilgileri = new HashMap<>();
        besiktasOyuncuBilgileri.put("Mert Günok", "Yaş: 34, Kilo: 89kg, Boy: 1.96m");
        besiktasOyuncuBilgileri.put("Onur Bulut", "Yaş: 29, Kilo: 75kg, Boy: 1.76m");
        besiktasOyuncuBilgileri.put("Tayyip Talha Sanuç", "Yaş: 22, Kilo: 84kg, Boy: 1.90m");
        besiktasOyuncuBilgileri.put("Daniel Amartey", "Yaş: 29, Kilo: 78kg, Boy: 1.86m");
        besiktasOyuncuBilgileri.put("Arthur Masuaku", "Yaş: 29, Kilo: 70kg, Boy: 1.79m");
        besiktasOyuncuBilgileri.put("Salih Uçan", "Yaş: 29, Kilo: 76kg, Boy: 1.82m");
        besiktasOyuncuBilgileri.put("Gedson Fernandes", "Yaş: 24, Kilo: 74kg, Boy: 1.84m");
        besiktasOyuncuBilgileri.put("Rachid Ghezzal", "Yaş: 31, Kilo: 71kg, Boy: 1.82m");
        besiktasOyuncuBilgileri.put("Alex Oxlade-Chamberlain", "Yaş: 30, Kilo: 70kg, Boy: 1.75m");
        besiktasOyuncuBilgileri.put("Vincent Aboubakar", "Yaş: 31, Kilo: 84kg, Boy: 1.84m");
        besiktasOyuncuBilgileri.put("Cenk Tosun", "Yaş: 32, Kilo: 78kg, Boy: 1.83m");


        Map<String, String> rizesporOyuncuBilgileri = new HashMap<>();
        rizesporOyuncuBilgileri.put("Amir Hadziahmetovic", "Yaş: 28, Kilo: 76kg, Boy: 1.82m");
        rizesporOyuncuBilgileri.put("Ivo Grbic", "Yaş: 28, Kilo: 85kg, Boy: 1.95m");
        rizesporOyuncuBilgileri.put("Vaclav Juracka", "Yaş: 27, Kilo: 78kg, Boy: 1.85m");
        rizesporOyuncuBilgileri.put("Kamil Jablonski", "Yaş: 30, Kilo: 80kg, Boy: 1.89m");
        rizesporOyuncuBilgileri.put("Abdullah Durak", "Yaş: 27, Kilo: 76kg, Boy: 1.84m");
        rizesporOyuncuBilgileri.put("Hassan Bandé", "Yaş: 25, Kilo: 73kg, Boy: 1.78m");
        rizesporOyuncuBilgileri.put("Gökhan Alkan", "Yaş: 30, Kilo: 75kg, Boy: 1.80m");
        rizesporOyuncuBilgileri.put("Sami Khedira", "Yaş: 36, Kilo: 83kg, Boy: 1.85m");
        rizesporOyuncuBilgileri.put("Lamine Gassama", "Yaş: 33, Kilo: 80kg, Boy: 1.84m");
        rizesporOyuncuBilgileri.put("Deniz Kadah", "Yaş: 34, Kilo: 79kg, Boy: 1.87m");
        rizesporOyuncuBilgileri.put("Musa Çarkan", "Yaş: 23, Kilo: 70kg, Boy: 1.75m");

        Map<String, String> sivassporOyuncuBilgileri = new HashMap<>();
        sivassporOyuncuBilgileri.put("Ali Şaşal Vural", "Yaş: 33, Kilo: 84kg, Boy: 1.90m");
        sivassporOyuncuBilgileri.put("Ziya Erdal", "Yaş: 35, Kilo: 75kg, Boy: 1.78m");
        sivassporOyuncuBilgileri.put("Caner Osmanpaşa", "Yaş: 26, Kilo: 80kg, Boy: 1.86m");
        sivassporOyuncuBilgileri.put("Murat Paluli", "Yaş: 22, Kilo: 78kg, Boy: 1.85m");
        sivassporOyuncuBilgileri.put("Samba Camara", "Yaş: 31, Kilo: 82kg, Boy: 1.88m");
        sivassporOyuncuBilgileri.put("Hakan Arslan", "Yaş: 35, Kilo: 75kg, Boy: 1.78m");
        sivassporOyuncuBilgileri.put("Dia Saba", "Yaş: 30, Kilo: 68kg, Boy: 1.70m");
        sivassporOyuncuBilgileri.put("Clinton N'Jie", "Yaş: 30, Kilo: 70kg, Boy: 1.75m");
        sivassporOyuncuBilgileri.put("Charilaos Charisis", "Yaş: 28, Kilo: 72kg, Boy: 1.78m");
        sivassporOyuncuBilgileri.put("Rei Manaj", "Yaş: 26, Kilo: 77kg, Boy: 1.80m");
        sivassporOyuncuBilgileri.put("Mustapha Yatabare", "Yaş: 37, Kilo: 81kg, Boy: 1.90m");

        Map<String, String> eyupsporOyuncuBilgileri = new HashMap<>();
        eyupsporOyuncuBilgileri.put("Gökhan Değirmenci", "Yaş: 33, Kilo: 80kg, Boy: 1.88m");
        eyupsporOyuncuBilgileri.put("Burak Öksüz", "Yaş: 28, Kilo: 75kg, Boy: 1.80m");
        eyupsporOyuncuBilgileri.put("Mehmet Yiğit Göker", "Yaş: 24, Kilo: 78kg, Boy: 1.85m");
        eyupsporOyuncuBilgileri.put("Murat Uçar", "Yaş: 32, Kilo: 76kg, Boy: 1.82m");
        eyupsporOyuncuBilgileri.put("Murat Paluli", "Yaş: 22, Kilo: 78kg, Boy: 1.85m");
        eyupsporOyuncuBilgileri.put("Mehmet Feyzi Yıldırım", "Yaş: 27, Kilo: 72kg, Boy: 1.75m");
        eyupsporOyuncuBilgileri.put("Ömür Atasoy", "Yaş: 28, Kilo: 70kg, Boy: 1.73m");
        eyupsporOyuncuBilgileri.put("Emir Kaan Gültekin", "Yaş: 22, Kilo: 73kg, Boy: 1.78m");
        eyupsporOyuncuBilgileri.put("Murat Yıldırım", "Yaş: 36, Kilo: 75kg, Boy: 1.80m");
        eyupsporOyuncuBilgileri.put("Famoussa Koné", "Yaş: 29, Kilo: 78kg, Boy: 1.83m");
        eyupsporOyuncuBilgileri.put("Lamine Diaby", "Yaş: 27, Kilo: 75kg, Boy: 1.80m");

        Map<String, String> basaksehirOyuncuBilgileri = new HashMap<>();
        basaksehirOyuncuBilgileri.put("Volkan Babacan", "Yaş: 35, Kilo: 85kg, Boy: 1.97m");
        basaksehirOyuncuBilgileri.put("Leo Duarte", "Yaş: 27, Kilo: 80kg, Boy: 1.83m");
        basaksehirOyuncuBilgileri.put("Ömer Ali Şahiner", "Yaş: 31, Kilo: 70kg, Boy: 1.76m");
        basaksehirOyuncuBilgileri.put("Lucas Biglia", "Yaş: 37, Kilo: 75kg, Boy: 1.78m");
        basaksehirOyuncuBilgileri.put("Deniz Türüç", "Yaş: 30, Kilo: 74kg, Boy: 1.76m");
        basaksehirOyuncuBilgileri.put("Berkay Özcan", "Yaş: 25, Kilo: 70kg, Boy: 1.79m");
        basaksehirOyuncuBilgileri.put("Serdar Gürler", "Yaş: 31, Kilo: 73kg, Boy: 1.76m");
        basaksehirOyuncuBilgileri.put("Danijel Aleksic", "Yaş: 32, Kilo: 75kg, Boy: 1.82m");
        basaksehirOyuncuBilgileri.put("Krzysztof Piatek", "Yaş: 28, Kilo: 77kg, Boy: 1.83m");
        basaksehirOyuncuBilgileri.put("Mahmut Tekdemir", "Yaş: 35, Kilo: 76kg, Boy: 1.79m");
        basaksehirOyuncuBilgileri.put("Edgar Ié", "Yaş: 29, Kilo: 75kg, Boy: 1.79m");

        Map<String, String> goztepeOyuncuBilgileri = new HashMap<>();
        goztepeOyuncuBilgileri.put("İrfan Can Eğribayat", "Yaş: 25, Kilo: 84kg, Boy: 1.90m");
        goztepeOyuncuBilgileri.put("Berkan Emir", "Yaş: 25, Kilo: 75kg, Boy: 1.80m");
        goztepeOyuncuBilgileri.put("Atınç Nukan", "Yaş: 29, Kilo: 86kg, Boy: 1.91m");
        goztepeOyuncuBilgileri.put("Adnane Tighadouini", "Yaş: 31, Kilo: 73kg, Boy: 1.80m");
        goztepeOyuncuBilgileri.put("Obinna Nwobodo", "Yaş: 27, Kilo: 70kg, Boy: 1.70m");
        goztepeOyuncuBilgileri.put("Yalçın Kayan", "Yaş: 28, Kilo: 72kg, Boy: 1.75m");
        goztepeOyuncuBilgileri.put("Halil Akbunar", "Yaş: 29, Kilo: 68kg, Boy: 1.68m");
        goztepeOyuncuBilgileri.put("Soner Aydoğdu", "Yaş: 32, Kilo: 74kg, Boy: 1.78m");
        goztepeOyuncuBilgileri.put("Efe Can Saçıkara", "Yaş: 22, Kilo: 70kg, Boy: 1.75m");
        goztepeOyuncuBilgileri.put("Yaw Ackah", "Yaş: 24, Kilo: 75kg, Boy: 1.80m");
        goztepeOyuncuBilgileri.put("João Figueiredo", "Yaş: 27, Kilo: 78kg, Boy: 1.83m");

        Map<String, String> trabzonsporOyuncuBilgileri = new HashMap<>();
        trabzonsporOyuncuBilgileri.put("Uğurcan Çakır", "Yaş: 27, Kilo: 88kg, Boy: 1.91m");
        trabzonsporOyuncuBilgileri.put("Eren Elmalı", "Yaş: 23, Kilo: 70kg, Boy: 1.78m");
        trabzonsporOyuncuBilgileri.put("Stefano Denswil", "Yaş: 30, Kilo: 78kg, Boy: 1.85m");
        trabzonsporOyuncuBilgileri.put("Marc Bartra", "Yaş: 32, Kilo: 73kg, Boy: 1.84m");
        trabzonsporOyuncuBilgileri.put("Batista Mendy", "Yaş: 24, Kilo: 75kg, Boy: 1.82m");
        trabzonsporOyuncuBilgileri.put("Abdülkadir Ömür", "Yaş: 24, Kilo: 66kg, Boy: 1.68m");
        trabzonsporOyuncuBilgileri.put("Anastasios Bakasetas", "Yaş: 30, Kilo: 76kg, Boy: 1.84m");
        trabzonsporOyuncuBilgileri.put("Enis Bardhi", "Yaş: 28, Kilo: 68kg, Boy: 1.72m");
        trabzonsporOyuncuBilgileri.put("Trezeguet", "Yaş: 29, Kilo: 71kg, Boy: 1.74m");
        trabzonsporOyuncuBilgileri.put("Paul Onuachu", "Yaş: 29, Kilo: 93kg, Boy: 2.01m");
        trabzonsporOyuncuBilgileri.put("Edin Visca", "Yaş: 33, Kilo: 72kg, Boy: 1.72m");

        Map<String, String> konyasporOyuncuBilgileri = new HashMap<>();
        konyasporOyuncuBilgileri.put("Deniz Mehmet", "Yaş: 31, Kilo: 80kg, Boy: 1.88m");
        konyasporOyuncuBilgileri.put("Guilherme Sityá", "Yaş: 34, Kilo: 75kg, Boy: 1.80m");
        konyasporOyuncuBilgileri.put("Adil Demirbağ", "Yaş: 25, Kilo: 78kg, Boy: 1.85m");
        konyasporOyuncuBilgileri.put("Abdülkerim Bardakcı", "Yaş: 29, Kilo: 82kg, Boy: 1.88m");
        konyasporOyuncuBilgileri.put("Francisco Calvo", "Yaş: 31, Kilo: 77kg, Boy: 1.80m");
        konyasporOyuncuBilgileri.put("Soner Dikmen", "Yaş: 29, Kilo: 75kg, Boy: 1.78m");
        konyasporOyuncuBilgileri.put("Amir Hadžiahmetović", "Yaş: 26, Kilo: 73kg, Boy: 1.79m");
        konyasporOyuncuBilgileri.put("Robert Muric", "Yaş: 27, Kilo: 72kg, Boy: 1.80m");
        konyasporOyuncuBilgileri.put("Sokol Cikalleshi", "Yaş: 33, Kilo: 78kg, Boy: 1.83m");
        konyasporOyuncuBilgileri.put("Muhammet Demir", "Yaş: 31, Kilo: 76kg, Boy: 1.81m");
        konyasporOyuncuBilgileri.put("Bruno Paz", "Yaş: 25, Kilo: 74kg, Boy: 1.78m");


        oyuncuBilgileri.put("Fenerbahçe", fenerbahceOyuncuBilgileri);
        oyuncuBilgileri.put("Galatasaray", galatasarayOyuncuBilgileri);
        oyuncuBilgileri.put("Beşiktaş", besiktasOyuncuBilgileri);
        oyuncuBilgileri.put("Rizespor", rizesporOyuncuBilgileri);
        oyuncuBilgileri.put("Sivasspor", sivassporOyuncuBilgileri);
        oyuncuBilgileri.put("Eyüpspor", eyupsporOyuncuBilgileri);
        oyuncuBilgileri.put("Başakşehir", basaksehirOyuncuBilgileri);
        oyuncuBilgileri.put("Göztepe", goztepeOyuncuBilgileri);
        oyuncuBilgileri.put("Trabzonspor", trabzonsporOyuncuBilgileri);
        oyuncuBilgileri.put("Konyaspor", konyasporOyuncuBilgileri);
    }


    public static List<String> getOyuncular(String takim) {
        return takimOyunculari.getOrDefault(takim, List.of());
    }


    public static String getOyuncuBilgileri(String takim, String oyuncu) {
        Map<String, String> takimBilgileri = oyuncuBilgileri.getOrDefault(takim, new HashMap<>());
        return takimBilgileri.getOrDefault(oyuncu, "Bilgi bulunamadı");
    }
}
