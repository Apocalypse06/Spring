package ch02._01_setter._00;

import java.util.ArrayList;
import java.util.Collection;

public class LotteryBeanNumberDuplicated implements ILottery {
    private int lowerBound;
    private int upperBound;
    private int ballNumber;
	public LotteryBeanNumberDuplicated() {
	}	
	@Override
	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}	
	@Override
	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}	
	@Override
	public void setBallNumber(int ballNumber) {
		this.ballNumber = ballNumber;
	}	
	@Override
	public Collection<Integer> getLuckyNumbers() {
	    ArrayList<Integer> set = new ArrayList<Integer>();
	    while (set.size() < ballNumber ) {
	    	int num = (int)(Math.random()* (upperBound-lowerBound+1)) + lowerBound;
	    	set.add(num);
	    }
		return set;
	}	
}
