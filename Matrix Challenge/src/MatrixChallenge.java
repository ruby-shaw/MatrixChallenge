
public class MatrixChallenge
	{

		public static void main(String[] args)
			{
				
				int [ ] [ ] myArray = {{3, 5, 9, 2, -1, 8, 13}, {-2, 5, 1, 11, 8, 2, 0}, {9, 1, -3, 4, 8, 4, 8}, {6, 0, 0, -1, 4, 12, 7}, {2, 6, -1, 5, 3, 10, 1}, {2, 5, 1, 2, 9, 2, 3}, {-3, 1, 1, 4, 11, 12, 4}};
				int maxNum = Integer.MIN_VALUE;
				int minNum = Integer.MAX_VALUE;
				double sum =0.0;
				
				for(int row =0; row < myArray.length; row++)
					{
						for (int col =0; col < myArray[0].length; col++)
							{
								 sum = sum + myArray[row][col];
								if(myArray[row][col] > maxNum)
									{
										maxNum = myArray[row][col];
									}
								else if (myArray[row][col] < minNum)
									{
										minNum = myArray[row][col];
									}
							}
					}
				double mean = sum / (myArray.length * myArray[0].length);
				System.out.println("The largest number is " + maxNum + ", the smallest number is " + minNum+ ", and the mean is " + mean);
				

			}

	}
