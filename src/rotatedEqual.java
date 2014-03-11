import java.util.Random;

public class rotatedEqual {
	
	public static String rotateString(String str, int times)
	{
		if(times == 0)
			times++;

		return str.substring(times, str.length()) + str.substring(0, times);
	}

	static boolean isRotatedEqual(String s1, String s2)
	{
		if(s1.length() != s2.length())
			return false;
		
		String s3 = s1 + s1;
		return s3.contains(s2);
	}
	
	public static void main(String[] args)
	{
		Random rand = new Random();
		String string = "0123456789";
		String stringRotated = rotateString(string, rand.nextInt(string.length()));
		
		assert isRotatedEqual(string, stringRotated);
	}
}
