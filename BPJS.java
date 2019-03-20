public class BPJS{
	/*(int noKartu,int noKK, int noIndukKeluarga, String namaAnggota, String alamatAnggota, String tempatTanggalLahir, int noTelepon, 
	String pekerjaan,String kelasRawat, String lokasiAskes, int umur,String golDarah*/
	public static void main (String[] args){
		kartuSehat as = new kartuSehat(7898983, 11122111, 320234, "Peny Agustin", "Kota Bandung","Ciamis, 13 Agustus 1998", 182, "Mahasiswa", "I(Satu)","Klinik", 20, "O");
		System.out.println("	KARTU SEHAT			");
		System.out.print("----------"+as.NoKK());
		System.out.println("----------");
		System.out.println("Nama		: "+as.NamaAnggota());
		System.out.println("NIK		: "+as.NoIndukKeluarga());
		System.out.println("No KK 		: "+as.NoKK());
		System.out.println("TTL 		: "+as.TempatTanggalLahir());
		System.out.println("Umur	 	: "+as.Umur());
		System.out.println("Gol. Darah	: "+as.GolDarah());
		System.out.println("Alamat		: "+as.AlamatAnggota());
		System.out.println("No Telp		: "+as.NoTelepon());
		System.out.println("Pekerjaan	: "+as.Pekerjaan());
		System.out.println("Kelas Rawat	: "+as.KelasRawat());
		System.out.println("Lokasi Askes	: "+as.LokasiAskes());
	}
}