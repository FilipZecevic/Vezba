
package vezba;

public class Kamion extends Vozilo 
{
	private String TipVozila;
	private String Boja;
	private Vozac Vozac; 
	
	
	@Override
	public int CenaGorivaNa100Km(int CenaGorivaPoLitri)
	{
		return CenaGorivaPoLitri * 16;
	}
	@Override
	public String toString()
	{
		return "Tip vozila: " + this.TipVozila + " Boja: " + this.Boja + " " + this.Vozac.toString();
	}
	
	public Kamion() 
	{
	}
	public Kamion(String tipVozila, String boja, vezba.Vozac vozac)
	{
		TipVozila = tipVozila;
		Boja = boja;
		Vozac = vozac;
	}
}
