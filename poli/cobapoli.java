import java.util.Scanner;
public class cobapoli{
public static void main (String[] args) {
	tipe   a = new tipe();
	tipe31 b = new tipe31();
	tipe32 c = new tipe32();
	tipe33 d = new tipe33();
	tipe34 e = new tipe34();
	tipe35 f = new tipe35();
	tipe40 g = new tipe40();
	int pilihan;
	Scanner masukan = new Scanner(System.in);



	a.tampil();
	System.out.print("Pilihan = ");
	pilihan = masukan.nextInt();
	if (pilihan == 31) {
		b.tampil31();
		System.out.println();
		System.out.println("Nama = " +a.nama); 
		System.out.println("Total harga = " +b.tot);
		System.out.println("Bayar = " +b.bayar); 
		System.out.println("Kembalian = " +b.kembalian);
	}
	else
	if (pilihan == 32) {
		c.tampil32();
		System.out.println();
		System.out.println("Nama = " +a.nama); 
		System.out.println("Total harga = " +c.tot);
		System.out.println("Bayar = " +c.bayar); 
		System.out.println("Kembalian = " +c.kembalian);
	}
	else
	if (pilihan == 33) {
		d.tampil33();
		System.out.println();
		System.out.println("Nama = " +a.nama); 
		System.out.println("Total harga = " +d.tot);
		System.out.println("Bayar = " +d.bayar); 
		System.out.println("Kembalian = " +d.kembalian);
	}
	else
	if (pilihan == 34) {
		e.tampil34();
		System.out.println();
		System.out.println("Nama = " +a.nama); 
		System.out.println("Total harga = " +e.tot);
		System.out.println("Bayar = " +e.bayar); 
		System.out.println("Kembalian = " +e.kembalian);
	}
	else
	if (pilihan == 35) {
		f.tampil35();
		System.out.println();
		System.out.println("Nama = " +a.nama); 
		System.out.println("Total harga = " +f.tot);
		System.out.println("Bayar = " +f.bayar); 
		System.out.println("Kembalian = " +f.kembalian);
	}
	else
	if (pilihan == 40) {
		g.tampil40();
		System.out.println();
		System.out.println("Nama = " +a.nama); 
		System.out.println("Total harga = " +g.tot);
		System.out.println("Bayar = " +g.bayar); 
		System.out.println("Kembalian = " +g.kembalian);
	}
	else {
		System.out.println("Pilihan anda tidak terdaftar, silahkan masukkan pilihan yang tersedia");
	}
	
	
}
}