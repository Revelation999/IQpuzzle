
public class Generate
	{
		public static Hole[][] Matrix()
		{
			Hole matrix[][] = new Hole[10][10];
			for (int r = 0; r < 10; r++)
				{
					for (int c = 0; c < 10; c++)
						{
							if (r+c < 10 && r+c >= 6)
								{
									matrix[r][c] = new Hole("o", 0, Math.random());
								}
							else
								{
									matrix[r][c] = new Hole(" ", 1, Math.random());
								}
						}
				}
			return matrix;
		}
		/*public static Bead bead1()
		{
			
			Bead bead1 = new Bead("P", 1, )
		}*/
		
	}
