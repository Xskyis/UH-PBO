package LATPBO.src;
public class siswa {
int nilaiproduktif;
String nama,kelas;
int absen;



void ratarata(){

    if (nilaiproduktif>=75)
{
System.out.println("Keterangan : Selamat Anda LULUS");
}
else
{
System.out.println("Keterangan : Mohon Maaf Anda Gagal");
}
}

void nilaiproduktif(){
nilaiproduktif = 95;
System.out.println("Nilai Produktif RPL NABIL adalah : "+nilaiproduktif);
}

void biodata(){
nama = "Nabil";
kelas = "XRPL2";
absen = 3;

System.out.println(" ## Biodata Anda ## ");
System.out.println();
System.out.println("Nama  : "+nama);
System.out.println("Kelas : "+kelas);
System.out.println("Absen : "+absen);
System.out.println();
System.out.println("Nilai Dibawah 75 Tidak Lulus...........");
System.out.println();

}
}

