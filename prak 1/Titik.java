class Titik{
	double absis;			//absis
	double ordinat;		     //ordinat
	static int counterTitik; 	//penghitung objek titik yang telah dibuat
	
	Titik(){
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

	Titik(double a, double b){
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
