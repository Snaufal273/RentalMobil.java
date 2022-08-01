/*

    Program ini di modifikasi oleh Shalsabilillah Naufal dari :
    https://kelasprogrammer.com/contoh-program-java-penjualan-barang/
    
    CP : shalsabilillah.naufal@gmail.com

*/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

class RentalMobil {
    public static void main(String[] args) {
        
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
        System.out.println("Selamat Datang di Rental Aja");
        System.out.println("By : Shalsabilillah Naufal");
        System.out.println("CP : shalsabilillah.naufal@gmail.com");
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
      Scanner input = new Scanner(System.in);
         DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
         DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
         //Deklarasi variabel
         int jum=0, i=0;
         double total_bayar=0;
         //Deklarasi array
         int [] kode = new int[5];
         int [] jum_hari = new int[5];
         int [] harga = new int[5];
         double [] sub_total = new double[5];
         // double [] diskon= new double [5];
         String [] unit = new String[5];
         
         System.out.println("App sewa mobil Rental Aja");
         
         System.out.println("Daftar Harga Sewa : ");
         System.out.println("===================================");
         System.out.println("1. Avanza");
         System.out.println("Harga Sewa Perhari : Rp. 300.0000");
         System.out.println("===================================");
         System.out.println("2. Innova");
         System.out.println("Harga Sewa Perhari : Rp. 500.0000");
         System.out.println("===================================");
         System.out.println("3. Alphard");
         System.out.println("Harga Sewa Perhari : Rp. 1000.0000");
         System.out.println("===================================");
         System.out.println("4. Camry");
         System.out.println("Harga Sewa Perhari : Rp. 1000.0000");
         System.out.println("===================================");
         System.out.println("5. Pajero Sport");
         System.out.println("Harga Sewa Perhari : Rp. 800.0000");
         System.out.println("===================================");
         System.out.println("6. Fortuner");
         System.out.println("Harga Sewa Perhari : Rp. 800.0000");
         System.out.println("===================================");
         
         System.out.println("Masukan Jumlah Unit Sewa : ");
         jum=input.nextInt();
         System.out.println(" ");
         //Memasukan elemen didalam array
         for (i=0; i<jum;i++){
              System.out.print("Masukan Kode unit Ke-"+(i+1)+" : ");
              kode[i]=input.nextInt();
              System.out.print("Masukan Jumlah Hari unit ke- "+(i+1)+" : ");
              jum_hari[i]=input.nextInt();
              //Menentukan barang berdasarkan kode yang dimmasukan
              switch (kode[i]){
                  case 1 : 
                            unit[i]="Avanza";
                            harga[i]=300000;
                            //diskon[i]=0.1;
                            break;
                  case 2 : 
                            unit[i]="Innova";
                            harga[i]=500000;
                            //diskon[i]=0.05;
                            break;
                  case 3 : 
                            unit[i]="Alphard";
                            harga[i]=1000000;
                            //diskon[i]=0;
                            break;
                  case 4 : 
                            unit[i]="Camry";
                            harga[i]=1000000;
                            //diskon[i]=0.2;
                            break;
                  case 5 : 
                            unit[i]="Pajero Sport";
                            harga[i]=800000;
                            //diskon[i]=0.1;
                            break;
                  case 6 : 
                            unit[i]="Fortuner";
                            harga[i]=800000;
                            //diskon[i]=0.1;
                            break;
                  default : 
                            System.out.println("Kode Barang Tidak Tersedia");
              }
         }
          //Pengaturan format number
          formatRp.setCurrencySymbol("Rp. ");
          formatRp.setMonetaryDecimalSeparator(',');
          formatRp.setGroupingSeparator('.');
          kursIndonesia.setDecimalFormatSymbols(formatRp);
          
          System.out.println(" ");
          System.out.println("No   Nama Unit     Harga            Jum_Hari    Sub Total");  
          //Menampilkan seluruh elemen di dalam array
          for (i=0; i<jum;i++){ 
             sub_total[i]=jum_hari[i]*harga[i];
             total_bayar+=sub_total[i];
               System.out.println(i+1+"    "+unit[i]+"   "+kursIndonesia.format(harga[i])+"    "+jum_hari[i]+"     "+kursIndonesia.format(sub_total[i])); 
          }
          System.out.println(" ");
          //Menampilkan total bayar
          System.out.println("Total Bayar : "+kursIndonesia.format(total_bayar));
          System.out.println("Terimakasih Sudah Menggunakan APP Rental Aja")
    }
}