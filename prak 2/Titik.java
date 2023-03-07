/*
	File 		: Titik.java
	Penulis		: Georgy Banny Rizky Wasiat - 24060121140103
	Deskripsi	: Kelas ini merupakan program untuk membuat data koordinat titik dan menampilkannya ke layar.
*/

public class Titik{
	double absis;			
	double ordinat;				
	static int counterTitik;	
	
	public Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}

	public Titik(double a, double b){
		counterTitik++;
		absis = a;
		ordinat = b;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat (){
		return ordinat;
	}
	
	int getCounterTitik (){
		return counterTitik;
	}
}