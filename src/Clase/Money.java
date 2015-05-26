package Clase;

import Interfete.IMoney;

public class Money implements IMoney{
	private int mAmmount;
	private String currency;
	

	public Money(int mAmmount, String currency) {
		this.mAmmount = mAmmount;
		this.currency = currency;
	}

	public int getmAmmount() {
		return mAmmount;
	}

	public void setmAmmount(int mAmmount) {
		this.mAmmount = mAmmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public Boolean verificare(Money m1)
	{
		if((m1.getCurrency().equals(this.getCurrency()))&& (m1.getmAmmount()==this.getmAmmount()))
			return true;
		else
			return false;
	}

	@Override
	public IMoney addMoney(Money m) {
		if(m.getCurrency().equals(this.getCurrency()))
			return new Money(this.getmAmmount()+m.getmAmmount(),this.getCurrency());
		else 
			return this;
	}

	@Override
	public IMoney substract(IMoney m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMoney multiply(int f) {
		return new Money(this.getmAmmount()*f,this.getCurrency());
	}

}
