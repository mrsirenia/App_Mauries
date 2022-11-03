package com.uts_mobile.profil;

import java.util.ArrayList;

public class MantanData {

    private static String[] namaMantan = {
            "Elizabeth Olsen & Tom Hiddleston",
            "Zoe Saldana & Bradley Cooper",
            "Marisa Tomei & Robert Downey Jr.",
            "Zendaya & Tom Holland"
    };

    private static String[] lamaPacaran = {
            "7 Bulan",
            "1 Tahun",
            "1 Bulan",
            "Masih sampai sekarang!"
    };

    private static String[] alasanPutus = {
            "Sempat dikabarkan sempat melakukan pendekatan, namun belum mau menjalin komitmen yang serius.",
            "Tidak diketahui jelas dengan jelas apa alasannya, dan apakah mereka masih berhubungan baik.",
            "Alasannya belum diketahui dengan jelas, namun  meskipun sudah tidak bersama lagi mereka masih berteman baik.",
            "Dikabarkan masih sampai sekarang, dengan relationship yang sehat."
    };

    private static int[] gambarMantan = {
            R.drawable.mantan1,
            R.drawable.mantan2,
            R.drawable.mantan3,
            R.drawable.mantan4
    };

    static ArrayList<Mantan> getListData(){
        ArrayList<Mantan> list = new ArrayList<>();
        for(int position = 0 ; position < namaMantan.length ; position++){
            Mantan mantan = new Mantan();
            mantan.setNama(namaMantan[position]);
            mantan.setLamaPacaran(lamaPacaran[position]);
            mantan.setAlasanPutus(alasanPutus[position]);
            mantan.setGambar(gambarMantan[position]);
            list.add(mantan);
        }

        return list;
    }

}
