package Clase;


import java.util.ArrayList;

import Interfete.IProdus;

public class Meniu {

	private ArrayList <IProdus> produse = new ArrayList <IProdus>();


	public void adaugaProdus (IProdus produs)
	{
		produse.add(produs);
	}
	
	public  float Cost()
	{
		float cost =0.0f;
		for (IProdus prod : produse)
		{
			cost += prod.pret();
		}
		return cost;
	}
	
	public void ContinutMeniu()
	{
		for (IProdus prod : produse)
		{
			System.out.println("Produsul: " + prod.nume() + " Tip servire: " + prod.ambalaj().tipServire() + " cu un cost de: " + prod.pret());
			
		}
	}
	
	public String tipMeniu()
	{
		return "Meniu Basic";
	}
}
