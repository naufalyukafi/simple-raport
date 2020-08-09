
import java.util.Scanner;

public class FinalyProject {

    static int mapelU = 4, siswa2 = 5, jml, mapelArr = 5, nilai[][], coba3, kelas2, data[];
    static double rata[], jumlah[], coba, coba2, coba4, coba5;
    static String jmlSiswa[], coba6;
    static String[] mapelUkk = {
        "Rata-rata UH ",
        "Rata-rata Tugas",
        "Nilai UTS",
        "Nilai UKK"
    };
    static String[] mapelUas = {
        "Rata-rata UH",
        "Rata-rata Tugas",
        "Nilai UTS",
        "Nilai UAS"
    };

//    static String[] namaSiswa2 = {"Naufal Yukafi Ridlo", "Galih Maulana Yasak", "Anwar Ibrahim", "Adzikri Candra"};
    static int[] Nis = {2113, 2114, 2115, 2116};
    static Scanner sc = new Scanner(System.in);
    static int[] fitur = new int[100];
    static int[] kelas = new int[6];
    static String[] Mapel1 = {"Matematika       ",
        "Ilmu Pengetahuan Alam",
        "Ilmu Pengetahuan Sosial",
        "Bahasa Indonesia       ",
        "Bahasa Inggris     "};

    
    
    static void inputMMapel() {
        System.out.println("=====================================================");
        System.out.println("Selamat Datang di Fitur Input Nilai Mata Pelajaran");
        System.out.println("======================================================");
        nilai = new int[mapelU][mapelArr];
        jumlah = new double[mapelU];
        rata = new double[mapelU];
        System.out.println();
        if (kelas2 == 6) {
            for (int i = 0; i < mapelU; i++) {
                System.out.println("Masukkan " + mapelUas[i]);
                for (int j = 0; j < mapelArr; j++) {
                    System.out.print("Masukan nilai " + Mapel1[j] + " : ");
                    nilai[i][j] = sc.nextInt();
                    coba = nilai[i][j];
                    jumlah[i] = jumlah[i] + nilai[i][j];
                }
                rata[i] = jumlah[i] / mapelArr;
                System.out.println();

            }

        } else {
            for (int i = 0; i < mapelU; i++) {
                System.out.println("Masukkan " + mapelUkk[i]);
                for (int j = 0; j < mapelArr; j++) {
                    System.out.print("Masukan nilai " + Mapel1[j] + " : ");
                    nilai[i][j] = sc.nextInt();
                    coba = nilai[i][j];
                    jumlah[i] = jumlah[i] + nilai[i][j];
                }
                rata[i] = jumlah[i] / mapelArr;
                System.out.println();

            }

        }

    }

    static void output() {
        System.out.println("");
        if (coba == 0.0) {
            System.out.println("Masukkan 'Fitur Menu Input dan Kelola Nilai' Terlebih Dahulu! ");
            System.out.println("1.Kembali");
            System.out.println("2.Keluar");
            System.out.println("Pilih menu ");
            coba2 = sc.nextInt();
            if (coba2 == 1) {
                inputData();
            } else if (coba2 == 2) {
                System.exit(0);
            }
        } else {
            System.out.println("=============================================================================================================");
            System.out.println("                                RAPORT SISWA SDN 01 LUMAJANG ");
            System.out.println("=============================================================================================================");
            System.out.println();
            System.out.println("NAMA            : " + coba6);
            System.out.println("NIS             : " + Nis[0]);
            System.out.println("KELAS           : " + kelas2 + " SD");
            System.out.println("");
            System.out.println("=============================================================================================================");
            System.out.println("\t\t       MTK\t        IPA\t       IPS\t      B Indo\t     B Inggris \t\tRata");
            if (kelas2 == 6) {
                for (int i = 0; i < mapelU; i++) {
                    System.out.print(mapelUas[i]);
                    for (int j = 0; j < mapelArr; j++) {
                        System.out.print("\t\t" + nilai[i][j]);
                    }
                    System.out.print("\t\t" + rata[i]);
                    System.out.println();
                    coba4 += rata[i];
                    coba5 = coba4 / 4;
                }
            } else {
                for (int i = 0; i < mapelU; i++) {
                    System.out.print(mapelUkk[i]);
                    for (int j = 0; j < mapelArr; j++) {
                        System.out.print("\t\t" + nilai[i][j]);
                    }
                    System.out.print("\t\t" + rata[i]);
                    System.out.println();
                    coba4 += rata[i];
                    coba5 = coba4 / 4;
                }

            }

            System.out.printf("TOTAL  \t\t\t\t\t\t\t\t\t\t\t\t        " + "%.2f", coba4);
            System.out.println("");
            System.out.printf("NILAI AKHIR  \t\t\t\t\t\t\t\t\t\t\t        " + "%.2f", coba5);
            System.out.println("");
            System.out.println("=============================================================================================================");
            System.out.println();

        }

    }

    public static void main(String[] args) {
        System.out.println("Selamat Datang di E-Raport SDN 01 Lumajang");
        login();
    }

    static void inputData() {
        System.out.println("=========== Fitur Penilaian Akademik SDN 01 Lumajang ===============");
        for (int i = 0; i < fitur.length; i++) {
            System.out.println("");
            System.out.println("[1] Fitur Menu Data Siswa");
            System.out.println("[2] Fitur Menu Matapelajaran");
            System.out.println("[3] Fitur Menu Input dan Kelola Nilai ");
            System.out.println("[4] Fitur Menu Cetak Rapor Nilai ");
            System.out.println("[5] Fitur Nilai Per Matapelajaran");
            System.out.println("[6] Fitur Raport Kelulusan / Naik Kelas");
            System.out.println("[7] Keluar ");
            System.out.println("Pilih Fitur yang Tersedia : ");
            fitur[i] = sc.nextInt();
            if (fitur[i] == 1) {
                DataSiswa();
            } else if (fitur[i] == 2) {
                MataPelajaran();
            } else if (fitur[i] == 3) {
                inputMMapel();
            } else if (fitur[i] == 4) {
                output();
            } else if (fitur[i] == 5) {
                NilaiPermapel();
            } else if (fitur[i] == 6) {
                RaportSosiologi();
            } else if (fitur[i] == 7) {
                System.out.println("");
                System.out.println("-------------------------------------------------");
                System.out.println("Anda Keluar Dari Program E-Raport, Terimakasih");
                System.out.println("-------------------------------------------------");
                System.out.println("");
                keluar();

            }
        }
    }

    static void keluar() {
        System.exit(0);
    }

    static void login() {
        System.out.print("Masukkan Username Anda    : ");
        String username = sc.nextLine();
        System.out.print("Password                  : ");
        String password = sc.nextLine();
        System.out.println("-----------------------------------");
        if (username.equals("user") && password.equals("user")) {
            System.out.println("Anda Berhasil Login");
            System.out.println("-----------------------------------");
            System.out.println("");
            inputData();

        } else if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Anda Berhasil Login");
            System.out.println("-----------------------------------");
            System.out.println("");
            inputData();
        } else {
            System.out.println("Username/password Salah");
            System.out.println("1.Ulangi");
            System.out.println("2.Informasi Login ");
            System.out.print("Pilih menu : ");
            int menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                login();
            } else {
                System.out.println("");
                System.out.println("|| anda bisa menggunakan username = 'user' dan password = 'user'        ||");
                System.out.println("|| anda juga bisa menggunakan username = 'admin' dan password = 'admin' ||");
                System.out.println("");
                System.out.print("Login Kembali (1=ya, 2=tidak) ");
                menu = sc.nextInt();
                sc.nextLine();
                if (menu == 1) {
                    System.out.println("");
                    login();
                } else {
                    System.exit(0);
                }
            }

        }

    }

    static void MataPelajaran() {
        System.out.println("=======================================");
        System.out.println("Selamat Datang di Fitur Mata Pelajaran");
        System.out.println("=======================================");
        System.out.println("");
        for (int i = 0; i < fitur.length; i++) {
            System.out.println("Apa Saja Mata Pelajaran Kelas 1-6");
            System.out.println("[1] Lihat Mata Pelajaran");
            System.out.println("[2] Kembali ke Fitur Utama");
            System.out.print("Plih Menu yang Tersedia: ");
            fitur[i] = sc.nextInt();
            if (fitur[i] == 1) {
                jenisMapel();
            } else if (fitur[i] == 2) {
                break;
            }
            System.out.println("");
        }
        System.out.println("");
    }

    static void jenisMapel() {
        System.out.println("[1] Matematika ");
        System.out.println("[2] Ilmu Pengetahuan Alam");
        System.out.println("[3] Ilmu Pengetahuan Sosial");
        System.out.println("[4] Bahasa Indonesia");
        System.out.println("[5] Bahasa Inggris");
    }

    static void NilaiPermapel() {
        for (int i = 0; i < fitur.length; i++) {
            System.out.println("");
            System.out.println("=======================================");
            System.out.println("Selamat Datang di Fitur Nilai Permapel");
            System.out.println("=======================================");

            System.out.println("1.Matematika");
            System.out.println("2.Ilmu Pengetahuan Alam");
            System.out.println("3.Ilmu Pengethuan Sosial");
            System.out.println("4.Bahasa Indoneisa");
            System.out.println("5.Bahasa Inggris");
            System.out.println("6.Kembali");
            System.out.print("Pilih Menu ");
            fitur[i] = sc.nextInt();
            if (fitur[i] == 1) {
                System.out.println("");
                for (int k = 0; k < mapelU; k++) {
                    if (kelas2 == 6) {
                        System.out.print(mapelUas[k]);
                    } else if (kelas2 == 1) {
                        System.out.print(mapelUkk[k]);
                    }
                    for (int j = 0; j < 1; j++) {
                        System.out.print("\t\t" + nilai[k][0]);
                    }
                    System.out.println("");
                }
                System.out.println("");
            } else if (fitur[i] == 2) {
                System.out.println("");
                for (int k = 0; k < mapelU; k++) {
                    if (kelas2 == 6) {
                        System.out.print(mapelUas[k]);
                    } else if (kelas2 == 1) {
                        System.out.print(mapelUkk[k]);
                    }
                    for (int j = 0; j < 1; j++) {
                        System.out.print("\t\t" + nilai[k][1]);
                    }
                    System.out.println("");
                }
                System.out.println("");
            } else if (fitur[i] == 3) {
                System.out.println("");
                for (int k = 0; k < mapelU; k++) {
                    if (kelas2 == 6) {
                        System.out.print(mapelUas[k]);
                    } else if (kelas2 == 1) {
                        System.out.print(mapelUkk[k]);
                    }
                    for (int j = 0; j < 1; j++) {
                        System.out.print("\t\t" + nilai[k][2]);
                    }
                    System.out.println("");
                }
                System.out.println("");
            } else if (fitur[i] == 4) {
                System.out.println("");
                for (int k = 0; k < mapelU; k++) {
                    if (kelas2 == 6) {
                        System.out.print(mapelUas[k]);
                    } else if (kelas2 == 1) {
                        System.out.print(mapelUkk[k]);
                    }
                    for (int j = 0; j < 1; j++) {
                        System.out.print("\t\t" + nilai[k][3]);
                    }
                    System.out.println("");
                }
                System.out.println("");
            } else if (fitur[i] == 5) {
                System.out.println("");
                for (int k = 0; k < mapelU; k++) {
                    if (kelas2 == 6) {
                        System.out.print(mapelUas[k]);
                    } else if (kelas2 == 1) {
                        System.out.print(mapelUkk[k]);
                    }
                    for (int j = 0; j < 1; j++) {
                        System.out.print("\t\t" + nilai[k][4]);
                    }
                    System.out.println("");
                }
                System.out.println("");
            } else if (fitur[i] == 6) {
                inputData();
            }
        }
    }

    static void DataSiswa() {
        System.out.println("=======================================");
        System.out.println("Selamat Datang di Fitur Data Siswa");
        System.out.println("=======================================");
        sc.nextLine();
        for (int i = 0; i < 1; i++) {
            System.out.println("============================");
            System.out.println("Data Siswa SDN 01 Lumajang");
            System.out.println("============================");
            System.out.print("Masukkan Nama Siswa : ");
            coba6 = sc.nextLine();

            if (coba6.equals("Naufal Yukafi Ridlo") || coba6.equals("naufal")) {
                System.out.println("NIS :  " + Nis[0]);
                System.out.println("Pilih Nama Siswa ");
                System.out.println("[1] Kelas 1");
                System.out.println("[2] Kelas 2");
                System.out.println("[3] Kelas 3");
                System.out.println("[4] Kelas 4");
                System.out.println("[5] Kelas 5");
                System.out.println("[6] Kelas 6");
                System.out.println("Masukkan Kelas Siswa : ");
                kelas[i] = sc.nextInt();
                kelas2 = kelas[i];

            } else {
                System.out.println("NIS :  " + Nis[1]);
                System.out.println(" ");
                System.out.println("[1] Kelas 1");
                System.out.println("[2] Kelas 2");
                System.out.println("[3] Kelas 3");
                System.out.println("[4] Kelas 4");
                System.out.println("[5] Kelas 5");
                System.out.println("[6] Kelas 6");
                System.out.println("Masukkan Kelas Siswa : ");
                kelas[i] = sc.nextInt();
                kelas2 = kelas[i];

            }

            System.out.println("");
        }

    }

    static void RaportSosiologi() {
        System.out.println("");
        if (kelas2 == 6) {
            if (coba5 >= 70 && coba5 <= 100) {
                System.out.println("Berdasarkan Raport yang Telah anda Terima, Anda di Nyatakan LULUS");
            } else if (coba5 == 0.0) {
                System.out.println("");
                System.out.println("Mohon Maaf, Anda Belum Mengisi 'Input dan Kelola Nilai', Segera Anda isi! ");
            } else {
                System.out.println("Mohon Maaf Anda Dinyatakan TIDAK LULUS");
            }
        } else if (coba5 >= 70 && coba5 <= 100) {
            System.out.println("Berdasarkan Raport yang Telah anda Terima, Anda di Nyatakan Naik Kelas");
        } else if (coba5 == 0.0) {
            System.out.println("");
            System.out.println("Mohon Maaf, Anda Belum Mengisi 'Input dan Kelola Nilai', Segera Anda isi! ");
        } else {
            System.out.println("Mohon Maaf Anda Dinyatakan Tidak Naik kelas");
        }

    }
}
