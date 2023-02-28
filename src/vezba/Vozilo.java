package vezba;

public class Vozilo 
{
	private String TipVozila;
	private String Boja;
	private Vozac Vozac;
	
	
	
	public int CenaGorivaNa100Km(int CenaGorivaPoLitri)
	{
		return CenaGorivaPoLitri * 8;
	}
	
	@Override
	public String toString()
	{
		return "Tip vozila: " + this.TipVozila + " Boja: " + this.Boja + " " + this.Vozac.toString();
	}
	
	public Vozilo() 
	{
	}
	public Vozilo(String tipVozila, String boja, vezba.Vozac vozac)
	{
		TipVozila = tipVozila;
		Boja = boja;
		Vozac = vozac;
	}
	
	
	public String getTipVozila() {
		return TipVozila;
	}
	public void setTipVozila(String tipVozila) {
		TipVozila = tipVozila;
	}
	public String getBoja() {
		return Boja;
	}
	public void setBoja(String boja) {
		Boja = boja;
	}
	public Vozac getVozac() {
		return Vozac;
	}
	public void setVozac(Vozac vozac) {
		Vozac = vozac;
	}
}
