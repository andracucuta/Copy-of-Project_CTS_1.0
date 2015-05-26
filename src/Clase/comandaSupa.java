package Clase;

import Interfete.IComandaBucatarie;

public class comandaSupa implements IComandaBucatarie{

	private Bucatar bucatar;
	private String tip;
	
	@Override
	public void prepara() {
		bucatar.gatesteSupa(tip);
		System.out.println("S-a comandat: " + tip);
		
	}
	
	public comandaSupa(Bucatar bucatar, String tip)
	{
		this.bucatar=bucatar;
		this.tip=tip;
	}

}
