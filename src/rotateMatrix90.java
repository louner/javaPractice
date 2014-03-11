
public class rotateMatrix90 {
	class Pixel
	{
		int value;
		int R;
		int G;
		int B;
	}
	
	public void rotate90(Pixel[][] img, boolean isClockWise)
	{
		int D = img.length;
		
		for(int i = 0; i < D; i++)
			for(int j = i; j < D; j++)
				if(isClockWise)
				{
					int jTmp = j;
					j = j - i;
					swap(img, i, j, D-j-1, D-i-1);
					j = jTmp;
				}
				else
					swap(img, i, j, j, i);
	}
	
	public static void swap(Pixel[][] img, int ai, int aj, int bi, int bj)
	{
		Pixel tmp = img[ai][bi];
		img[ai][bi] = img[bi][bj];
		img[bi][bj] = tmp;
	}
	
	public static void setImg(Pixel[][] img, int[] values)
	{
		int k = 0;
		for(int i = 0; i < img.length; i++)
			for(int j = 0; j < img.length; j++)
			{
				img[i][j].value = values[k];
				k++;
			}
	}
	
	public static boolean isEqual(Pixel[][] img1, Pixel[][] img2)
	{
		for(int i = 0; i < img1.length; i++)
			for(int j = 0; j < img1.length; j++)
				if(img1[i][j] != img2[i][j])
					return false;
		
		return true;
	}
	
	public static void main(String[] args)
	{
		Pixel[][] img = new Pixel[3][3];
		Pixel[][] imgClock = new Pixel[3][3];
		Pixel[][] imgCounterClock = new Pixel[3][3];
		
		setImg(img, new int[]{1,2,3,4,5,6,7,8,9});
		setImg(imgClock, new int[]{1,2,3,4,5,6,7,8,9});
		
	}
}
