package OverLoadingvsOverriding.carExample;

import Interface.People;

public class BMW implements People{
	
	int decreaseAmount;
	int SpeedAfterIncrease;
	
	public BMW (int speed ,int doors , int decreaseAmount ,int increaseAmount) {
	 
		
		this.decreaseAmount = decreaseAmount;
		
		this.SpeedAfterIncrease = speedIncrease(increaseAmount);
		
	}
	
	public int speedIncrease(int increaseAmount) {
		
		 return 2;
	}
	
	public String toString() {
		
		return super.toString() +" decrease Amount is " + decreaseAmount+ " after increasing the speed " + SpeedAfterIncrease;
		
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String salary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String attandence() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
