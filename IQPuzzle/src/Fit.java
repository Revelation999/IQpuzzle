import java.util.ArrayList;
public class Fit
	{
		public static ArrayList <Memory> tryFit(Hole[][] matrix, Bead Bead1)
		{
			ArrayList <Memory> placesToFit = new ArrayList <Memory>();
			boolean canFit[] = new boolean[8];
			for (int r = 0; r < matrix.length; r++)
			{
				for (int c = 0; c < matrix[0].length; c++)
					{
						if (matrix[r][c].getColor().equals("o"))
							{
								canFit[0] = true;
								for (int i = 0; i < Bead1.getRotate0flip0().length; i++)
									{
										canFit[0] = (matrix[r+Bead1.getRotate0flip0()[i][0]][c+Bead1.getRotate0flip0()[i][1]].getColor().equals("o"));
									}
								canFit[1] = true;
								for (int i = 0; i < Bead1.getRotate1flip0().length; i++)
									{
										canFit[1] = (matrix[r+Bead1.getRotate1flip0()[i][0]][c+Bead1.getRotate1flip0()[i][1]].getColor().equals("o"));
									}
								canFit[2] = true;
								for (int i = 0; i < Bead1.getRotate2flip0().length; i++)
									{
										canFit[2] = (matrix[r+Bead1.getRotate2flip0()[i][0]][c+Bead1.getRotate2flip0()[i][1]].getColor().equals("o"));
									}
								canFit[3] = true;
								for (int i = 0; i < Bead1.getRotate3flip0().length; i++)
									{
										canFit[3] = (matrix[r+Bead1.getRotate3flip0()[i][0]][c+Bead1.getRotate3flip0()[i][1]].getColor().equals("o"));
									}
								canFit[4] = true;
								for (int i = 0; i < Bead1.getRotate0flip1().length; i++)
									{
										canFit[4] = (matrix[r+Bead1.getRotate0flip1()[i][0]][c+Bead1.getRotate0flip1()[i][1]].getColor().equals("o"));
									}
								canFit[5] = true;
								for (int i = 0; i < Bead1.getRotate1flip1().length; i++)
									{
										canFit[5] = (matrix[r+Bead1.getRotate1flip1()[i][0]][c+Bead1.getRotate1flip1()[i][1]].getColor().equals("o"));
									}
								canFit[6] = true;
								for (int i = 0; i < Bead1.getRotate2flip1().length; i++)
									{
										canFit[6] = (matrix[r+Bead1.getRotate2flip1()[i][0]][c+Bead1.getRotate2flip1()[i][1]].getColor().equals("o"));
									}
								canFit[7] = true;
								for (int i = 0; i < Bead1.getRotate3flip1().length; i++)
									{
										canFit[7] = (matrix[r+Bead1.getRotate3flip1()[i][0]][c+Bead1.getRotate3flip1()[i][1]].getColor().equals("o"));
									}
							}
						placesToFit.add(new Memory(canFit, r, c));
					}
			}
			
			return placesToFit;
		}
		public static Hole[][] putIn(Hole[][] matrix,Bead Bead1,Bead Bead2)
		{
			ArrayList <Memory> bead1Place = tryFit(matrix, Bead1);
			Memory fitPosition = null;
			boolean canBreak = false;
			for (int r = 0; r < matrix.length; r++)
				{
					for (int c = 0; c < matrix[0].length; c++)
						{
							if (matrix[r][c].getColor().equals("o"))
								{
									for (int i = 0; i < bead1Place.size(); i++)
										{
											if (bead1Place.get(i).getRow() == r && bead1Place.get(i).getCol() == c)
												{
													fitPosition = bead1Place.get(i);
													canBreak = true;
													break;
												}
										}
								}
							if (canBreak){break;}
						}
					if (canBreak){break;}
				}
			for (int i = 0; i < fitPosition.getCanFit().length; i++)
				{
					if (fitPosition.getCanFit()[i])
						{
							matrix[fitPosition.getRow()][fitPosition.getCol()].setColor(Bead1.getColor());
							for (int j = 0; j < Bead1.getRotate0flip0().length; j++)
								{
									
								}
						}
				}
			return matrix;
		}
	}
