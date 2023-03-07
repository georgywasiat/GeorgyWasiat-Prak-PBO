/*
	File		: MOperasiTitik.java
	Penulis 	: Georgy Banny Rizky Wasiat - 24060121140103
	Deskripsi	: Kelas yang berisi program untuk menjalankan kelas operasi titik.
*/

public class MOperasiTitik{
	public static void main(String[] args){
		Titik t = new Titik(6,6);
		OperasiTitik o = new OperasiTitik();
		
		System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
		
		// REFLEKSI TERHADAP SUMBU X
		o.refleksiX(t);
		
		// REFLEKSI TERHADAP SUMBU Y
		o.refleksiY(t);
	}
}