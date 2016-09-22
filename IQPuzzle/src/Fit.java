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
								for (int i = 0; i < Bead1.getRotate0().length; i++)
									{
										canFit[0] = (matrix[r+Bead1.getRotate0()[i][0]][c+Bead1.getRotate0()[i][1]].getColor().equals("o"));
									}
								canFit[1] = true;
								for (int i = 0; i < Bead1.getRotate1().length; i++)
									{
										canFit[1] = (matrix[r+Bead1.getRotate1()[i][0]][c+Bead1.getRotate1()[i][1]].getColor().equals("o"));
									}
								canFit[2] = true;
								for (int i = 0; i < Bead1.getRotate2().length; i++)
									{
										canFit[2] = (matrix[r+Bead1.getRotate2()[i][0]][c+Bead1.getRotate2()[i][1]].getColor().equals("o"));
									}
								canFit[3] = true;
								for (int i = 0; i < Bead1.getRotate3().length; i++)
									{
										canFit[3] = (matrix[r+Bead1.getRotate3()[i][0]][c+Bead1.getRotate3()[i][1]].getColor().equals("o"));
									}
								canFit[4] = true;
								for (int i = 0; i < Bead1.getRotate0flip().length; i++)
									{
										canFit[4] = (matrix[r+Bead1.getRotate0flip()[i][0]][c+Bead1.getRotate0flip()[i][1]].getColor().equals("o"));
									}
								canFit[5] = true;
								for (int i = 0; i < Bead1.getRotate1flip().length; i++)
									{
										canFit[5] = (matrix[r+Bead1.getRotate1flip()[i][0]][c+Bead1.getRotate1flip()[i][1]].getColor().equals("o"));
									}
								canFit[6] = true;
								for (int i = 0; i < Bead1.getRotate2flip().length; i++)
									{
										canFit[6] = (matrix[r+Bead1.getRotate2flip()[i][0]][c+Bead1.getRotate2flip()[i][1]].getColor().equals("o"));
									}
								canFit[7] = true;
								for (int i = 0; i < Bead1.getRotate3flip().length; i++)
									{
										canFit[7] = (matrix[r+Bead1.getRotate3flip()[i][0]][c+Bead1.getRotate3flip()[i][1]].getColor().equals("o"));
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
			for (int i = 0; i < matrix.length; i++)
				{
					for (int x = 0; x < matrix[0].length; x++)
						{
							if (matrix[i][x].getColor().equals("o"))
								{
									for (int j = 0; j < bead1Place.size(); j++)
										{
											if (bead1Place.get(j).getRow() == i && bead1Place.get(j).getCol() == x)
												{
													fitPosition = bead1Place.get(j);
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
							for (int j = 0; j < Bead1.getRotate0().length; j++)
								{
									
								}
						}
				}
			return matrix;
		}
	}
