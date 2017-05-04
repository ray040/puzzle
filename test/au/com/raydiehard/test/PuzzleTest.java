package au.com.raydiehard.test;


import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import au.com.raydiehard.Puzzle;

public class PuzzleTest {

	Puzzle puzzle = new Puzzle();
		
	@Test
	public void testN5C2(){
		BigInteger n = new BigInteger("5");
		BigInteger c = new BigInteger("2");
		BigInteger result = puzzle.getResult(n, c);
		System.out.println(result);
		Assert.assertEquals(new BigInteger("21"), result);
	}

	@Test
	public void testN100C10(){
		BigInteger n = new BigInteger("100");
		BigInteger c = new BigInteger("10");
		BigInteger result = puzzle.getResult(n, c);
		System.out.println(result);
	}
	
	@Test
	public void testN1000000C200(){
		BigInteger n = new BigInteger("1000000");
		BigInteger c = new BigInteger("200");
		BigInteger result = puzzle.getResult(n, c);
		System.out.print("First ten digits only: ");
		String substring = result.toString().substring(0, 10);
		System.out.println("First ten digits only: " + substring);
	}
	
	@Test
	public void testN10000000C200(){
		BigInteger n = new BigInteger("10000000");
		BigInteger c = new BigInteger("200");
		BigInteger result = puzzle.getResult(n, c);
		System.out.print("First ten digits only: ");
		String substring = result.toString().substring(0, 10);
		System.out.println("First ten digits only: " + substring);
	}
}
