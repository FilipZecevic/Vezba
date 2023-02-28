
package vezba;

public class Kamion extends Vozilo 
{

	
	
	@Override
	public int CenaGorivaNa100Km(int CenaGorivaPoLitri)
	{
		return CenaGorivaPoLitri * 16;
	}
	
	public Kamion() 
	{
	}
	public Kamion(String tipVozila, String boja, vezba.Vozac vozac)
	{
		super(tipVozila, boja, vozac);
	}
}
