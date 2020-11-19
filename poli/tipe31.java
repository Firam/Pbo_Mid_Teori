import java.util.Scanner;
class tipe31 extends tipe {
	void tampil31() {
		bb=100000;
		System.out.println("Biaya Beban = Rp.100.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jmp = masukan.nextInt();
		tot = jmp * bb;
		System.out.println("Total harga = " +tot);
		System.out.print("Masukkan Bayaran = ");
		bayar = masukan.nextInt();
		kembalian = bayar-tot;
	}
}