package com.rizkykhapidsyah;

/* Created by Rizky Khapidsyah */

public class MembatasiParameterTipeGeneric {
    public static void main(String[] args) {
        System.out.println("===========\nPERCOBAAN 1\n===========");

        Integer[] AngkaAngka = {27, 44, 2, 88, 5};
        Double[] HargaHarga = {2.83, 4.95, 5.11, 9.65, 7.54};
        Character[] KarakterKarakter = {'r', 'I', 'z', 'k', 'Y'};
        String[] KotaKota = {"Medan", "Pekanbaru", "Palembang", "Jambi", "Banda Aceh"};

        /* Sort Dengan bubbleSort */
        bubbleSort(AngkaAngka);
        bubbleSort(HargaHarga);
        bubbleSort(KarakterKarakter);
        bubbleSort(KotaKota);

        /* Menampilkan Array Yang Di Sort */
        System.out.println("Sorted Dengan Tipe Integer    : ");
        tampilkanData(AngkaAngka);
        System.out.println("Sorted Dengan Tipe Double     : ");
        tampilkanData(HargaHarga);
        System.out.println("Sorted Dengan Tipe Character  : ");
        tampilkanData(KarakterKarakter);
        System.out.println("Sorted Dengan Tipe String     : ");
        tampilkanData(KotaKota);

        System.out.println("\n\n===========\nPERCOBAAN 2\n===========");
        Integer Nilai1 = 78;
        double Nilai2 = 76.84;

        double Total = Tambahkan(Nilai1, Nilai2);
        System.out.println("Total Penambahan  = " + Total);
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] daftar) {
        int j;
        boolean bendera = true;
        E temp;

        while (bendera) {
            bendera = false;

            for (j = 0; j < daftar.length - 1; j++) {
                if (daftar[j].compareTo(daftar[j + 1]) > 0) {
                    temp = daftar[j];
                    daftar[j] = daftar[j + 1];
                    daftar[j + 1] = temp;
                    bendera = true;
                }
            }
        }
    }

    public static <E> void tampilkanData(E[] daftar) {
        for (int i = 0; i < daftar.length; i++) {
            System.out.println(daftar[i] + " ");
        }

        System.out.println();
    }

    public static <T extends Number> double Tambahkan(T Pertama, T Kedua) {
        return Pertama.doubleValue() + Kedua.doubleValue();
    }
}
