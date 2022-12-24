import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Berobat {
    int id_transaksi;
    int id_pasien;
    String tanggal_berobat;
    String deskripsi_keluhan;
    String nama;
        void isi_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("Masukan ID Transaksi       :");
        id_transaksi=input.nextInt();
        System.out.println("Masukan ID Pasien          :");
        id_pasien= input.nextInt();
        System.out.println("Masukan Nama Pasien        :");
        nama= input.next();
        System.out.println("Masukan Tanggal Berobat    :");
        tanggal_berobat= input.next();
        System.out.println("Masukan Deskripsi Keluhan  :");
        deskripsi_keluhan= input.next();


    }
    void lihat_data(){
        java.io.File file = new java.io.File("transaksi.txt");
        try{
            PrintWriter output = new PrintWriter(file);
            output.println(id_transaksi);
            output.println(id_pasien);
            output.println(nama);
            output.println(tanggal_berobat);
            output.println(deskripsi_keluhan);
            output.close();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    void baca_file(){

    }

}
