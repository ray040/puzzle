package au.com.raydiehard;

import java.math.BigInteger;

public class Puzzle {

	public BigInteger getResult(BigInteger n, BigInteger c) {
		
		BigInteger result = BigInteger.ZERO;
		for (BigInteger count1 = BigInteger.ZERO; count1.compareTo(n) < 0; count1=count1.add(BigInteger.ONE)) {
			BigInteger sum = getSum(count1, count1.subtract(BigInteger.ONE), c);
			result = result.add(sum);
		}
		return result;
	}

	private BigInteger getSum(BigInteger count1, BigInteger count2, BigInteger c) {
		System.out.flush();
		System.out.println("Count 1: " + count1 + " ===== Count 2: " + count2);
		if (count2.compareTo(BigInteger.ZERO) < 0) {
			return BigInteger.ZERO;
		} else if (count2.compareTo(BigInteger.ZERO) == 0) {
			return BigInteger.ONE;
		} else if ((count1.subtract(count2).compareTo(c)) <= 0){
			return count2.add(BigInteger.ONE).multiply(getSum(count1, count2.subtract(BigInteger.ONE), c));
		}else
			return BigInteger.ONE;
	}
}
