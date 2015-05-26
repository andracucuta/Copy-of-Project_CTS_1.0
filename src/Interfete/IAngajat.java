package Interfete;

import java.util.List;

public interface IAngajat {

	public IAngajat getChild (int i);
	public String getName();
	public double getSalary();
	public String toString();
	public String validareEmail(String e);
	public String validareEmail2(String e);
	public boolean validarePrefix(String nrTel);
	public int validareLungime(String nrTel);
	public void addReclamatie(IAngajat ang);
	public void stergeReclamatie(IAngajat ang);
	public List<IAngajat> getReclamatii();
	public String concatenate(String nume,String prenume);
	public double addPrima(double salariu, double prima);
	
}
