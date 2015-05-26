package Clase;

public class AngajatSalariu {

	public double calculazaSalariuAnlual(Angajat angajat)
	{
		double salAnual=0;
		salAnual = angajat.salariu *12;
		return salAnual;
	}
	
	//evaluare angajat
	public double calculareEvaluare (Angajat angajat)
	{
		double prima=0;
		if(angajat.salariu <1500)
		{
			prima=520;
		}
		else
		{
			prima=980;
		}
		return prima;
	}
}
