/*
	File		: OperasiTitik.java
	Penulis 	: Georgy Banny Rizky Wasiat - 24060121140103
	Deskripsi	: Kelas ini berisi program untuk menjalankan kelas titik.
*/

class OperasiTitik{
	private static void refleksiSumbuX (Titik t){
		t.ordinat = t.ordinat*(-1);
	}

	private static void refleksiSumbuY (Titik t){
		t.absis = t.absis*(-1);
	}
	
	public static void refleksiX (Titik t){
		refleksiSumbuX(t);
		System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
	}
	
	public static void refleksiY (Titik t) {
		refleksiSumbuY(t);
		System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
	}
} 