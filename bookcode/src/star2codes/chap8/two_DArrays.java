package star2codes.chap8;

public class two_DArrays {

	public static void main(String[] args) 
	{
		int rows = 4;
		int cols = 3;
		double[][] arr;// = new double[5][];
		double[] rSums;
		//double[][] arr = CreateArray(rows, cols);
		arr = CreateArray(rows, cols);
		Display(arr);
		rSums = ComputeRowSums(arr);
		//CreateArray(arr, rows, cols);
	}
	
	public static double[][] CreateArray(int r, int c)
	{
		double[][] a = new double[r][c];

		//examples of higher dimensional arrays
		//boolean[][][] book = new boolean[pageCount][lineCount][wordCount];
		//int[][][][] library = new int[bookCount][pageCount][lineCount][wordCount];
		//short[][][][][] city = new short[libraryCount][bookCount][pageCount][lineCount][wordCount];
		
		// for each row
		for (int row = 0; row < a.length; row++)
		{
			// for each column in the row
			for (int column = 0; column < a[row].length; column++)
			{
				// place a random double in the cell (intersection point between a row and a column like an excel sheet)
				a[row][column] = Math.random();
			}
		}
		return a;
	}
	
	public static void Display(double[][] a)
	{
		// for each row
		for (int i = 0; i < a.length; i++)
		{
			// for each column in the row
			for (int column = 0; column < a[i].length; column++)
			{
				System.out.print(a[i][column] + "\t");
			}
			
			System.out.println();
		}
	}
	
	public static double[] ComputeRowSums(double[][] a)
	{
		double[] rowSums = new double[a.length];
		
		//is the following necessary in Java
		for (int row = 0; row < a.length; row++)
		{
			rowSums[row] = 0.0;
		}
		
		// for each row
		for (int row = 0; row < a.length; row++)
		{
			// sum all column values for the current row and 
			// call it rowSum
			for (int column = 0; column < a[row].length; column++)
			{
				rowSums[row] += a[row][column];
			}
		}		
		
		return rowSums;
	}

	public static void Display(int[][] a)
	{
		// for each row
		for (int i = 0; i < a.length; i++)
		{
			System.out.print("\t");
			// for each column in the row
			for (int column = 0; column < a[i].length; column++)
			{
				System.out.print("\t"+a[i][column] + ",\t");
			}

			System.out.println();
		}
	}
	public static void Display(String[][] a)
	{
		// for each row
		for (int i = 0; i < a.length; i++)
		{
			// for each column in the row
			for (int column = 0; column < a[i].length; column++)
			{
				System.out.print(a[i][column] + "\t");
			}

			System.out.println();
		}
	}

}
