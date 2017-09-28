package ch02Anno._05;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("uni")
public class LotteryBeanNumberUnique implements ILottery {
	@Value("1")
    private int lowerBound;
	@Value("5")
    private int upperBound;
	@Value("3")
    private int ballNumber;
	public LotteryBeanNumberUnique() {
	}
	@Override
	public void setLowerBound(int lowerBound) {  // setter，性質名稱為lowerBound
		this.lowerBound = lowerBound;
	}
	@Override
	public void setUpperBound(int upperBound) {  // setter，性質名稱為upperBound
		this.upperBound = upperBound;
	}
	@Override
	public void setBallNumber(int ballNumber) {  // setter，性質名稱為ballNumber
		this.ballNumber = ballNumber;
	}
	@Override
	public Collection<Integer> getLuckyNumbers() {
	    Set<Integer> set = new TreeSet<Integer>();
	    while (set.size() < ballNumber ) {
	    	int num = (int)(Math.random() * (upperBound-lowerBound+1)) + lowerBound;
	    	set.add(num);
	    }
		return set;
	}	
}