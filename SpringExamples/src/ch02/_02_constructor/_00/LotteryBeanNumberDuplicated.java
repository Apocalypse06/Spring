package ch02._02_constructor._00;

import java.util.ArrayList;
import java.util.Collection;

public class LotteryBeanNumberDuplicated implements ILottery {
	private int lowerBound;
	private int upperBound;
	private int ballNumber;

	public LotteryBeanNumberDuplicated(int lowerBound, int upperBound,
			int ballNumber) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.ballNumber = ballNumber;
	}

	@Override
	public Collection<Integer> getLuckyNumbers() {
		ArrayList<Integer> set = new ArrayList<Integer>();
		while (set.size() < ballNumber) {
			int num = (int) (Math.random() * (upperBound - lowerBound + 1))
					+ lowerBound;
			set.add(num);
		}
		return set;
	}
}
