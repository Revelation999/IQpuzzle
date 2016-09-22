
public class Bead
	{
		/*
		 Steve, 
		 After spending days reading your code, I'd like to say it is a work of genius. It was incredibly hard to understand, and I'd attribute that to how you think differently 
		 than myself. And that is probably from the fact you aren't originally from America, which is awesome in itself.
		 */
		private String color;
		private int number;
		private int rotate0 [][];
		private int rotate1 [][];
		private int rotate2 [][];
		private int rotate3 [][];
		private int rotate0flip [][];
		private int rotate1flip [][];
		private int rotate2flip [][];
		private int rotate3flip [][];
		public Bead(String c, int n, int [][] r0f0, int [][] r1f0, int [][] r2f0, int[][] r3f0, int [][] r0f1, int [][] r1f1, int [][] r2f1, int [][] r3f1)
		{
			color = c;
			number = n;
			rotate0 = r0f0;
			rotate1 = r1f0;
			rotate2 = r2f0;
			rotate3 = r3f0;
			rotate0flip = r0f1;
			rotate1flip = r1f1;
			rotate2flip = r2f1;
			rotate3flip = r3f1;
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
		public int[][] getRotate0()
			{
				return rotate0;
			}
		public void setRotate0(int[][] rotate0flip0)
			{
				this.rotate0 = rotate0flip0;
			}
		public int[][] getRotate1()
			{
				return rotate1;
			}
		public void setRotate1(int[][] rotate1flip0)
			{
				this.rotate1 = rotate1flip0;
			}
		public int[][] getRotate2()
			{
				return rotate2;
			}
		public void setRotate2(int[][] rotate2flip0)
			{
				this.rotate2 = rotate2flip0;
			}
		public int[][] getRotate3()
			{
				return rotate3;
			}
		public void setRotate3(int[][] rotate3flip0)
			{
				this.rotate3 = rotate3flip0;
			}
		public int[][] getRotate0flip()
			{
				return rotate0flip;
			}
		public void setRotate0flip(int[][] rotate0flip1)
			{
				this.rotate0flip = rotate0flip1;
			}
		public int[][] getRotate1flip()
			{
				return rotate1flip;
			}
		public void setRotate1flip(int[][] rotate1flip1)
			{
				this.rotate1flip = rotate1flip1;
			}
		public int[][] getRotate2flip()
			{
				return rotate2flip;
			}
		public void setRotate2flip(int[][] rotate2flip1)
			{
				this.rotate2flip = rotate2flip1;
			}
		public int[][] getRotate3flip()
			{
				return rotate3flip;
			}
		public void setRotate3flip(int[][] rotate3flip1)
			{
				this.rotate3flip = rotate3flip1;
			}
	}
