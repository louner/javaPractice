import java.util.Arrays;

public class zeroRowColumnOfzero {
	public static void zeroRowColumn(int[][] matrix)
	{
		boolean[] rowToZero = new boolean[matrix.length];
		boolean[] columnToZero = new boolean[matrix[0].length];
		
		Arrays.fill(rowToZero, false);
		Arrays.fill(columnToZero, false);
		
		for(int i = 0; i < matrix.length; i++)
			for(int j = 0; j < matrix[0].length; j++)
				if(matrix[i][j] == 0)
				{
					rowToZero[i] = true;
					columnToZero[j] = true;
				}
		
		for(int i = 0; i < matrix.length; i++)
			if(rowToZero[i])
				Arrays.fill(matrix[i], 0);
		
		for(int j = 0; j < matrix[0].length; j++)
			if(columnToZero[j])
				for(int i = 0; i < matrix.length; i++)
					matrix[i][j] = 0;
	}
	
	public static boolean zeroIsSet(int[][] matrix, int[] rows, int[] columns)
	{
		for(int zp = 0; zp < rows.length; zp++)
		{
			int i = rows[zp];
			int j = columns[zp];
			
			for(int jj = 0; jj < matrix[0].length; jj++)
				if(matrix[i][jj] != 0)
					return false;

			for(int ii = 0; ii < matrix.length; ii++)
				if(matrix[ii][j] != 0)
					return false;
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		int[][] matrix = new int[30][40];
		int[] rows = new int[]{2, 11};
		int[] columns = new int[]{10, 0};
		
		matrix[2][11] = 0;
		matrix[10][0] = 0;
		
		zeroRowColumn(matrix);
		assert zeroIsSet(matrix, rows, columns);
	}
}
