package Clase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import Interfete.IAngajat;



public class Angajat {


	public String nume;
	public String prenume;
	public String nrTelefon;
	public String email;
	public String tipAngj; 
	public double salariu;
	public List<Angajat> reclamatii;
	
	public File fisCitire;
	
	
	public File getFisCitire() {
		return fisCitire;
	}

	public void setFisCitire(File fisCitire) {
		this.fisCitire = fisCitire;
	}

	public Angajat(String fis){ this.fisCitire=new File (fis);}
	
	public Angajat(){}
	
	public Angajat(String nume, String prenume, String nrTelefon, String email,
			String tipAngj, double salariu) {
		
		this.nume = nume;
		this.prenume = prenume;
		if(nrTelefon.length()==10)
		{
		this.nrTelefon = nrTelefon;
		}
		else
			throw new IllegalArgumentException("CNP-ul nu este corect");
		this.email = email;
		this.tipAngj = tipAngj;
		this.salariu=salariu;
		this.reclamatii = new ArrayList<Angajat>();
	}
	
	public void addReclamatie(Angajat ang)
	{
		reclamatii.add(ang);
	}
	
	public void stergeReclamatie(Angajat ang)
	{
		reclamatii.remove(ang);
	}
	
	public List<Angajat> getReclamatii()
	{
		return reclamatii;
	}

	@Override
	public String toString() {
		return "Angajat [nume=" + nume + ", prenume=" + prenume
				+ ", nrTelefon=" + nrTelefon + ", email=" + email
				+ ", tipAngj=" + tipAngj + ", reclamatii=" + reclamatii + "]";
	}
	
	   
	   public boolean validarePrefix(String nrTel)
	   {
		   return nrTel.startsWith("07");
	   }
	   
	   public String VerificareFormatNumar(String numarTelefon){
			String retea = "Numar invalid";
			
			if(numarTelefon.equalsIgnoreCase(null))
				return retea;
			if(numarTelefon.startsWith("072"))
			{
				retea = "Vodafone";
				return retea;
			}
			if(numarTelefon.startsWith("074"))
				{
				retea = "Orange";
				return retea;
				}
			if(numarTelefon.startsWith("076"))
			{
				retea = "Telekom";
				return retea;
			}
			return retea;
		}
	   
	   public int validareLungime(String nrTel)
	   {
		   if(nrTel.length()==10)
			   return 1;
		   else return 0;
	   }
	   
	   public String validareEmail(String e)
	   {
		   if(e.contains("@")) return "email corect";
		   else return "email gresit";
		   
	   }
	   
	   public String validareEmail2(String e)
	   {
		   if(e.endsWith(".com")||e.endsWith(".ro"))
			   return "Email corect.";
		   else return "Email gresit.";
	   }
	
	
	  
	
}
