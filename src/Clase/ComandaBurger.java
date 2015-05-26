package Clase;

import Interfete.IComandaBucatarie;

public class ComandaBurger implements IComandaBucatarie{

	private Bucatar bucatar;
	private String tip;
	
	@Override
	public void prepara() {
		bucatar.preparaBurger(tip);
		System.out.println("S-a comandat: " + tip);
		
	}
	
	public ComandaBurger(Bucatar bucatar, String tip)
	{
		this.bucatar=bucatar;
		this.tip=tip;
	}
}
