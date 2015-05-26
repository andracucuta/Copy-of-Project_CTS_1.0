package Clase;

public class MeniuBuilder {

	public Meniu PreparaMeniuVegetal()
	{
		Meniu meniu = new Meniu();
		meniu.adaugaProdus(new BurgerVegetarian());
		meniu.adaugaProdus(new SupaDeLegume());
		return meniu;
	}
	
	public Meniu PreparaMeniuNonVegetarian()
	{
		Meniu meniu = new Meniu();
		meniu.adaugaProdus(new BurgerPui());
		meniu.adaugaProdus(new SupaLaGrec());
		return meniu;
	}
}
