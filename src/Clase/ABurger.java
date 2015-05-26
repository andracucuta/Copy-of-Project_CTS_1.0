package Clase;

import Interfete.IServire;
import Interfete.IProdus;

public abstract class ABurger implements IProdus {

	@Override
	public IServire ambalaj()
	{
		return new Hartie();
	}
	
	@Override
	public abstract float pret();

}
