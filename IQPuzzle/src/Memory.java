
public class Memory
	{
		private boolean[] canFit;
		private int row;
		private int col;
		public Memory(boolean[] cF, int r, int c)
		{
			canFit = cF;
			row = r;
			col = c;
		}
		public boolean[] getCanFit()
			{
				return canFit;
			}
		public void setCanFit(boolean[] canFit)
			{
				this.canFit = canFit;
			}
		public int getRow()
			{
				return row;
			}
		public void setRow(int row)
			{
				this.row = row;
			}
		public int getCol()
			{
				return col;
			}
		public void setCol(int col)
			{
				this.col = col;
			}
	}
