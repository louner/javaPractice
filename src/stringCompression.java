public class stringCompression {

	public static String stringCompress(String str)
	{
		StringBuffer sb = new StringBuffer();
		char curChar = str.charAt(0);
		int curLen = 0;
		
		for(char c : str.toCharArray())
			if(c==curChar)
				curLen++;
			else
			{	
				sb.append(curChar);
				sb.append(curLen);
				
				curChar = c;
				curLen = 1;
				
				if(sb.length() >= str.length())
					return str;
			}
		
		sb.append(curChar);
		sb.append(curLen);
		if(sb.length() >= str.length())
			return str;

		return sb.toString();
	}
		
	public static void main(String[] args)
	{
		String str1 = "aabbbcccddde";
		String str1a = "a2b3c3d3e1";
		String str2 = "abcdefg";
		
		assert stringCompress(str1).equals(str1a);
		assert stringCompress(str2).equals(str2);
	}
}
