package Clase;

import Interfete.IServire;
import Interfete.IProdus;

public abstract class ABauturiRacoritoare  implements IProdus{

	@Override
public IServire ambalaj()
{
	return new Sticla();
}
	
	@Override
	public abstract float pret();
}
