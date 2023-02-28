package vezba;

public class Vozac 
{
	private String Ime;
	private String Prezime;
	private boolean VozackaDozvola;
	
	
	
	
	public String toString()
	{
		return "Ime: " + this.Ime + " Prezime: " + this.Prezime; 
	}
	
	public Vozac() 
	{
	}
	public Vozac(String ime, String prezime, boolean vozackaDozvola) 
	{
		Ime = ime;
		Prezime = prezime;
		VozackaDozvola = vozackaDozvola;
	}

	
	public String getIme() {
		return Ime;
	}
	public void setIme(String ime) {
		Ime = ime;
	}
	public String getPrezime() {
		return Prezime;
	}
	public void setPrezime(String prezime) {
		Prezime = prezime;
	}
	public boolean isVozackaDozvola() {
		return VozackaDozvola;
	}
	public void setVozackaDozvola(boolean vozackaDozvola) {
		VozackaDozvola = vozackaDozvola;
	}
}
