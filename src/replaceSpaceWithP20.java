import java.util.Arrays;


public class replaceSpaceWithP20 {
	public static void replaceWith(char[] str, char from, char[] to, int strLength)
	{
		int fromTimes = 0;
		int toSize = to.length-1;
		
		for(char c : str)
			if(c == from)
				fromTimes++;
		
		for(int i = strLength-1; i >= 0; i--)
			if(str[i] == from)
			{
				fromTimes--;
				insertIntoIndex(str, i + fromTimes*toSize, to);
			}
			else
				str[i + fromTimes*toSize] = str[i];
	}
	
	private static void insertIntoIndex(char[] str, int index, char[] insertee)
	{
		for(int j = 0; j < insertee.length; j++)
			str[index + j] = insertee[j];
	}
	
	public static void replaceSWithP20(char[] str, int strLength)
	{
		replaceWith(str, ' ', "%20".toCharArray(), strLength);
	}
	
	public static void main(String[] args)
	{
		String str = "123 456 789  10 ";
		char[] str1 = new char[200];
		
		for(int i = 0; i < str.length(); i++)
			str1[i] = str.charAt(i);
		
		char[] str2 = "123%20456%20789%2010%20".toCharArray();
		
		replaceSWithP20(str1, str.length());
		
		assert Arrays.equals(str1, str2);
	}
}
