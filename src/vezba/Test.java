package vezba;

public class Test {

	public static void main(String[] args) 
	{
		Vozac vozac1 = new Vozac();
		Vozac vozac2 = new Vozac("Filip", "Zecevic", false);
		System.out.println(vozac1.toString());
		System.out.println(vozac2.toString());
		
		Vozilo vozilo = new Vozilo("Automobil", "Crna", vozac2);
		System.out.println(vozilo.toString());
		System.out.print("Cena goriva na 100km: ");
		System.out.println(vozilo.CenaGorivaNa100Km(225) + "din.");
		
		
	}

}
