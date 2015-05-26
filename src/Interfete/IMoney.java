package Interfete;

import Clase.Money;

public interface IMoney {

	public abstract IMoney addMoney(Money m);
	public abstract IMoney substract(IMoney m);
	public abstract IMoney multiply(int f);
}
