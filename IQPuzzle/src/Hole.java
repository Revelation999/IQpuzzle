
public class Hole
	{
		private String color;
		private int filled;
		private double random;
		public String getColor()
			{
				return color;
			}
		public void setColor(String color)
			{
				this.color = color;
			}
		public double getRandom()
			{
				return random;
			}
		public void setRandom(double random)
			{
				this.random = random;
			}
		public Hole (String c, int f, double r)
		{
			color = c;
			filled = f;
			random = r;
		}
		public int getFilled()
			{
				return filled;
			}
		public void setFilled(int filled)
			{
				this.filled = filled;
			}
	}
