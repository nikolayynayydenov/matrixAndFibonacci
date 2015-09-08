import java.util.Arrays;
import java.util.Random;

public class Matrix {
	
	private static final int M = 200;
	private static final int N = 100;
	
	private static Random randomGenerator = new Random();
	
	private static int[][] createSampleMatrix() {
		
		int matrix[][] = new int[M][N];		
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = randomGenerator.nextInt();
			}
		}
		
//		int matrix[][] = {{3,6,2},
//				{8, 2, 5},
//				{1, 6, 3},
//				{0,6,6}};
		
		for (int i = 0; i < matrix[0].length; i++)
		{				
			
			int tempArr[] = new int[matrix.length];
			
			for (int k = 0; k < tempArr.length; k++) {
				tempArr[k] = matrix[k][i];
			}
			
			Arrays.sort(tempArr);
			if(randomGenerator.nextBoolean()){
				for(int j = 0; j < tempArr.length / 2; j++)
				{
					int temp = tempArr[j];
				    tempArr[j] = tempArr[tempArr.length - j - 1];
				    tempArr[tempArr.length - j - 1] = temp;
				}
			}				
			
			for (int j = 0; j < tempArr.length; j++) {
				matrix[j][i] = tempArr[j];
			}			
		}
		
		return matrix;
	}
	
	
	public static void main(String args[]) {
				
		int matrix[][] = createSampleMatrix();
		
		//Code for printing the matrix:
		
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j]);
//				System.out.print(" | ");
//			}
//			
//			System.out.println();
//		}
		
		System.out.println(containsValue(6, matrix));		
	}
	
	public static boolean containsValue(int k, int matrix[][])
	{
		// Here are algorythms for checking if a martix contains a particular value "k":
		
		//1st algorythm --- O(matrix.length * matrix[i].length) = O(number of rows * number of columns)
		for (int i = 0; i < matrix.length; i++) {//O(matrix.length)
			for (int j = 0; j < matrix[i].length; j++) {//O(matrix[i].length)
				if(matrix[i][j] == k)//O(1)
				{
					return true;// O(1)
				}
			}
		}
		
		return false;
		//end of 1st algorythm		
	}
	
/*Дадена е матрица с N реда и M колони съдържаща цели числа.
 Всяка колона е сортирана по възходящ или низходящ ред.
 Да се определи сложността на алгоритъма който по зададено 
цяло число K определя дали то се съдържа в (е елемент от) матрицата.*/
}
