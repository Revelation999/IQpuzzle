
public class Bead
	{
		private String color;
		private int number;
		private int rotate0flip0 [][];
		private int rotate1flip0 [][];
		private int rotate2flip0 [][];
		private int rotate3flip0 [][];
		private int rotate0flip1 [][];
		private int rotate1flip1 [][];
		private int rotate2flip1 [][];
		private int rotate3flip1 [][];
		public Bead(String c, int n, int [][] r0f0, int [][] r1f0, int [][] r2f0, int[][] r3f0, int [][] r0f1, int [][] r1f1, int [][] r2f1, int [][] r3f1)
		{
			color = c;
			number = n;
			rotate0flip0 = r0f0;
			rotate1flip0 = r1f0;
			rotate2flip0 = r2f0;
			rotate3flip0 = r3f0;
			rotate0flip1 = r0f1;
			rotate1flip1 = r1f1;
			rotate2flip1 = r2f1;
			rotate3flip1 = r3f1;
		}
		public int getNumber()
			{
				return number;
			}
		public void setNumber(int number)
			{
				this.number = number;
			}
		public String getColor()
			{
				return color;
			}
		public void setColor(String color)
			{
				this.color = color;
			}
		public int[][] getRotate0flip0()
			{
				return rotate0flip0;
			}
		public void setRotate0flip0(int[][] rotate0flip0)
			{
				this.rotate0flip0 = rotate0flip0;
			}
		public int[][] getRotate1flip0()
			{
				return rotate1flip0;
			}
		public void setRotate1flip0(int[][] rotate1flip0)
			{
				this.rotate1flip0 = rotate1flip0;
			}
		public int[][] getRotate2flip0()
			{
				return rotate2flip0;
			}
		public void setRotate2flip0(int[][] rotate2flip0)
			{
				this.rotate2flip0 = rotate2flip0;
			}
		public int[][] getRotate3flip0()
			{
				return rotate3flip0;
			}
		public void setRotate3flip0(int[][] rotate3flip0)
			{
				this.rotate3flip0 = rotate3flip0;
			}
		public int[][] getRotate0flip1()
			{
				return rotate0flip1;
			}
		public void setRotate0flip1(int[][] rotate0flip1)
			{
				this.rotate0flip1 = rotate0flip1;
			}
		public int[][] getRotate1flip1()
			{
				return rotate1flip1;
			}
		public void setRotate1flip1(int[][] rotate1flip1)
			{
				this.rotate1flip1 = rotate1flip1;
			}
		public int[][] getRotate2flip1()
			{
				return rotate2flip1;
			}
		public void setRotate2flip1(int[][] rotate2flip1)
			{
				this.rotate2flip1 = rotate2flip1;
			}
		public int[][] getRotate3flip1()
			{
				return rotate3flip1;
			}
		public void setRotate3flip1(int[][] rotate3flip1)
			{
				this.rotate3flip1 = rotate3flip1;
			}
	}
