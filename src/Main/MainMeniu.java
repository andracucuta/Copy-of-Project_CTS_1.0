package Main;

import java.io.IOException;

import Clase.Angajat;
import Clase.Bucatar;
import Clase.Chelner;
import Clase.ComandaBurger;
import Clase.Manager;
import Clase.Meniu;
import Clase.MeniuBuilder;
import Clase.comandaSupa;
import Interfete.IAngajat;



public class MainMeniu {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		//Builder	
		MeniuBuilder meniuBuilder = new MeniuBuilder();
		
		Meniu meniuVeg = meniuBuilder.PreparaMeniuVegetal();
		System.out.println("Meniul vegetarian contine: ");
		meniuVeg.ContinutMeniu();
		System.out.println("Cost Total: " + meniuVeg.Cost());
		
		Meniu meniuNonVeg = meniuBuilder.PreparaMeniuNonVegetarian();
		System.out.println("Meniul non-vegetarian contine: ");
		meniuNonVeg.ContinutMeniu();
		System.out.println("Cost Total: " + meniuNonVeg.Cost());

		
		//Command
		Bucatar bucatar = new Bucatar("Bucatar1");
		
		int nrMAsa =4;
		
		Chelner chelner = new Chelner(nrMAsa);
		chelner.preiaComanda(new ComandaBurger(bucatar, "Tip1"));
		chelner.preiaComanda(new ComandaBurger(bucatar, "Tip2"));
		chelner.preiaComanda(new comandaSupa(bucatar, "Tip1"));
		
		chelner.trimiteComenzi();
		
		
		//Composite
		IAngajat ang1 = new Bucatar("Mircea", "Andrei", "0754899832", 1500, "mirceaa@gmail.com", "Bucatar");
		IAngajat ang2 = new Manager("Tudor", "Popescu", "0734764356", 2300, "tudorp@gmail.com", "Manager");
		IAngajat ang3 = new Chelner("Vlad", "Dan", "0785243674", 1300, "vladd@gmail.com", "Chelner");
		
		Manager ang4 = new Manager("Vasilas", "Iulian", "0789435676", 2350, "vasilasI@gmail.com", "Manager");
		
		System.out.println(ang1.toString());
		System.out.println(ang2.toString());
		System.out.println(ang3.toString());
		System.out.println(ang4.toString());
		

	}

}
