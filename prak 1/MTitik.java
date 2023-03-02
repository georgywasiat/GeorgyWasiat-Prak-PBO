class MTitik{
	public static void main (String[] args){
		Titik t1, t2, t3;
		
		//Titik T1 = (1,2)
		t1 = new Titik();
		t1.setAbsis(1);
		t1.setOrdinat(2);
		
		//Titik T2 = (3,4)
		t2 = new Titik();
		t2.setAbsis(3);
		t2.setOrdinat(4);
		
		//Titik T3 = (5,6)
		t3 = new Titik(5,6);
		
		//Run program
		System.out.println("Jumlah objek titik : " + t1.getCounterTitik());
		System.out.println("T1 (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		System.out.println("T2 (" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
		System.out.println("T3 (" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
	}
}
