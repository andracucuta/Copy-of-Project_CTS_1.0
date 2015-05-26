package Clase;
import java.util.ArrayList;
import java.util.List;

import Interfete.IAngajat;
import Interfete.IComandaBucatarie;

public class Chelner implements IAngajat {
 public ArrayList <IComandaBucatarie> comenzi;
 int nrMasa;
 
	public String nume;
	public String prenume;
	public String nrTelefon;
	public double salariu;
	public String email;
	public String tipAngj; 
	public List<IAngajat> reclamatii;
	
	
 
 public Chelner(String nume, String prenume, String nrTelefon,
			double salariu, String email, String tipAngj,
			List<IAngajat> reclamatii) {
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
		this.reclamatii = reclamatii;
	}

public Chelner(String nume, String prenume, String nrTelefon,
			double salariu, String email, String tipAngj) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.nrTelefon = nrTelefon;
		this.salariu = salariu;
		this.email = email;
		this.tipAngj = tipAngj;
		this.reclamatii = new ArrayList<IAngajat>();
	}

public Chelner(int nrMasa)
 {
	 this.nrMasa=nrMasa;
	 comenzi= new ArrayList<IComandaBucatarie>();
 }
 
 public void preiaComanda(IComandaBucatarie comanda)
 {
	 this.comenzi.add(comanda);
 }
 
 public void trimiteComenzi()
 {
	 for(IComandaBucatarie comanda : comenzi)
	 {
		 comanda.prepara();
	 }
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
	public String concatenate(String nume, String prenume) {
		// TODO Auto-generated method stub
		return nume+prenume;
	}
	
	@Override
	public double addPrima(double salariu, double prima)
	{
		return salariu+prima;
	}

}
