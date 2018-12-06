package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Invalid number", numberWords.toWords( -1 ) ) ;
	}
	@Test
	public void numberOutOfRangeReturnsError2() {
		Assert.assertEquals( "Error", "Invalid number", numberWords.toWords( 1000) ) ;
	}

	@Test
	public void numberOnes() {
		Assert.assertEquals( "Pass", "nine", numberWords.toWords( 9) ) ;
	}
	@Test
	public void numberTens() {
		Assert.assertEquals( "Pass", "eleven", numberWords.toWords(11) ) ;
	}
	@Test
	public void numberTens2() {
		Assert.assertEquals( "Pass", "nineteen", numberWords.toWords(19) ) ;
	}
	@Test
	public void numberTensHigher() {
		Assert.assertEquals( "Pass", "twenty-one", numberWords.toWords(21) ) ;
	}
	@Test
	public void numberHundred() {
		Assert.assertEquals( "Pass", "three hundred", numberWords.toWords(300) ) ;
	}
	@Test
	public void numberHundred2() {
		Assert.assertEquals( "Pass", "two hundred and twenty-one", numberWords.toWords(221) ) ;
	}
	@Test
	public void numberHundred3() {
		Assert.assertEquals( "Pass", "nine hundred and ninety-nine", numberWords.toWords(999) ) ;
	}
	@Test
	public void numberHundred4() {
		Assert.assertEquals( "Pass", "nine hundred and one", numberWords.toWords(901) ) ;
	}
}
