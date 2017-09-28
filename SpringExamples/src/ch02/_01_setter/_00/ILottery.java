package ch02._01_setter._00;

import java.util.Collection;

public interface ILottery {

	public abstract void setLowerBound(int lowerBound);

	public abstract void setUpperBound(int upperBound);

	public abstract void setBallNumber(int ballNumber);

	public abstract Collection<Integer> getLuckyNumbers();

}