package devops.numbers;

public class NumberWords {

	public String toWords( int number ) {
		String result="";

		if(number<=0 || number>999)
			result="Invalid number";
		if(number>0 && number <20)
            result=onesAndTensToWords(number);
		if(number>=20 && number <100)
            result=tensToWords(number);
		if(number>=100 && number <1000)
            result=hundredsToWords(number,(int)1e2,"hundred");
		return result;
	}
	
	private String hundredsToWords(int number,int baseNum, String baseNumStr) {
		String result="";
		
		int hundreth=(int)(Math.floor((double)number/baseNum));
		String hundrethStr=onesAndTensToWords(hundreth)+" "+baseNumStr;
		if(number%baseNum==0) 
			result= hundrethStr;
		else
		{
			int remainder=number -hundreth*baseNum;
			if(remainder<20)
			{
			result=hundrethStr+" and "+onesAndTensToWords(remainder);
		}
			else
			{
				result=hundrethStr+" and "+tensToWords(remainder);
			}
				
		}
		return result;
	}

	
	private String tensToWords(int number) {
String result="";
int tenDigit=(int)(Math.floor((double)number/10.0));
String tenStr="";
switch(tenDigit)
{
   case 2:tenStr=  "twenty";break;
	case 3:tenStr=  "thirty";break;
	case 4:tenStr=  "forty";break;
	case 5:tenStr=  "fifty";break;
	case 6:tenStr=  "sixty";break;
	case 7:tenStr=  "seventy";break;
	case 8:tenStr=  "eighty";break;
	case 9:tenStr=  "ninety";break;
}
	
if(number%10==0)
	result=tenStr;
else
{
result=tenStr+"-"+	onesAndTensToWords(number- tenDigit*10);
}

return result;	
	}

	private String onesAndTensToWords( int number )
	{
		
		String result="";
		switch(number)
		{
		
		case 1:result=  "one";break;
		case 2:result=  "two";break;
		case 3:result=  "three";break;
		case 4:result=  "four";break;
		case 5:result=  "five";break;
		case 6:result=  "six";break;
		case 7:result=  "seven";break;
		case 8:result=  "eight";break;
		case 9:result=  "nine";break;
		case 10:result=  "ten";break;
		case 11:result=  "eleven";break;
		case 12:result=  "twelve";break;
		case 13:result=  "thirteen";break;
		case 14:result=  "fourteen";break;
		case 15:result=  "fifteen";break;
		case 16:result=  "sixteen";break;
		case 17:result=  "seventeen";break;
		case 18:result=  "eighteen";break;
		case 19:result=  "nineteen";break;
		
		
		}
		return result;	

	}

}
