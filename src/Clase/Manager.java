package Clase;

import java.util.ArrayList;
import java.util.List;

import Interfete.IAngajat;

public class Manager implements IAngajat {

	public String nume;
	public String prenume;
	public String nrTelefon;
	public double salariu;
	public String email;
	public String tipAngj; 
	public List<IAngajat> reclamatii;
	
	
	
	public Manager(String nume, String prenume, String nrTelefon,
			double salariu, String email, String tipAngj) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		if(nrTelefon.length()==10)
		{
		this.nrTelefon = nrTelefon;
		}
		else
			throw new IllegalArgumentException("CNP-ul nu este corect");

		this.salariu = salariu;
		this.email = email;
		this.tipAngj = tipAngj;
		this.reclamatii = new ArrayList<IAngajat>();
	}


	@Override
	public String toString() {
		return "Manager [nume=" + nume + ", prenume=" + prenume
				+ ", nrTelefon=" + nrTelefon + ", salariu=" + salariu
				+ ", email=" + email + ", tipAngj=" + tipAngj + ", reclamatii="
				+ reclamatii + "]";
	}


	@Override
	public IAngajat getChild(int i) {
		// TODO Auto-generated method stub
		return reclamatii.get(i);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return nume;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salariu;
	}

	@Override
	public String validareEmail(String e) {
		   if(e.contains("@")) return "email corect";
		   else return "email gresit";
	}

	@Override
	public String validareEmail2(String e) {
		   if(e.endsWith(".com")||e.endsWith(".ro"))
			   return "Email corect.";
		   else return "Email gresit.";
	}

	@Override
	public boolean validarePrefix(String nrTel) {
		   return nrTel.startsWith("07");
	}

	@Override
	public int validareLungime(String nrTel) {
		   if(nrTel.length()==10)
			   return 1;
		   else return 0;
	}

	@Override
	public void addReclamatie(IAngajat ang) {
		reclamatii.add(ang);	
	}

	@Override
	public void stergeReclamatie(IAngajat ang) {
		reclamatii.remove(ang);
		
	}

	@Override
	public List<IAngajat> getReclamatii() {
		return reclamatii;
	}
	
	@Override
	public String concatenate(String nume,String prenume)
	{
		return nume+prenume;
	}
	
	@Override
	public double addPrima(double salariu, double prima)
	{
		return salariu+prima;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (nume == null) {
			if (other.nume != null)
				return false;
		} else if (!nume.equals(other.nume))
			return false;
		if (prenume == null) {
			if (other.prenume != null)
				return false;
		} else if (!prenume.equals(other.prenume))
			return false;
		return true;
	}
	
	public void save(String nume)
	{
		this.save(nume);
	}

}
