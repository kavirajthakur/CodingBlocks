package lec22;

public class Cars {
		private String color;
		private int price;
		private int speed;
		Cars(String color,int price, int speed) {
			this.color=color;
			this.price=price;
			this.speed=speed;
		}
		public void Display() {
			System.out.println("c"+this.color+"p"+ this.price+"s"+this.speed);
		}
		public void setprice(int p) {
			// TODO Auto-generated method stub
			this.price=p;
			
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public int getprice() {
			// TODO Auto-generated method stub
			return this.price;
		}
	}