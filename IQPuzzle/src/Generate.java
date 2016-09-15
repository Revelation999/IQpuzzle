
public class Generate
	{
		public static Hole[][] Matrix()
		{
			Hole matrix[][] = new Hole[10][10];
			for (int r = 0; r < 10; r++)
				{
					for (int c = 0; c < 10; c++)
						{
							matrix[r][c] = (r+c<10&&r+c>=6)?new Hole("o", 0, Math.random()):new Hole(" ", 1, Math.random());
						}
				}
			return matrix;
		}
		public static Bead bead1()
		{
			int r0f0[][] = {{0,1}, {0,2}, {0,3}, {1,0}};
			int r1f0[][] = {{0,-1}, {1,0}, {2,0}, {3,0}};
			int r2f0[][] = {{0,-3}, {0,-2}, {0,-1}, {-1,0}};
			int r3f0[][] = {{-3,0}, {-2,0}, {-1,0}, {0,1}};
			int r0f1[][] = {{-1,0}, {0,1}, {0,2}, {0,3}};
			int r1f1[][] = {{0,1}, {1,0}, {2,0}, {3,0}};
			int r2f1[][] = {{0,-3}, {0,-2}, {0,-1}, {1,0}};
			int r3f1[][] = {{0,-1}, {-3,0}, {-2,0}, {-1,0}};
			Bead bead1 = new Bead("P", 1, r0f0, r1f0, r2f0, r3f0, r0f1, r1f1, r2f1, r3f1);
			return bead1;
		}
		public static Bead bead2()
		{
			int r0f0[][] = {{0,1}, {1,1}, {1,2}, {2,2}};
			int r1f0[][] = {{1,0}, {1,-1}, {2,-1}, {2,-2}};
			int r2f0[][] = {{0,-1}, {-1,-1}, {-1,-2}, {-2,-2}};
			int r3f0[][] = {{-1,0}, {-1,1}, {-2,1}, {-2,2}};
			int r0f1[][] = {{1,0}, {1,-1}, {2,-1}, {2,-2}};
			int r1f1[][] = {{0,-1}, {-1,-1}, {-1,-2}, {-2,-2}};
			int r2f1[][] = {{-1,0}, {-1,1}, {-2,1}, {-2,2}};
			int r3f1[][] = {{0,1}, {1,1}, {1,2}, {2,2}};
			Bead bead2 = new Bead("O", 2, r0f0, r1f0, r2f0, r3f0, r0f1, r1f1, r2f1, r3f1);
			return bead2;
		}
		
	}
