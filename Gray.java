/**
 * Gray Code
 * 
 * @author Mihajlovsky
 *
 */
public class Gray {

	public static void main(String[] args) {
		
		String number="101010";
		
		System.out.println(grayCode(number));
	}

	
	public static String grayCode(String number)
	{
		String finalNumber="";
		
		for (int i=0;i<number.length();i++)
		{
			if (i==0)
			{
				finalNumber+=number.charAt(i);
			}
			else
			{
				finalNumber+=number.charAt(i)^number.charAt(i-1);				
			}
		}
				
		return finalNumber;
		
	}
}
